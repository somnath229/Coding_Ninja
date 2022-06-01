package Recursion;

import java.util.Scanner;

public class Count0Best {
    public static int count(int n){
        int a = 0;
        if(n == 0){
            return 1;
        }
        else return count(n,a);
    }
    private static int count(int n, int  a ){
        if(n == 0){
            return 0;
        }
        int shortAns = count(n/10, a);
        if((n%10) == 0){
            shortAns += 1;
        }
        return shortAns ;
    }
    public static int bestCount(int n){
        if(n< 10){
            if(n == 0) return 1;
            else return 0;
        }
        if((n%10) == 0){
            return bestCount(n/10) + 1;
        }
        else return bestCount(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int ans = bestCount(n);
        System.out.println(ans);
    }
}
