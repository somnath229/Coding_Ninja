package Break_Continue;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long rev=0L;
        Long i=1L;
        while (n != 0){
            Long r=n%2;
            rev=rev+r*i;
            n/=2;
            i*=10;
        }
        System.out.println(rev);

    }
}
