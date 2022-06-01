package Array;

import java.util.Scanner;

public class ArrayIntputOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int []a = new int[size];
//        String []a =  new String [size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
//            a[i] = sc.nextLine(); // check for every new  line and if 1st is space it acepts it as 1 token
//            a[i] = sc.next();     // check for every space in a line very accurate
        }
        int i=0;
        while(i < size){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();

    }
}
