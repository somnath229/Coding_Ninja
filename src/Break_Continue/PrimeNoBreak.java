package Break_Continue;

import java.util.Scanner;

public class PrimeNoBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime = false;
        for(int d=2;d<n;d++){
            if(n%d==0) {
                prime = true;
                break;
            }
        }

        if(prime){
            System.out.println("NON PRIME");
        }
        else{
            System.out.println("PRIME");
        }
    }
}
