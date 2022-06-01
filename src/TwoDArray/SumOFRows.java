package TwoDArray;

import java.util.Scanner;

public class SumOFRows {
    public static void sumOfRows(int [][]mat){
        int n = mat.length;
        int m;
        if(n == 0) m = 0;
        else m = mat[0].length;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int  j = 0 ;  j < m; j++){
                sum +=mat[i][j];
            }
            System.out.print(sum + " ");
            sum = 0 ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();
        while(t-- > 0){
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int arr[][] = new int[rows][cols];
            for(int i = 0 ;i < rows;i++){
                for(int j  = 0 ; j < cols;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            sumOfRows(arr);
        }

    }
}
