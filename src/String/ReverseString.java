package String;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str){
        String sRev = "";
        for(int i = str.length() - 1 ;i>=0;i--){
            sRev += str.charAt(i);
        }
        System.out.println(sRev);
        for(int i = 0 ;i<str.length();i++){
            sRev = str.charAt(i) + sRev;
        }
        System.out.println(sRev);
        int n = str.length();
        for(int i = 0 ;i < n;i++){
            sRev += str.charAt(n-i-1);
        }
        return sRev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String reverseString = reverseString(str);
        System.out.println(reverseString);
    }
}
