package Recursion;

public class PrintSumKSubset {
    public static void printSubsetsSumTok(int input[], int k) {

        int[] prevAns = new int[0];
        printSubsetsSumTok(input, prevAns, k , 0);
    }
    public static void printSubsetsSumTok(int input[],int prevAns[] ,  int k , int start) {

        if(start == input.length){
            if(k == 0) {
                for(int i = 0 ;i< prevAns.length;i++){
                    System.out.print(prevAns[i]+" ");
                }
                System.out.println();
                return;
            }
            else{
                return;
            }
        }

        int a = 0;
        int j = 0;

        int[] ans = new int[prevAns.length+1];
        for(int i = 0 ;i< prevAns.length;i++) {
            ans[a] =  prevAns[i];
            a++;

        }
         ans[a] = input[start];
        printSubsetsSumTok(input, prevAns, k ,start+1);
        printSubsetsSumTok(input, ans , k - input[start] ,start+1);



    }

    public static void main(String[] args) {
        int arr[] = {4,3,1};
        printSubsetsSumTok(arr,5);
    }
}
