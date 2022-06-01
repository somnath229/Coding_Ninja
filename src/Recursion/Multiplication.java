package Recursion;

import java.util.Scanner;

public class Multiplication {
    public static int mult(int n , int m){
        if(m == 0){
            return 0;
        }
        int shortAns = mult(n,m-1);
        return shortAns + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int m  =  sc.nextInt();
        int ans = mult(n,m);
        System.out.println(ans);
    }
}
