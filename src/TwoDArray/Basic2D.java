package TwoDArray;

import java.util.Scanner;

public class Basic2D {
    public static void main(String[] args) {
        int arr2D[][] = new int[3][4];
        System.out.println(arr2D[2][1]);
        arr2D[1][2] = 23;
        System.out.println(arr2D[1][2]);

        System.out.println(arr2D); // [[I@address means contain 2D array
        System.out.println(arr2D[0]); //[I@address means  contain only one aray in each index

        int arrd[][] = {{2,3,1},{4,5,6}};
        System.out.println(arrd[1][1]);

        System.out.println("2D ARRAY WITH INPUT AND OUTPUT");

        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];


//        int n = arr.length; //rows
//        int m = arr[0].length; //columns
//        System.out.println(n +" " + m);

        for(int i = 0 ;i < rows;i++){
            for(int j  = 0 ; j < cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i < rows;i++){
            for(int j  = 0 ; j < cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
