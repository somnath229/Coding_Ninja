package Array;

import java.util.Scanner;

public class ArrayFunction {
    public static int[] createArray(){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int []a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void print (int arr[]){
        int size = arr.length;
        int i=0;
        while(i < size){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int input[]= createArray();
        print(input);
    }
}
