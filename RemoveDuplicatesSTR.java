package LeetCode;

public class RemoveDuplicatesSTR {
    public static String removeDuplicates(String s) {
        int index = 0;
        String str = "";
        boolean map[] = new boolean[26];
        while(index<s.length()) {
            char currChar = s.charAt(index);
            if(map[currChar-'a']==true) {
                index++;
            }
            else {
                map[currChar-'a'] = true;
                str += currChar;
                index++;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabcddikf"));
    }
}
