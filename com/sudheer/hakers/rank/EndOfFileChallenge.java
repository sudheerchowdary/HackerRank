package com.sudheer.hakers.rank;

import java.util.Scanner;

/**
 * Created by Sudheer Babu Gutha.
 */
public class EndOfFileChallenge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s ;
        int count = 1;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            if(s ==null || s.isEmpty())
                break;
            System.out.println(count + " " + s);
            count++;
        }

    }
}
