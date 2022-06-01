package Recursion;

import java.util.Scanner;

public class Count
{
    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int shortAns = count(n/10);
        return shortAns +1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int ans = count(n);
        System.out.println(ans);
    }
}
