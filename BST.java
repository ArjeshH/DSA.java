import java.util.ArrayList;

public class BST {
    public static class  Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
        
        
    }
    public static Node insert(Node head,int val)
    {
        if (head==null) {
            
            head= new Node(val);
            return head;
        }
        if (val<head.data) {
            head.left=insert(head.left, val);
        }else{
            head.right=insert(head.right, val);
        }
        return head;
    }
public static void inOrder(Node head)
{
    if (head==null) {
        return;
    }
    inOrder(head.left);
    System.out.print(head.data+" ");
    inOrder(head.right);
}
public static boolean search(Node head,int key)
{
    if (head==null) {
        return false;
    }
    if (head.data==key) {
        return true;
    }
    if (head.data>key) {
        return search(head.left, key);
    }else{
        return search(head.right, key);
    }
}
public static  Node delete(Node head,int data)
{
    if (data<head.data) {
      head.left=delete(head.left, data);
    }else if (data>head.data) {
        head.right=delete(head.right, data);
    }else{
        if (head.left==null && head.right==null) {
            return null;
        }else if (head.left==null) {
            return head.right;
        }else if (head.right==null) {
            return head.left;
        }else{
            Node IS= inOrderSuccessor(head.right);
            head.data=IS.data;
            return delete(head.right,IS.data);
        }
        
    }
    return head;
    
}
public static Node inOrderSuccessor(Node head)
{
    while (head!=null) {
        head=head.left;
    }
    return head;
}
public static Node createTree(int[] arr,int st,int end)
{
    if (st>end) {
        return null;
    }
    int mid= (st+end)/2;
    Node root= new Node(arr[mid]);
    root.left=createTree(arr, st, mid-1);
    root.right=createTree(arr, mid+1, end);
    return root;
}
public static void preOrder(Node root)
{
    if (root==null) {
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public static void printInRange(Node root,int k1,int k2){
    if (root==null) {
        return;
    }
    if (root.data>=k1 && root.data<=k2) {
        printInRange(root.left, k1, k2);
        System.out.println(root.data);
        printInRange(root.right, k1, k2);
    }else if (root.data<k1) {
        printInRange(root.left, k1, k2);
    }else{
        printInRange(root.right, k1, k2);
    }
}
public static boolean isValidBST(Node root,Node min,Node max)
{
    if (root==null) {
        return true;
    }
    if (min!=null && root.data<=min.data) {
        return false;
    }else if (max!=null && root.data>=max.data) {
        return false;
    }
    return isValidBST(root.left, min,root) && isValidBST(root.right, root, max);
}
public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
    if (root==null) {
        return;
    }
    if (root.right==null && root.left==null) {
        printPath(path);
        return;
    }
    path.add(root.data);
    printRoot2Leaf(root.left, path);
    printRoot2Leaf(root.right, path);
    path.remove(path.size()-1);
}
public static Node createMirror(Node root)
{
    if (root==null) {
        return null;
    }
    Node leftMirror=createMirror(root.left);
    Node rightMirror=createMirror(root.right);
    root.left=rightMirror;
    root.right=leftMirror;
    return root;
}
 
    private static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        int[] values={1,2,3,4,5,6,7,8,9};
        Node head=null;
        // for (int i = 0; i < values.length; i++) {
        //     head=insert(head, values[i]);
        // }
        // inOrder(head);
        // System.out.println();
        // System.out.println(search(head, 11));
        // delete(head, 32);
        // inOrder(head);
        head= createTree(values, 0, values.length-1);
        preOrder(head);
        System.out.println();
        inOrder(head);
        printInRange(head, 4, 8);
        printRoot2Leaf(head, new ArrayList<>());
        System.out.println();
        System.out.println(isValidBST(head,null,null));
        createMirror(head);
        preOrder(head);
        System.out.println();
        System.out.println(isValidBST(head, null, null));

    
}
}