import java.util.ArrayList;

public class GetSSQ {
    public static ArrayList<String> getSSQ(String str)
    {
        ArrayList<String> ans=new ArrayList<>();
        if (str.length()==0) {
            ans.add("");
            return ans;
        }
        char curr=str.charAt(0);
        ArrayList<String> smallAns=getSSQ(str.substring(1));
        for (String string : smallAns) {
            ans.add(string);
            ans.add(curr+string);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(getSSQ(str));
    }
}
