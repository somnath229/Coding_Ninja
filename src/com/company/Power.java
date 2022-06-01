package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        int pow = x;
        int i = 2;
        if(n == 0) {
            System.out.println(1);
            return;
        };
        if(n == 1) {
            System.out.println(x);
            return;
        }
        else{
            while(i <= n){

                pow = pow * x;
                i++;
            }
        }
        System.out.println(pow);

    }
}
