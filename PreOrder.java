import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrder {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
        
    }
    public static void preOrder(Node root,ArrayList<Integer> arr){
        if (root==null) {
            return;
        }
        arr.add(root.data);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }
    public static ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> arr=new ArrayList<>();
        preOrder(root,arr);
        return arr;
    }
    public static void postOrder(Node root,ArrayList<Integer> arr){
        if (root==null) {
            return;
        }
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        arr.add(root.data);
    }
    static ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> arr=new ArrayList<>();
        postOrder(root, arr);
        return arr;
    }
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size=q.size();
            ArrayList<Integer> subList=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (q.peek().left!=null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right!=null) {
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().data);
            }
            list.add(subList);
        }
        return list;
    }
    public static ArrayList<Integer> postOrder2Stack(Node root){
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        ArrayList<Integer> postList=new ArrayList<>();
        if (root==null) {
            return postList;
        }
        st1.push(root);
        while (!st1.isEmpty()) {
            root=st1.pop();
            st2.push(root);
            if (root.left!=null) {
                st1.push(root.left);
            }
            if (root.right!=null) {
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()) {
            postList.add(st2.pop().data);
        }
        return postList;
    }
public static ArrayList<Integer> inOrderItr(Node root)
{
    Node node=root;
    ArrayList<Integer> list=new ArrayList<>();
    Stack<Node> s=new Stack<>();
    while (true) {
        if (node!=null) {
            s.push(node);
            node=node.left;
        }else{
            if (s.isEmpty()) {
                break;
            }else{
                node=s.pop();
                list.add(node.data);
                node=node.right;
            }
        }
    }
    return list;
}
public static int maxHeight(Node root){
    if (root==null) {
        return 0;
    }
    int lh=maxHeight(root.left);
    if (lh==-1) {
        return -1;
    }
    int rh=maxHeight(root.right);
    if (rh==-1) {
        return -1;
    }
    if (Math.abs(lh-rh)>1) {
        return -1;
    }
    return 1+Math.max(lh, rh);
}
public static Node searchBST(Node root,int val){
    if (root==null|| root.) {
        
    }
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        ArrayList<Integer> arr=postOrder(root);
        for (Integer elem : arr) {
            System.out.print(elem+" ");
        }
        ArrayList<ArrayList<Integer>> list=levelOrder(root);
        System.out.println(list);
        ArrayList<Integer> list2=inOrderItr(root);
        System.out.println(list2);
        ArrayList<Integer> list3=postOrder2Stack(root);
        System.out.println(list3);
        System.out.println(maxHeight(root));
    }
}
