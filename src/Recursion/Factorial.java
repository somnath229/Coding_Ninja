package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int shortAns = fact(n-1);
        return n * shortAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}
