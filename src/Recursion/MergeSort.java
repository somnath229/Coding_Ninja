package Recursion;

public class MergeSort {
    private static void merge(int arr[] , int s , int e){
        int mid = (s+ e) / 2;
        int i = s;
        int j = mid+1;
        int k = 0 ;

        int ans[] = new int[e-s+1];

        while( i <= mid && j <=e){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
                k++;
            }else{
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j <= e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for(int a = 0 ; a < ans.length;a++){
            arr[s+a] = ans[a];
        }
    }
    public static void mergeSort(int arr[] , int start , int end){
        if(start == end ) return;
        int mid  = (start + end )/2;
         mergeSort(arr, start , mid);
         mergeSort(arr, mid+1, end);
         merge(arr, start, end);
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5 ,6};
        mergeSort(arr, 0, arr.length-1);
        int i = 0;
        while(i< arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
