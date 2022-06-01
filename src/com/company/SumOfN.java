package com.company;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n){
           sum += i; // sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
       // System.out.println("Sum of  n natural number is : "+sum);
    }
}
