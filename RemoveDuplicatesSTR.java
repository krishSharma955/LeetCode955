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

    public static String removeDup(String s) { //more useful
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            int currChar = s.charAt(i);
            if(str.indexOf(String.valueOf(currChar))==-1) {
                str.append(currChar);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDup("aAbcDdikf"));
    }
}
