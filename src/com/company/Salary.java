package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        float d= 20/100f ;
        System.out.println(d);

        Scanner sc=new Scanner(System.in);
        int basic = sc.nextInt();
        String allowence = sc.nextLine();
        System.out.println(allowence);

        double hra = basic*20/100d;
        System.out.println(hra);
        double da =  basic*50/100d;
        System.out.println(da);
        double pf =  basic*11/100d;
        System.out.println(pf);


        double totalSalary;

        char allow = allowence.charAt(1);
        System.out.println(allow);
        if(allow == 'A'){
            totalSalary = basic + hra + da + 1700 - pf;
            System.out.println(totalSalary+"A");

        }
        else if(allow == 'B'){
            totalSalary = basic + hra + da + 1500 - pf;
            System.out.println(totalSalary+"B");

        }
        else{
            totalSalary = basic + hra + da + 1300 - pf;
            System.out.println(totalSalary);

        }
        System.out.println(Math.round(totalSalary));
    }
}
