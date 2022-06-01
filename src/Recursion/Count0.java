package Recursion;

import java.util.Scanner;
//this code donot work for input 0
public class Count0 {
    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int shortAns = count(n/10);
        if((n%10) == 0){
            shortAns += 1;
        }
        return shortAns ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int ans = count(n);
        System.out.println(ans);
    }
}
