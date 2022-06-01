package Time_Complexity;

public class SelectionSortTime {

    public static void main(String[] args) {
        for(int n = 10;n<100000000;n = n * 10){
            int[] arr =  new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = arr.length-i;
            }
            long startTime = System.currentTimeMillis();
            selectionSort(arr);
            long endTime = System.currentTimeMillis();
            System.out.println("time is : " + (endTime - startTime) + " for n : " + n );

//            int o = 0;
//            while(o < arr.length){
//                System.out.print(arr[o] + " ");
//                o++;
//            }
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0 ;i< arr.length-1;i++){
            int min = arr[i];
            int minIndex = i;
            for(int  j = i+1 ;j< arr.length;j++){
                if(arr[j] <= min){
                    min = arr[j];
                    minIndex = j;
//                    int temp = arr[j];
//                    arr[j] = min;
//                    min = temp;
                }
            }
//            arr[minIndex] = min;
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;


        }
    }
}
