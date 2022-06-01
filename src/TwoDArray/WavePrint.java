package TwoDArray;

import java.util.Scanner;

public class WavePrint {
    public static void wavePrint(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        int count = 0;
        for(int j = 0 ; j < m ;j ++){
            if( j == count){
                for(int i = 0 ; i < n ; i++){
                    System.out.print(mat[i][j] + " ");
                }
                count += 2;
            }
            else{
                for(int i = n-1 ; i >= 0 ; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }


    }


    public static void main(String[] args) {
        System.out.println(6/2);
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i =  0; i<n;i++){
            for(int j =  0; j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        wavePrint(arr);
    }
}
