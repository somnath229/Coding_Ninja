package com.company;

import java.util.Scanner;

public class SumOfNFor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n && sum <=100;i++){
            sum+=i;
        }
        System.out.println(sum);


        for(int i=1000;i>0;i=i%3)
        {
            System.out.print("*");
        }

//        for(int i=1;i<10;i*=2)
//        {
//            System.out.println(i);
//        }


//        for(int i = 0; i < 2; i = i + 1) {
//            for(int j = 0; j < 2; j = j + 1) {
//                if (j == 1)
//                    break;
//                System.out.print(j +" ");
//            }
//        }


//        for(int i = 1; i < 5; i = i + 1){
//            System.out.print(i +" ");
//            i = i - 1;
//        }                                                              //infinite 1's loop


//        for(int i=1;i<=n || sum <=100;i++){
//            sum+=i;
//        }


//        for(int i = 0; i < 5; i = i + 1){
//            System.out.print(i + " ");
//            i = i + 1;
//        }
    }
}
