package TwoDArray;

import java.util.Scanner;

public class SumOfBoundariesandDiagonal {
    public static void totalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                 if(i == j || (i+j) == mat.length -1) {
                     sum += mat[i][j];
                 }
                 else if(j == 0 || j == mat.length -1 || i == 0 || i == mat.length - 1) {
                     sum += mat[i][j];
                 }

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i =  0; i<n;i++){
            for(int j =  0; j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        totalSum(arr);
    }
}
