package OOP.class_object_temp.class_object;

public class Student {

    public String name;
    public int Roll_no;

    public static class Age{
        public int age;
    }

    public static int sum (int n){
        int sum = n;
        sum +=n;
        return sum;
    }
    public static int sub (int n){
        int sum = n;
        sum -=n;
        return sum;
    }
    public static int mul (int n){
        int sum = n;
        sum *=n;
        return sum;
    }
    public static int div (int n){
        int sum = n;
        sum /=n;
        return sum;
    }
    public static int mod (int n){
        int sum = n;
        sum %=n;
        return sum;
    }


}

