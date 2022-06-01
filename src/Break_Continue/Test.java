package Break_Continue;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

         int count=0;
         int c=n;
         while(c!=0){
             count++;
             c/=10;
         }
        System.out.println(count);
         int sum=0;
         int res=n;
          while(n!=0){
              int p=1;
              int k=n%10;
              System.out.println(k);
              int i=1;
              while(i<=count){
                  p*=k;
                  System.out.println(p+"p");
                  i++;
              }
              sum+=p;
              System.out.println(sum+"sum");
              n/=10;
         }
         if(sum == res){
             System.out.println("true");
         }
         else{
             System.out.println("false");

         }
    }
}
