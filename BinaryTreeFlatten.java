public class BinaryTreeFlatten {
    public static class  Node {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
    public static void flattenTree(Node root)
    {
        Node current=root;
        while (current!=null) {
            if (current.left!=null) {
                Node temp=current.left;
                while (temp.right!=null) {
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;

            }
            current=current.right;

        }
    }
    public static void inOrder(Node root)
    {
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    flattenTree(root);
    inOrder(root);
    }
}
