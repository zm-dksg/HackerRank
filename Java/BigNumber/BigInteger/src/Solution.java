import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger bigInt1 = new BigInteger(scanner.next());
        BigInteger bigInt2 = new BigInteger(scanner.next());

        BigInteger resultAdd = bigInt1.add(bigInt2);
        BigInteger resultMul = bigInt1.multiply(bigInt2);

        System.out.println(resultAdd);
        System.out.println(resultMul);
    }

}
