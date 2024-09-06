import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightSideView {
    public static class  Node {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
    public static ArrayList<Integer> rightSideView(Node root)
    {
        ArrayList<Integer> result= new ArrayList<>();
        if (root==null) {
            return result;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int level=q.size();
            
            for(int i=0;i<level;i++)
            {
                Node currNode=q.poll();
                if (i==level-1) {
                    result.add(currNode.val);
                }
                if (currNode.left!=null) {
                    q.offer(currNode.left);

                }
                if (currNode.right!=null) {
                    q.offer(currNode.right);
                }
            }
            
            
        }
        return result;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    ArrayList<Integer> list=rightSideView(root);
    System.out.println(list);
    }
}
