package Recursion;

public class CheckSorted {
    public static boolean check1(int[] arr){
        int n = arr.length;
      if(n <= 1) return true;
      int[] smallArr = new int[n-1];
      for(int i = 1;i< n;i++){
          smallArr[i-1] = arr[i];
      }
      boolean smallAns = check1(smallArr);
      if(!smallAns) {
          return false;
      }
//      if(arr[0] <= arr[1]) return true;
//      else return false;
//        or
      return arr[0] <= arr[1];

    }
    public static boolean check2(int[] arr){
        int n = arr.length;
        if(n <= 1) {
            return true;
        }
        if(arr[0] > arr[1]) {
            return false;
        }
        int[] smallArr = new int[n-1];
        for(int i = 1;i< n;i++){
            smallArr[i-1] = arr[i];
        }
        return check2(smallArr);
// or
//        boolean smallAns = check2(smallArr);
//        return smallAns;
        //or
        //if(smallAns) {
        // return true;
       // }
       // else return false;
    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 5 ,6};
        boolean ans = check2(arr);
        System.out.println(ans);
    }
}
