import java.util.Scanner;

public class RemoveA {
    public static String removeA(String s,int idx)
    {
        if (idx==s.length()) {
            return "";
        }
        char curr=s.charAt(idx);
        String res=removeA(s, idx+1);
        if (curr=='a'|| curr=='A') {
            return res;
        }else{
            return curr+res;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String res=removeA(s, 0);
        System.out.println(res);
    }
}
