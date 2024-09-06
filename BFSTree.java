import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {
    public static class  Node {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
   static ArrayList<ArrayList<Integer>> levelOrder(Node root)
   {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        Queue q=new LinkedList<>();
        if (root==null) {
            return result;
        }
        q.offer(root);

        while (!q.isEmpty()) {
            int currLevel=q.size();
            
            ArrayList<Integer> currList=new ArrayList<>(currLevel);
            for(int i=0;i<currLevel;i++)
            {
                Node currNode=(BFSTree.Node) q.poll();
                currList.add(currNode.val);
                if (currNode.left!=null) {
                    q.offer(currNode.left);

                }
                if (currNode.right!=null) {
                    q.offer(currNode.right);
                }
                
            }
            result.add(currList);
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
    ArrayList<ArrayList<Integer>> list=levelOrder(root);
    for (ArrayList<Integer> arrayList : list) {
       System.out.print(arrayList);
    }
   }
}
