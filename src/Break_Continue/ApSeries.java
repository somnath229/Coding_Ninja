package Break_Continue;

import java.util.Scanner;

public class ApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int k = 0;
        while (i <= n) {
            k=3 * i +2;
            int ans= k%4;
            if(ans != 0) {
                System.out.println( k );

            }
            else{
                n++;
            }
            i++;
        }
    }
}
