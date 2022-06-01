package Recursion;

public class CheckSortedBetter {

    public static boolean check(int[] arr ){
        return check(arr, 0);
    }
    private static boolean check(int[] arr , int startIndex){
        int n = arr.length;
        if(startIndex >= n-1) {
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]) {
            return false;
        }
        return check(arr, startIndex+1);
    }
    public static void main(String[] args) {

        int[] arr = { 1, 4, 5 ,6 , 4};
        boolean ans = check(arr );
        System.out.println(ans);
    }
}
