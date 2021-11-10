import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String []args) {

        //Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n+2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        sc.close();

        // create a copy of the original array
        String[] s2 = new String[n+2];
        for (int i = 0; i < n; i++) {
            s2[i] = s[i];
        }

        // use compare to order the original array
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[j])) < 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        // check to see if the duplicate values of the original array are in the correct order using the copy array
        for (int i = 0; i < n - 1; i++) {

            if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[i+1])) == 0) {

                int index1 = 0, index2 = 0;
                for (int i2 = 0; i2 < s2.length; i2++) {
                    if (s[i].equals(s2[i2])) {   index1 = i2; }
                    if (s[i+1].equals(s2[i2])) { index2 = i2; }
                }

                if (index1 > index2) {
                    String temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}