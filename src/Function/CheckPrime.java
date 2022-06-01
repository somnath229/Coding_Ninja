package Function;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        int i=2;
        while(i<n){
            if(n%i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println(checkPrime(n));
        boolean ans = checkPrime(n);
        if(ans) System.out.println("Prime NO");
        else System.out.println("Non Prime NO");
    }
}
