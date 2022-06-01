package Recursion;

public class QuickSort {
    public static int partition(int[] arr , int s , int e){
        //find pivot
        int count = 0 ;
        int x = arr[s];
        for(int a = s+1 ; a <= e ; a++){
            if(arr[a] < x){
                count++;
            }
        }
        //swap pivot
        int pivotPos = s+count;
        if(count == 0) return pivotPos;
        else {
            int temp = arr[pivotPos];
            arr[pivotPos] = arr[s];
            arr[s] = temp;
        }

        //check if s < pivot < e
        int i = s;
        int j = e;
        while(i < pivotPos){
            if(arr[i] >= arr[pivotPos]){
                while(j > pivotPos){
                    if( arr[j] < arr[pivotPos]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        //return pivotPosition
        return pivotPos;
    }
    public static void quickSort(int[] arr , int sI , int eI){
        if(sI >= eI) return;
        int pivotPos = partition(arr, sI , eI);
//        System.out.println(pivotPos);
        quickSort(arr, sI , pivotPos);
        quickSort(arr, pivotPos + 1 , eI);
    }
    public static void main(String[] args) {
        int[] arr = {10,18,19,9,2,6,11};
        quickSort(arr, 0, arr.length-1);
        int i = 0;
        while(i< arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
