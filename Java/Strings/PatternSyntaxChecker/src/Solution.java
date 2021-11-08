import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String[] result = new String[testCases];

        int i = 0;
        while(testCases>0 && i<testCases) {

            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                result[i] = "Valid";
            } catch (PatternSyntaxException e) {
                result[i] = "Invalid";
            } finally {
                i++;
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}