package Break_Continue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int j=0;
        for(;;)
        {
            if(j==5)
                break;
            System.out.print(j);
            j++;
        }
        for(int i=1;i<=n;i++){
            if(i==5) continue;
            System.out.print(i);
        }


        System.out.println();


        int i=1;
        while(i<=n){
            if(i==5){
                i++;
                continue;
            }
            System.out.print(i);
            i++;
        }
        //        for(int i=7;i!=0;i--)
//        {
//            System.out.print(i--);
//        }
    }
}
