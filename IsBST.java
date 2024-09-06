public class IsBST {
    public static class  Node {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
        
    }
    public static boolean isBST(Node root)
    {
        return helper(root,null,null);
    }
   private static boolean helper(Node node,Integer low,Integer high)
   {
        if (node==null) {
            return true;
        }
        if (low!=null && node.val<low) {
            return false;
        }
        if (high!=null && node.val>high) {
            return false;
        }
        return helper(node.left, low,node.val) && helper(node.right,node.val, high);
   }
   public static void main(String[] args) {
        Node root=new Node(7);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(4);
        root.right=new Node(9);
        root.right.left=new Node(8);
        root.right.right=new Node(11);
        boolean res= isBST(root);
        System.out.println(res);
   }
}
