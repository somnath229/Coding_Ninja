package Break_Continue;

import java.util.Scanner;

public class NPrimeNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=2;
        while(i<=n){
            boolean divided=false;
            int j=2;
            while(j<i){
//                System.out.println(i+"i");
                if(i%j==0){
//                    System.out.println(j+"j");
//                    i++;
                    divided=true;
//                    continue;
                    break;
                }
                j++;
            }
            if(!divided){
                System.out.println(i);
            }
            i++;
        }
    }
}
