package Array;

public class ArrayIncrement {
    public static void increment(int i){
        i++;
    }
    public static void arrayIncrement(int input[]){
        for(int i = 0 ;i < input.length ; i++) {
            input[i]++;
        }
    }
    public static void arrayIncrement2(int input[]){
        input = new int[5];
        for(int i = 0 ;i < input.length ; i++) {
            input[i]++;
        }
        print(input);
        System.out.println("FROM ARRAYINCREMENT");
    }
    public static void print(int a[]){
        for(int x :a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int i=19;
        increment(i);
        System.out.println(i);

        int a[] = {2,4,6,8,10};
        arrayIncrement(a);
        print(a);
        System.out.println();

        int arr[] = {2,4,6,8,10};
        arrayIncrement2(arr);
        print(arr);
        System.out.println();
    }
}
