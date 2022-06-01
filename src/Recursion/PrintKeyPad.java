package Recursion;

public class PrintKeyPad {
        public static void printkeyPad(int input , String output){

            if(input == 0){
                System.out.println(output);
                return;
            }
            String[] ansArr = helpFunc(input % 10);

            for(int i = 0;i< ansArr.length;i++) printkeyPad(input / 10 , output + ansArr[i]);

        }
    private static String[] helpFunc(int n){
        String[] s = {""};
        if(n == 2){
            s = new String[]{"a","b","c"};
            return s;
        }
        else if(n == 3){
            s =new String[]{"d","e","f"};
            return s;
        }
        else if(n == 4){
            s =new String[]{"g","h","i"};
            return s;
        }
        else if(n == 5){
            s =new String[]{"j","k","l"};
            return s;
        }
        else if(n == 6){
            s =new String[]{"m","n","o"};
            return s;
        }
        else if(n == 7){
            s =new String[]{"p","q","r","s"};
            return s;
        }
        else if(n == 8){
            s =new String[]{"t","u","v"};
            return s;
        }
        else if(n == 9) {
            s =new String[]{"w","x","y","z"};
            return s;
        }
        else return s;

    }
    public static void main(String[] args) {

            printkeyPad(27 , "");
    }
}
