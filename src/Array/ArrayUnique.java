package Array;

import java.util.Scanner;

public class ArrayUnique {
    static Scanner sc=new Scanner(System.in);

    public static int[] createArray(){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int arrayUnique(int[] arr){
        int n = arr.length;
        int count = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            count = 0;
            int k = arr[i];
            for(int j = 0 ;j<n;j++){
                if(k == arr[j]){
                    count++;
//                    System.out.println(count+" j " + j + " arr[j] "+arr[j]);
                }
            }
            if(count == 1){
                return arr[i];
//                ans = arr[i];
//                System.out.println(ans);
            }
//            count = 0;
        }


        return ans;
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
            int []arr = createArray();
            System.out.println(arrayUnique(arr));
        }

    }
}
