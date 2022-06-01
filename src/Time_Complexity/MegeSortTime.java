package Time_Complexity;

public class MegeSortTime {
    private static void merge(int arr[], int s, int e) {
        int mid = (s + e) / 2;
        int i = s;
        int j = mid + 1;
        int k = 0;

        int ans[] = new int[e - s + 1];

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int a = 0; a < ans.length; a++) {
            arr[s + a] = ans[a];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end);
    }

    public static void main(String[] args) {
        for(int n = 10;n<100000000;n = n * 10){
        int[] arr =  new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = arr.length-i;
        }
        long startTime = System.currentTimeMillis();
        mergeSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();
            System.out.println("time is : " + (endTime - startTime) + " for n : " + n  );
//        int o = 0;
//        while(o < arr.length){
//            System.out.print(arr[o] + " ");
//            o++;
//        }
        }

    }
}