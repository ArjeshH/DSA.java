import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {
    public static class  Node {
        int val;
        Node left;
        IsSymmetric.Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
    static boolean isSymmetric(Node root)
    {
        if (root==null) {
            return true;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while (!q.isEmpty()) {
            Node left=q.poll();
            Node right=q.poll();
            if (left==null && right==null) {
                continue;
            }
            if (left==null || right==null) {
                return false;
            }
            if (left.val!=right.val) {
                return false;
            }
            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);
        }
        return true;


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(1);
        root.left.right=new Node(3);
        root.right.left=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(4);
        boolean res=isSymmetric(root);
        System.out.println(res);
    }
}
