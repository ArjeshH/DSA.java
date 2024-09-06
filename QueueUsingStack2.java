import java.util.Stack;

public class QueueUsingStack2 {
    public static class  Queue {
    private static Stack<Integer> first;
    private static Stack<Integer> second;
    public Queue(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item){
        first.add(item);
    }
    public int remove(){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed=second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }
      public int peek(){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int item=second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return item;

      } 
      public boolean isEmpty(){
        return first.isEmpty();
      } 
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        // System.out.println(q.remove());
        while (!q.isEmpty()) {
            System.out.print(q.remove());
        }


    }
}
