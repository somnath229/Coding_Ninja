package Recursion;

public class NSumofsubsetforK {
    public static int[][] subsetsSumK(int input[], int k) {

        return subsetsSumK(input,k, 0 );
    }
    public static int[][] subsetsSumK(int input[], int p , int start) {
        if (start == input.length) {
            if (p == 0) {
                return new int[1][0];
            }
            else {
                return new int[0][0];
            }
        }
        int cn=input[start];

        int[][] smallans1=subsetsSumK(input, p,start+1);
        int[][] smallans2=subsetsSumK(input, p-cn, start+1);

        int[][] myans=new int[smallans1.length+smallans2.length][];
        int k=0;
        for(int i=0;i<smallans1.length;i++){
            myans[k]=smallans1[i];
            k++;

        }

        for(int i=0;i<smallans2.length;i++){
            myans[k]=new int[smallans2[i].length+1];
            myans[k][0]=cn;
            for(int j=0;j<smallans2[i].length;j++){
                myans[k][j+1]=smallans2[i][j];
            }
            k++;
        }

        return myans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 5 ,1 ,4, 6};
//        int arr[] = {4,3,1};

        int k = 8;
        int arrFinal[][] = subsetsSumK(arr,k);
        for (int i = 0; i < arrFinal.length; i++) {
            for (int j = 0; j < arrFinal[i].length; j++) {
                System.out.print(arrFinal[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println(arrFinal.length);
    }
}
