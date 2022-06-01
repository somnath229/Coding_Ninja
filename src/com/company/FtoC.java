package com.company;

import java.util.Scanner;

public class FtoC {
    int a; // GLOBAL VARIABLE
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int ans; //LOCAL VARIABLE

        while( s <= e){
            ans = (s - 32)* 5/9;
            System.out.println(s + " " + ans);
            s = s + w;
        }

    }
}
