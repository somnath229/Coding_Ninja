package String;

import java.util.Scanner;

public class PrintCharOfString {
    public static void printChar(String s){
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i) + " ");
        }
//        int count = 1 ;
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i) == ' '){
//                count++;
//            }
//        }
//        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printChar(str);
    }
}
