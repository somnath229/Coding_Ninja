package Array;

import java.util.Scanner;

public class ArraySequence {
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
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int []a = new int[size];
        int m;
        if(size % 2 == 0) {
            m=size / 2;
        }
        else{
            m=(size+1) / 2;

        }
        System.out.println("m"+m);

        int count=0;
        for(int i = 1;i<=size;i++){
            if(i%2!=0 && count < m) {
//                System.out.print(i +" ");
                a[count] = i;
                count++;
            }
        }
        print(a);
        count = m;
        for(int i = size;i>0;i--){
            if(i%2==0 && count < size) {
//                System.out.print(i +" ");
                a[count] = i;
                count++;
            }
        }
        print(a);

    }
}
