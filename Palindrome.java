package LeetCode;

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

    public static boolean twoPointer(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(twoPointer(s));
    }
}
