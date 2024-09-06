import java.util.ArrayList;

public class Permutation {
    public static void printP(String str,String t,ArrayList<String> l){
        if (str.equals("")) {
            l.add(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            String left=str.substring(0, i);
            String right=str.substring(i+1);
            String rem=left+right;
            printP(rem,t+ch,l);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> l=new ArrayList<>();
        printP(str, "",l);
        System.out.println(l);
    }
}
