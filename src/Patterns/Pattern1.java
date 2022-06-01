package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int n1=(n + 1) / 2;
        int n2=(n1 - 1);
        int i=1;
        while(i<=n1){
            int j=1;
            while(j <= (n1-i)){
                System.out.print("_");
                j++;
            }
            j=1;
            while(j <= (2*i - 1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i=n2;
        while(i>0){
            int j=1;
            while(j <=(n2-i+1)){
                System.out.print("_");
                j++;
            }
            j=1;
            while(j <= (2*i-1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
