import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int size = 0;
        for (int i = 0; i <= s.length()-k; i++) {
            size++;
        }

        String[] strArr = new String[size];
        for (int i = 0; i <= s.length()-k; i++) {
            strArr[i] = s.substring(i,i+k);
        }

        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < strArr.length; j++) {

                if (strArr[i].compareTo(strArr[j]) > 0) {

                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }

        String smallest = strArr[0];
        String largest  = strArr[size-1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}