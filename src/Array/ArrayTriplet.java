package Array;

import java.util.Scanner;

public class ArrayTriplet {
    static Scanner sc=new Scanner(System.in);

    public static int[] createArray(){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int arrayIntersection(int[] arr, int x){
        int n =arr.length;
        int count = 0;
        for(int i =0 ; i < n ; i++){
            for(int j =i+1 ; j < n ; j++){
                for(int k =j+1 ; k < n ; k++){
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    if(a+b+c == x){
                        count++;
                    }
                }
            }
        }
        return count;
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
            int x=sc.nextInt();
            arrayIntersection(arr1,x);
//            print(arr2);

        }

    }
}
