package String;

import java.util.Scanner;

public class RemoveConsicutiveDuplicate {
    public static String RemoveDuplicate(String str){
        String string = "";
        char x = str.charAt(0);
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == x){
                continue;
            }
            else {
                string += x;
                x = str.charAt(i);
            }
        }
        string +=x;
        return string;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String ans = RemoveDuplicate(str);
        System.out.println(ans);
    }
}
