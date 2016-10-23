package com.sudheer.hakers.rank;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sudheer Babu Gutha.
 */
public class MedianOfList {

    public static void median(int[] array) {
        if (array != null) {
            for (int i = 1; i <= array.length; i++) {
                int[] tempArray = Arrays.copyOfRange(array, 0, i);
                int middleNum = tempArray.length / 2;
                if (tempArray.length % 2 == 0)
                    System.out.println(((float) (tempArray[middleNum] + tempArray[middleNum - 1])) / 2);
                else
                    System.out.println((float) tempArray[middleNum]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        int count = 0;
        do {
            int t = scan.nextInt();
            array[count] = t;
            count++;
        } while (count < size);
        median(array);
    }
}
