package Recursion;

import java.util.Scanner;

public class Sum {
        public static int sum(int n){
            if(n<0) {
                return -1;
            }
            if(n == 1){
                return 1;
            }
            return n + sum(n-1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n  =  sc.nextInt();
            int ans = sum(n);
            System.out.println(ans);
        }
}
