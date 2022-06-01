package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        int n1=n+1;
        int n2=n1-1;

        while(i<=n1){
            int j=1;
            System.out.print("*");
            while(j<=i-1){
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>0){
                System.out.print(j);
                j--;
            }
            if(i!= 1) System.out.print("*");
            System.out.println();
            i++;
        }
        i=n2;
        while(i>0){
            int j=1;
            System.out.print("*");
            while(j<=i-1){
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>0){
                System.out.print(j);
                j--;
            }
            if(i!=1) System.out.print("*");
            System.out.println();
            i--;
        }
    }
}
