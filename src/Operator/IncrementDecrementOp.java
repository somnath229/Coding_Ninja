package Operator;

public class IncrementDecrementOp {
    public static void main(String[] args) {
        int a=3;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        int sm=a++;
        System.out.println(sm);
        System.out.println("WORKING IS DIFFRENT"+a);
        //diffrent working
        int sum=a+1;//++a working
        System.out.println(sum);


        int i=1;
        while(i< a){
            System.out.println(i+"i");
//            i++;
            ++i;
        }

        int j=20;
        j+=20;
        int k=40;
        k-=20;
        int l=4;
        l*=2;
        int m=8;
        m/=2;
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }
}
