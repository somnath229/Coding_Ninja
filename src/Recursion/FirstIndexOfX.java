package Recursion;

public class FirstIndexOfX {
    public static int checkX(int[] arr , int x){
        return checkX(arr,x, 0);
    }
    private static int checkX(int[] arr , int x, int startIndex){
        int n = arr.length;
        if(startIndex >= n) {
            return -1;
        }
        if(arr[startIndex] == x) {
            return startIndex;
        }
        return checkX(arr, x , startIndex+1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5 ,6 , 4};
        int x = 6;
        int ans = checkX(arr , x);
        System.out.println(ans);
    }
}
