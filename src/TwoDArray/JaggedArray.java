package TwoDArray;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][];

        int k = 1;
        for(int i = 0 ;i < n;i++){
            arr[i] =  new int[k];
            k++;
        }
        for(int i = 0 ;i < n;i++){
            for(int j = 0 ;j < arr[i].length;j++){
                arr[i][j] = 1;
            }
        }
        for(int i = 0 ;i < n;i++){
            for(int j = 0 ;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        for(int i = 0 ;i < n;i++){
//            for(int j = 0 ;j < arr[i].length;j++){
//                System.out.println(arr[i][j] + " i "+i+" j"+j);
//            }
//        }
    }
}
