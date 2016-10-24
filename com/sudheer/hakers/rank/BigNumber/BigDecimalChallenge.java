package com.sudheer.hakers.rank.BigNumber;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BigDecimalChallenge {

 /*   public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        String[] b = new String[count];
        for (int i = 0; i < count; i++) {
             b[i] = scanner.next();
        }

        Arrays.sort(b, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b = new BigDecimal(o1);
                BigDecimal b1 = new BigDecimal(o2);
                return b.compareTo(b1);
            }
        }));

        for(String s : b){
            System.out.println(s);
        }
    }*/

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        String s1[] = new String[n];
        for(int i = 0; i<n ; i++){
            s1[i] = s[i];
        }
        Arrays.sort(s1, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b = new BigDecimal(o1);
                BigDecimal b1 = new BigDecimal(o2);
                return b.compareTo(b1);
            }
        }));

        for (int i = 0; i < n; i++) {
            System.out.println(s1[i]);
        }
    }
}
