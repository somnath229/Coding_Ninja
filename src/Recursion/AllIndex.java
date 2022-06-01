package Recursion;

public class AllIndex {
    public static int[] checkX(int[] arr , int x){
        return checkX(arr,x, 0);
    }
    private static int[] checkX(int[] arr , int x, int startIndex){
        int n = arr.length;
        if(startIndex >= n) {
            return new int[0];
        }
        int[] ansArr =  checkX(arr, x , startIndex+1);

        if(arr[startIndex] == x) {
            int[] totalArr = new int[ansArr.length + 1];
            totalArr[0] = startIndex;
            for(int i = 0 ;i< ansArr.length ;i++){
                totalArr[i+1] = ansArr[i];
            }
            return totalArr;
        }
        else return ansArr;
    }
    public static void main(String[] args) {
        System.out.println(0%10);
        int[] arr = { 1, 4, 5 ,4 , 4};
        int x = 4;
        int[] ans = checkX(arr , x);
        for (int an : ans) System.out.print(an + " ");
    }
}
