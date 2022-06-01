package com.company;

public class For {


    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++) {
            System.out.print(i);
        }
        System.out.println();

        for(int i=1;i<=n;++i){
            System.out.print(i);
        }
        System.out.println();

        for(int i=1,j=1;i<=n;i++,j++){
            System.out.print(i);
            System.out.print(j);
        }
        System.out.println();



        int i=1;
        while(i++ <= n){
            System.out.print(i);
        }
        System.out.println();

        i=1;
        while(++i <= n){
            System.out.print(i);
        }
        System.out.println();

        i=1;
        while(i <= n){
            System.out.print(i);
            i++;
        }
        System.out.println();

        i=1;
        while(i <= n){
            System.out.print(i);
            ++i;
        }
        System.out.println();
    }
}
