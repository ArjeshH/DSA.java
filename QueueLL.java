public class QueueLL {
    static class Node{
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
        }
        
    }
    static class Queue {
        static Node head=null;
        static Node tail=null;
        boolean isEmpty()
        {
            return head==null && tail==null;
        }
        void insert(int data){
            Node newNode=new Node(data);
            if (isEmpty()) {
               head=tail=newNode; 
               return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    int delete()
    {
        
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val=head.data;
        if (head==tail) {
            head=tail=null;
            
        }else{
            head=head.next;
        }
        
        
        return val;
    }
    int peek(){
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    
        
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.delete();
        }
        System.out.println(q.peek());
    }
    
}
