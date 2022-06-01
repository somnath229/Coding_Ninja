package Break_Continue;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        int i=0;
        while (n != 0){
            int r=n%10;
            rev=rev*10+r;
            if(rev==0){
                i++;
            }
            else{
                int j=1;
                int k=1;
                while(j<=i){
                    k*=2;
                    j++;
                }
                if(i==0) sum+=1;
                else if(r!=0) {
                    sum+=k;
                }
                i++;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
