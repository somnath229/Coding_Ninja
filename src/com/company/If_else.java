package com.company;

import java.util.Scanner;

public class If_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c=sc.next();
        if(c.charAt(0) >= 'A' && c.charAt(0) <= 'Z'){
            System.out.println("1");
        }
        else{
            if(c.charAt(0) >= 'a' && c.charAt(0) <= 'z') {
                System.out.println("0");
            }
            else{

                System.out.println("-1");
            }
        }
    }
}
