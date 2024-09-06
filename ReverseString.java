import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s,int idx)
    {
        if (idx==s.length()) {
            return "";
        }
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss=reverse(s, 0);
        System.out.println(ss);
        
    }
}
