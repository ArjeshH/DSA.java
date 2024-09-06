import java.util.ArrayList;

public class SubSequence {
    public static void printSub(int idx,ArrayList<Integer> res,ArrayList<Integer> arr){
       
        if (idx==arr.size()) {
            System.out.println(res);
            return;
        }
        if (arr.isEmpty()) {
            System.out.println("null");
            return;
        }
        
       for (int i = 0; i <arr.size(); i++) {
        res.add(arr.get(idx));
            printSub(idx+1,res,arr);
            res.remove(idx);
            printSub(idx+1,res, arr);
       }
            
       
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        printSub(0,res, list);
    }
}
