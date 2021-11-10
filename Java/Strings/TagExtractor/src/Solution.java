import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        boolean validCase;

        while(testCases>0) {

            String line = in.nextLine();
            validCase = false;

            // step 1 : split the tags and the content in between
            String[] splitLine = line.split("^<|<|>|>$");

            // step 2 : identify correctly tagged content + print correct content
            for (int i = 0; i < splitLine.length - 2; i++) {

                if (splitLine[i].length() == 0) { continue; }

                if (splitLine[i+2].equals("/" + splitLine[i])) {
                    if (splitLine[i+1].length() == 0) { continue; }
                    System.out.println(splitLine[i+1]);
                    validCase = true;
                }
            }

            // step 3 : if there's no correctly tagged content print 'None'
            if (!validCase) {
                System.out.println("None");
            }

            testCases--;
        }
    }

}
