import java.io.*;
import java.util.*;

public class Solution {

    static String capitalize(String str) {
        StringBuilder finalWord = new StringBuilder(String.valueOf(str.toCharArray()[0]).toUpperCase());
        for (int i = 1; i < str.length(); i++) { finalWord.append(str.charAt(i)); }
        return finalWord.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());

        if (A.charAt(0) > B.charAt(0)) { System.out.println("Yes"); }
        else { System.out.println("No"); }

        A = capitalize(A);
        B = capitalize(B);
        System.out.println(A + " " + B);
    }
}