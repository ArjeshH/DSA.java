public class RemoveDup {
    static void solve(String str,int idx,StringBuilder newStr,boolean[] map){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if (map[ch-'a']==true) {
            solve(str, idx+1, newStr, map);
        }else{
            map[ch-'a']=true;
            solve(str, idx+1, newStr.append(ch), map);
        }
    }
    public static void main(String[] args) {
        solve("apnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
