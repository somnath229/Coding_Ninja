package Recursion;

public class ArraySum {
    public static int sum(int[] arr){
        int n = arr.length;
        if(n < 1) {
            return 0;
        }
        if(n == 1) {
            return arr[0];
        }
        int[] smallArr = new int[n-1];
        for(int i = 1;i< n;i++){
            smallArr[i-1] = arr[i];
        }
        return sum(smallArr) + arr[0];

//        int smallAns = sum(smallArr);
//        return smallAns + arr[0];
    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 5 ,6};
        int ans = sum(arr);
        System.out.println(ans);
    }
}
