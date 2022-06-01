package Recursion;

public class SubSequence {
    public static String[] subSequence(String str){
        String[] s = {""};
        if(str.length() == 0) return s;

        int n = 2;
        if(n == 2){
            s = new String[]{"a", "b", "c"};
        }
        System.out.println(s.length);
        for(int i = 0;i< s.length;i++) System.out.println(s[i]);
        String[] smallAns = subSequence(str.substring(1));
        String[] ans = new String[2*smallAns.length];
        int k = 0;
        for(int i = 0 ;i< smallAns.length;i++){
            ans [k] = smallAns[i];
            k++;
        }
        for(int i = 0 ;i< smallAns.length;i++){
            ans [k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(24/10);
        System.out.println(24%10);
        String str = "xyz";
        String[] s = subSequence(str);
        int i = 0 ;
        System.out.println(s.length);
        while(i < s.length){
            System.out.print(s[i] + " ");
            i++;
        }
    }
}
