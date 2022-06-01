package Recursion;

public class PrintSubSequence {
    public static void printSubSeq(String input , String output){

        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        printSubSeq(input.substring(1) , output);
        printSubSeq(input.substring(1) , output + input.charAt(0));

    }
    public static void main(String[] args) {
        printSubSeq("xyza" , "");
    }
}
