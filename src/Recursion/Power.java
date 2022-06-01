package Recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int n , int x){
        if(x == 0){
            return 1;
        }
        int shortAns = pow(n , x-1);
        return n * shortAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int x  =  sc.nextInt();
        int ans = pow(n , x);
        System.out.println(ans);
    }
}
