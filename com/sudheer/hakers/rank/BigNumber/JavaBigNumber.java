package com.sudheer.hakers.rank.BigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sudheer Chowdary on 10/24/2016.
 */
public class JavaBigNumber {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        if ((a.toString().length() < 200 && b.toString().length() < 200 && a.signum() == 1 && b.signum() == 1)
                || a.compareTo(BigInteger.ZERO) ==0 || b.compareTo(BigInteger.ZERO) ==0) {

            System.out.println(a.add(b));
            System.out.print(a.multiply(b));
        }

    }
}
