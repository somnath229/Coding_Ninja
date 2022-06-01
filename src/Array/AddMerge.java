package Array;

import java.util.Scanner;

public class AddMerge {
    static Scanner sc=new Scanner(System.in);
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int n = arr1.length;
        int m = arr2.length;
        int p = output.length;

        int  sum = 0 , i , j , k;
        if(n > m) {
            int a1[] = arr1;
            int a2[] = arr2;
            i = arr1.length - 1;
            j = arr1.length - 1;

            k = p - 1;
//            while (i >= 0) {
            int ans;
            if(i == 0) {
                ans =  0 + a2[j] + sum;
            }
            else if(j == 0) {
                ans = a1[i] + 0  + sum;
            }
            else ans = a1[i] + a2[j] + sum;
                sum = 0;
                int res = ans % 10;
                output[k] = res;
                int carry = ans / 10;
                sum += carry;
//                i--;
                j--;
                k--;
            }
        }


    public static void main(String[] args) {
        int t = sc.nextInt();
        int i = 0;
        while (i++ < t) {
            int[] arr1 = createArray();
            int[] arr2 = createArray();
            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

            sumOfTwoArrays(arr1,arr2,output);
            print(arr1);

        }
    }
    public static int[] createArray() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}

