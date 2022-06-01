package Array;

import java.util.Scanner;

public class ArrayIntersection {
    static Scanner sc=new Scanner(System.in);

    public static int[] createArray(){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void arrayIntersection(int[] arr,int[] arr2){
        int n = arr.length;
        int m = arr2.length;

        for(int i = 0;i<n;i++){
            int k = arr[i];
            for(int j = 0 ;j<m;j++){
                System.out.println("i"+i+" j "+j);
                if(k == arr2[j]){
                    System.out.println(k);
                    arr2[j] = -1;
                   break;
                }
            }
        }
    }

    public static void print(int input[]){
        for(int i= 0;i<input.length;i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        int i=0;
        while(i++ <  t){
            int []arr1 = createArray();
            int []arr2 = createArray();
            arrayIntersection(arr1,arr2);
            print(arr2);

        }

    }
}
