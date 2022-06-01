package Function;

import java.util.Scanner;

public class TwoFuncFactorial {
    public static boolean ischeckPrime(int n){
        int i=2;
        while(i<n){
            if(n%i == 0) return false;
            i++;
        }
        return true;
    }

    public static void printFactorial(int n){
        for(int  i=2 ; i <= n;i++){
            if(ischeckPrime(i)) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}
