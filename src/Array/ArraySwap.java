package Array;

import java.util.Scanner;

public class ArraySwap {
    static Scanner sc=new Scanner(System.in);

    public static int[] createArray(){
//        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void swapArray(int a[]){
        for(int i = 0;i<a.length - 1;i=i+2){
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
    public static void print(int input[]){
        for(int i= 0;i<input.length;i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i++ <  t){
            int []arr = createArray();
            swapArray(arr);
            print(arr);
//            i++;
        }

    }
}
