package com.sudheer.hakers.rank;

/**
 * Created by Sudheer Chowdary on 10/23/2016.
 */
public class CamelCase {

    public static void main(String args[]) {
        String s = "saveChangesInTheEditor";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        System.out.println(count);
        s = "sudheer";
        int num = 10;
        System.out.printf("%-15s", s);
        System.out.printf("%03d", num);

        int x = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }


        int a = 5;
        int b = 3;
        int n = 5;

        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                temp = a + b;
            } else {
                temp = temp + (int) Math.pow(2, i)*b;
            }
            System.out.print(temp +" ");
        }
    }

}
