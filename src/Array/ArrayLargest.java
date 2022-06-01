package Array;

import java.util.Scanner;

public class ArrayLargest {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] createArray(){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int []a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void main(String[] args) {
        int input[]= createArray();
        int largestNo = largest(input);
        System.out.println(largestNo);
    }
}
