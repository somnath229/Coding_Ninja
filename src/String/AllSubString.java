package String;

import java.util.Scanner;

public class AllSubString {
    public static void subString(String str){
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
        for(int i = 0;i<str.length();i++){
            int k = 0 ;
            for(int j = i+1;j<=str.length();j++){
                System.out.println(str.substring(k,j));
                k++;
            }
        }
        for(int len = 1;len<=str.length();len++){
            for(int start = 0;start<=str.length() - len;start++){
                int end = start + len - 1;
                System.out.println(str.substring(start , end+1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        subString(s);

    }
}
