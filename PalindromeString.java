public class PalindromeString {
    public static boolean isPalindrome(String s,int i){
        if (i>=s.length()/2) {
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        return isPalindrome(s,i+1);
    }
    public static void main(String[] args) {
        String s="MADAM";
        System.out.println(isPalindrome(s, 0));
    }
}
