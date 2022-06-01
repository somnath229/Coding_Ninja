package Recursion;

public class LastIndexOfX {
    public static int checkX(int[] arr , int x){
        return checkX(arr,x, 0);
    }
    private static int checkX(int[] arr , int x, int startIndex){
        int n = arr.length;
        if(startIndex >= n) {
            return -1;
        }
        int ans = checkX(arr, x , startIndex+1);
        if(ans != -1) return ans;
        if(arr[startIndex] == x) {
            return startIndex;
        }
        else return -1;
    }
    private static int checkXwithlast(int[] arr , int x, int lastIndex){
        int n = arr.length;
        if(lastIndex < 0) {
            return -1;
        }
        if(arr[lastIndex] == x) {
            return lastIndex;
        }
        return checkX(arr, x , lastIndex-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5 ,6 , 4};
        int x = 4;
        int ans = checkX(arr , x);
        System.out.println(ans);

        int ans1 = checkXwithlast(arr, x, arr.length-1);
        System.out.println(ans1);
    }
}
