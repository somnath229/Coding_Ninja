package Operator;

public class Logical {
    public static void main(String[] args) {
        int a=4;
        int b=3;

        System.out.println(a>b && b<a); //both true
        System.out.println(a>b || b<a); //either one true
        System.out.println(!(b < a));    //negative or opposite of result
    }
}
