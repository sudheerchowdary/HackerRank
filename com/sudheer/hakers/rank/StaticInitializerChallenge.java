package com.sudheer.hakers.rank;

import java.util.Scanner;

/**
 * Created by Sudheer Babu Gutha.
 */
public class StaticInitializerChallenge {

    static boolean flag = false;
    static Scanner scanner = new Scanner(System.in);

    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static {
        if(B >0 && H>0 ){
            flag = true;
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String args[]){
        if(flag){
            System.out.println(B*H);
        }

    }
}
