package Break_Continue;

import java.util.Scanner;

public class ReverseNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Math.pow(2,0));
        int n=sc.nextInt();
        int rev=0;

        while (n != 0){
            int r=n%10;
            rev=rev*10+r;
            if(rev!=0){
                System.out.print(r);
            }
            n/=10;
        }
    }
}
