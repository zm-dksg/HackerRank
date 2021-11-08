import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        if(s.isEmpty()) { System.out.println("0"); }

        String[] result = s.split("[^a-zA-Z]+");

        int tokenCount = 0;
        for (String s1 : result) {
            if (s1.length() > 0) { tokenCount++; }
        }

        System.out.println(tokenCount);
        for (String s1 : result) {
            if (s1.length() > 0) { System.out.println(s1); }
        }
    }
}

