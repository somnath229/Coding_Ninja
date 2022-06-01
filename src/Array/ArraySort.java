package Array;

import java.util.Scanner;

public class ArraySort {
    static Scanner sc = new Scanner(System.in);

    public static int[] createArray() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void arraySwap(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            System.out.println("i" + i);
            System.out.println(j + "j");

            if(arr[i] == 0) {
                i++;


            }

            else if (arr[j] == 1) {
                j--;

            }

            else{

                System.out.println("i in else"+i);
                System.out.println("j in else"+j);

                if(arr[j] == 1){
                    j--;
                }

                else{
                    arr[i] = 0;
                    arr[j] = 1;
                    i++;
                    j--;
                }


            }
        }
    }


    public static void print(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        int i = 0;
        while (i++ < t) {
            int[] arr = createArray();
            arraySwap(arr);
            print(arr);

        }
    }
}
