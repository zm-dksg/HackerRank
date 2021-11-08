import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) { return false; }

        char[] checkedChars = new char[a.length()];
        char curChar;

        a = allCAPS(a);
        b = allCAPS(b);

        for (int i = 0; i < a.length(); i++) {

            curChar = a.charAt(i);

            if (contains(checkedChars, curChar)) { continue; }

            if (count(a, curChar) != count(b, curChar)) { return false; }

            checkedChars[i] = curChar;
        }

        return true;
    }

    static boolean contains(char[] cArr, char c) {

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == c) { return true; }
        }

        return false;
    }

    static int count(String str, char c) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) { count++; }
        }

        return count;
    }

    static String allCAPS (String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
