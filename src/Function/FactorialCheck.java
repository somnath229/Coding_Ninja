package Function;

import java.util.Scanner;

public class FactorialCheck {
    public static int fact(int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans *=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fact(n));
    }
}
