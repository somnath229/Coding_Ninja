package com.company;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        while(n != 0){
            int k = n % 10;
            if(k % 2 == 0) {
                sumEven += k;
            }
            else {
                sumOdd += k;
            }

            n = n / 10;
        }
        System.out.println(sumEven+" "+sumOdd);
    }
}
