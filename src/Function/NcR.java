package Function;

import java.util.Scanner;

public class NcR {
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
        int r= sc.nextInt();

        int factn = fact(n);
        int factr = fact(r);
        int factnr = fact(n-r);

        int ans = factn / (factr * factnr);
        System.out.println(ans);

    }
}
