package Array;

public class Array {
    public static void main(String[] args) {
        int arr[]=new int[10];
//        byte arr[]=new byte[10];
//        int arr[]=new int[10];
//        char arr[]=new char[10];
//        double arr[]=new double[10];
//        float arr[]=new float[10];
//        String arr[]=new String[10];
//        long arr[]=new long[10];
//        boolean arr[]=new boolean[10];


        System.out.println(arr);

        arr[5]=10;
//      arr[5]='A';
//        arr[5]=10.23;
//        arr[5]=10.23f;
//        arr[5]="this is index 15";
//        arr[5]= 5666655555566666666L;
//        arr[5]=8529;
//        arr[5]=true;

//        System.out.println(arr[-1]); // arrayindexoutofbound exception
//        System.out.println(arr[10]); // arrayindexoutofbound exception
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);

        //increase array element by 1
        int array[] = new int[3];
        int i = 0 ;
        while(i < array.length){
            array[i]++;
            array[i]++;
            i++;
        }
        i = 0;
        while(i < array.length){
            System.out.println(array[i]);
            i++;
        }
    }
}
