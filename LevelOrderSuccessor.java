import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {
    public static class  Node {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
    public static Node levelSuccssor(Node root,int key)
    {
        if (root==null) {
            return null;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node curr=q.poll();
            if (root.left!=null) {
                q.offer(root.left);
            }
            if (root.right!=null) {
                q.offer(root.right);
            }
            if (curr.val==key) {
                break;
            }
            
        }
        return q.peek();
    }
    public static void main(String[] args) {
        Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    Node LOS=levelSuccssor(root, 5);
    System.out.println(LOS.val);
    }
}
