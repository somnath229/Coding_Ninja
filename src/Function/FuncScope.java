package Function;

public class FuncScope {
    public static int sum(int a,int b)
    {
        System.out.print("int sum ");
        return a+b;
    }
    public static double sum(double a,double b)
    {
        System.out.print("float sum ");
        return a+b;
    }
    public static void main (String[] args) {
        System.out.print(sum(5,4));
        System.out.print(sum(5.0,4.0));
    }
//    public static int sum(int a,int b)
//    {
//        System.out.print("int sum ");
//        return a+b;
//    }
//    public static long sum(long a,long b)
//    {
//        System.out.print("long sum ");
//        return a+b;
//    }
//    public static void main (String[] args) {
//        int a=4;
//        int b=5;
//        System.out.print(sum(a,b));
//    }
//    public static boolean isPrime(int x)
//    {
//        for(int i=2;i<x/2;i++)
//        {
//            if(x%i==0)
//                return false;
//        }
//        return true;
//
//    }
//    public static void main (String[] args) {
//        System.out.print(isPrime(47));
//    }

//    public static int func(int a){
//        a += 10;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int a = 5;
//        func(a);
//        System.out.println(a);
//    }
}
