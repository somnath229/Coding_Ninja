package String;

import java.util.Scanner;

public class isPalindrome {
    public static String reverseString(String str){
        String s = "";
        for(int i = 0 ; i< str.length();i++){
            s = str.charAt(i) + s ;
        }
        return s;
    }
    public static boolean isPalindromeString(String str){
        String revStr = reverseString(str);
        return str.equals(revStr);
    }
    public static boolean isPalindromeString1(String str){
        boolean isPalindrome = true;
        int i  = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isPalindromeString(str);
        boolean ans1 = isPalindromeString1(str);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
