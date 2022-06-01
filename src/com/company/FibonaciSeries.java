package com.company;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int k=1;
        int j=0;
        int fib=0;
        if(n==1) System.out.println("1");
        else {
            for (int i = 1; i < n; i++) {
                fib = j + k;
                j = k;
                k = fib;
            }
            System.out.println(fib);
        }
    }
}
