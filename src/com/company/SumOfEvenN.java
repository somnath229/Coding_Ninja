package com.company;

import java.util.Scanner;

public class SumOfEvenN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n){
            if(i%2 == 0){
                sum += i; // sum = sum + i;
                System.out.println(sum);
            }
            i = i + 1;
        }
        System.out.println(sum);
    }
}
