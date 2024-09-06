import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    public static class  Stack {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }
        void add(int data)
        {
            if (!q1.isEmpty()) {
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        int remove()
        {
            int top=-1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top=q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while (!q2.isEmpty()) {
                    top=q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        int peek(){
            int top=-1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top=q1.remove();
                    
                    q2.add(top);
                }
            }else{
                while (!q2.isEmpty()) {
                    top=q2.remove();
                   
                    q1.add(top);
                }
            }
            return top;

        }
    

    
        
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();/
        }
    }
    
}
