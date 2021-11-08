import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {

    String pattern = "[0-9]{1,3}";

    String IP = "000.000.000.000";

    public static void main(String[] args) {
        String[] str = IP.split(".");
        str.length == 4
    }

}