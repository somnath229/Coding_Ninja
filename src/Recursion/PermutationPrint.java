package Recursion;

public class PermutationPrint {
    public static int fact(int n) {
        int fact = 1;
        for(int i = n;i >= 1;i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static String[] permutationOfString(String input){

        if(input.length() == 1){
            String[] str = {input};
            return str;
        }
        char ansChar = input.charAt(0);
        String[] smallAns = permutationOfString(input.substring(1));

        String[]  ans = new String[smallAns.length * input.length()]; // if string size == 3 then output will be 3*2 = 6
        // smallAns = {bc, cb}
        int k = 0;
        for(int i = 0;i< smallAns.length ;i++){
            for(int j = 0;j< input.length();j++){
                ans[k] = smallAns[i].substring(0,j) + ansChar + smallAns[i].substring(j);
                k++;
            }
        }
        // ans = {abc, bac, bca, acb, cab, cba}
        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        String[] ans =  permutationOfString(s);
        for(int i = 0 ;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
