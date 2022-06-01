package Recursion;

public class CheckNoInArray {
    public static boolean checkX(int[] arr , int x){
        int n = arr.length;
        if(n < 1) {
            return false;
        }

        int[] smallArr = new int[n-1];
        for(int i = 1;i< n;i++){
            smallArr[i-1] = arr[i];
        }
        boolean smallAns = checkX(smallArr , x);
        if(smallAns) return true;
        else if(arr[0] == x) return true;
        else return false;
    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 8, 5 ,6};
        boolean ans = checkX(arr , 8);
        System.out.println(ans);
    }
}
