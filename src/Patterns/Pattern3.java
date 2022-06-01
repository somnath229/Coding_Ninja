package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=n;
        int count =0;
        while(i>0){
            int j=0;
            int c=count;
            while(j<i){
                System.out.print(2*c+1);
                c++;
                j++;
            }
            int k=0;
            j=0;
            while(j<n-i){
                System.out.print(2*k+1);
                k++;
                j++;
            }
            System.out.println();
            count++;
            i--;
        }
//        int i=1;
//        while(i<=n){
//            int j=0;
//            while(j<n){
//                System.out.print(2*j+1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }
}
