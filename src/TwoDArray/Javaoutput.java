package TwoDArray;

public class Javaoutput {
    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[][]={ {1,2,3,4} , {2,4} , {3,5,7,8,9,11} };
        System.out.print(arr.length+arr[0].length+
                arr[1].length+arr[2].length);

//        int[][] arr = { { 1, 2 }, { 3, 4 } };
//        System.out.println(arr[0][0]+arr[1][1]);

//        int[][] arr = new int [2][2];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }

//        int arr[][]=new int[4][5];
//        for(int i=0;i<4;i++)
//        {
//            for(int j=0;j<5;j++)
//                arr[i][j]=i*j;
//        }
//        System.out.print(arr[3][4]);

//        int arr1[][]=new int[4][5];
//        for(int i=0;i<5;i++)
//        {
//            arr1[i][0]=2;
//        }
//        System.out.print(arr1[2][0]);

//        int[][] arr = new int[2][2];
//        fun(arr);
//        for(int i=0;i<2;i++)
//        {
//            for(int j=0;j<2;j++)
//            {
//                System.out.print(arr[i][j]+" " );
//            }
//        }
    }

}
