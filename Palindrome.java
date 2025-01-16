public class Palindrome {
    public static boolean isPalindrome(String s) {
        String str = "";
        for(int i  = 0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str+=s.charAt(i);
            }
        }

        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
