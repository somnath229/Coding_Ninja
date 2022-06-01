package Recursion;

public class CheckAB {
    public static void main(String[] args) {
        String s = "abbaabb";
        boolean ans = checkAB(s);
        System.out.println(ans);
    }
    public static boolean checkAB(String str) {
        if(str.length() == 0) return true;
        if(str.length() == 1) {
            return str.charAt(0) == 'a';
        }
        if(str.charAt(0) == 'a'){
            if(str.charAt(1) == 'b' && str.length() > 2 && str.charAt(2) == 'b') {
                return checkAB(str.substring(3));
            }
            if(str.charAt(1) == 'a') return checkAB(str.substring(1));
            else return false;
        }
        return false;
    }
}
