package com.company;

public class ScopeVariable {
    public static void main(String[] args) {
//        System.out.println(Math.round(8761.53));
        int i=10;
        if((i=1) == 1){
            System.out.println(i);
            int n=2;
            System.out.println(n);
        }
        else{
            int n=20;
            System.out.println(n);
        }
        int n=200;
        System.out.println(n);

        System.out.println(i);
    }
}
