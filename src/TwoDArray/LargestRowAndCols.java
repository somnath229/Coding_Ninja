package TwoDArray;

import java.util.Scanner;

public class LargestRowAndCols {
    static Scanner sc = new Scanner(System.in);
    public static int[][] create2DArray(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int largestRow(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int largest = Integer.MIN_VALUE , sum = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
               sum += arr[i][j];
            }
            if(sum > largest) largest = sum;
            sum = 0;
        }
        return largest;
    }
    public static int largestCols(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int largest = Integer.MIN_VALUE , sum = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                sum += arr[j][i];
            }
            if(sum > largest) largest = sum;
            sum = 0;
        }
        return largest;
    }
    public static void main(String[] args) {
        int [][] input = create2DArray();
        int largestRow = largestRow(input);
        int largestCols = largestCols(input);
//        System.out.println("largest column "+largestCols(input));
        if(largestRow > largestCols) System.out.println("largestRow " + largestRow );
        else System.out.println("largestCols " + largestCols );
    }
}
