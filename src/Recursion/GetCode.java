package Recursion;

public class GetCode {
    public static char getchar(int n) {
        return (char)(96+n);

    }
    public static  String[] getCode(String input){

        if(input.length() <= 0){
            String[] myAns = { "" };
            return myAns;
        }
//        int firstdigit = (input.charAt(0) - '0');
        char getChar = input.charAt(0);
        char ansChar = getCharCode('0'-getChar);
        String[] smallAns1 = getCode(input.substring(1));

//        int firsttwodigits = 0;
        String[] smallAns2 = new String[0];
        int getChar2 = 0;
        if(input.length() >= 2){
            getChar2 = Integer.parseInt(input.substring(0,2));
            if(getChar2 >10 && getChar2 <= 26) smallAns2 = getCode(input.substring(2));
//            firsttwodigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
//            if (firsttwodigits > 10 && firsttwodigits <= 26) {
//                smallAns2 = getCode(input.substring(2));
//            }
        }
        char ansChar2 = getCharCode( getChar2);
//        System.out.println("ans : "+ansChar);
//        System.out.println("ans2 : "+ansChar2);


        String[] ans = new String[smallAns1.length + smallAns2.length ];
        int k = 0;
//        ans[k] = String.valueOf(ansChar);
//        ans[k+1] = String.valueOf(ansChar2);
        for(int i = 0 ;i< smallAns1.length;i++){
//            char first = getchar(firstdigit);
            ans[k] = ansChar + smallAns1[i];
            k++;
        }
        for(int i = 0 ;i < smallAns2.length;i++){
//            char first = getchar(firsttwodigits);
            ans[k] = ansChar2 + smallAns2[i];
            k++;
        }
        return ans;
    }
    private static char getCharCode(int n){
        char ans;
        if(n >= 10 && n<=26 ){
            ans = (char) (97 + n - 1);
        }
        else  ans = (char) (97 - n -1);
        return ans;
    }

    public static void main(String[] args) {
        String s = "1123";
        String ans[] = getCode(s);
        for(int i = 0 ;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
