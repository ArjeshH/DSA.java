import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AverageOfLevels {
    
        public static class  Node {
            int val;
            Node left;
            Node right;
            public Node(int val)
            {
                this.val=val;
            }
            
        }
        static ArrayList<Double> avgOfLevels(Node root)
        {
            ArrayList<Double> result= new ArrayList<>();
            if (root==null) {
                return result;
            }
            Queue<Node> q= new LinkedList<>();
            q.offer(root);
            double avgLevel=0;
            while (!q.isEmpty()) {
                int levelSize=q.size();
                
                for(int i=0;i<levelSize;i++)
                {
                    Node currNode=q.poll();
                    avgLevel+=currNode.val;
                    if (currNode.left!=null) {
                        q.offer(currNode.left);
    
                    }
                    if (currNode.right!=null) {
                        q.offer(currNode.right);
                    }

                }
                avgLevel=avgLevel/levelSize;
                result.add(avgLevel);

                
               
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
    ArrayList<Double> list=avgOfLevels(root);
    System.out.println(list);
}
}


