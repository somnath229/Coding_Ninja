package String;

import java.util.Arrays;

public class CheckPermutation {
    public static String sortB(String str){
        char[] st = str.toCharArray();

        for(int i = 0 ;i < st.length-1 ;i++){
            for(int j = 0 ;j < st.length-1 ;j++){
                if(st[j] > st[j+1] ){
                    char temp = st[j];
                    st[j] = st[j+1];
                    st[j+1] = temp;
                }
            }
        }
        return String.copyValueOf(st);
    }
    public static boolean isPermutation(String string1 , String string2){
        char []s1 = string1.toCharArray();
        char []s2 = string2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i = 0 ;i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
            System.out.println( s1[i]++);

        }
        return true;
    }
    public static void main(String[] args) {
        String str = "sinrtg";
        String str1 = "string";

        System.out.println(isPermutation(str,str1));
//        Arrays.sort(new String[]{str}); //returns void
//        System.out.println(sortB(str));
//        System.out.println(sortB(str1));

//        String String1 = sortB(str);
//        String String2 = sortB(str1);
//        if(String1.equals(String2)){
//            System.out.println("EQUAL");
//        }
//        else{
//            System.out.println("NOT-EQUAL");
//        }

    }
}
