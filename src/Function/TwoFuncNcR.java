package Function;

import java.util.Scanner;

public class TwoFuncNcR {
    public static int factorial(int n){
        int ans = 1;
        for (int i=1;i<=n;i++){
            ans *=i;
        }
        return  ans;
    }
    public static int checkNcR(int n , int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnr = factorial(n-r);
        int ans = factn / (factr * factnr);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int output = checkNcR(n,r);
        System.out.println(output);
        System.out.println("done");
    }
}
