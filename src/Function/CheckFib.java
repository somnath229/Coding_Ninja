package Function;

import java.util.Scanner;

public class CheckFib {
    public static boolean checkMember(int n){

        int k=5*n*n + 4;
        int k1=5*n*n - 4;

        boolean sqrt1 = sqroot(k);
        boolean sqrt2 = sqroot(k1);

        if(sqrt1 || sqrt2 ) return true;
        else return false;

    }

    public static boolean sqroot(int n){
        double sqrt=n/2;
        double temp;
        do{
            temp=sqrt;
            sqrt=(temp + (n/temp))/2;

        }while((temp - sqrt) != 0 );
        return (sqrt*sqrt == n);
    }
    //OR another way to find sqroot in less time
    public static boolean sqroot1(int n){
       int sqrt = (int) Math.sqrt(n);
        return (sqrt*sqrt == n);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkMember(n));
    }
}
