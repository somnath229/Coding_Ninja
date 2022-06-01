package Recursion;

public class KeyPad {
    public static void main(String[] args) {
        int n = 332;
        String[] combination = keyPad(n);
//        int i = 0;
//        while(i < combination.length){
//            System.out.println(combination[i]);
//        }

    }

    private static String[] keyPad(int n) {
            String s[] = {""};
        if(n == 0 ) {
            return s;
        }
        return s;
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
}
