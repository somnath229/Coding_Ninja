package String;

public class StringStorage {
    public static void main(String[] args) {
        String str = "somnath";
        String str1 = "somnath";
        String s = new String("somnath");
        String s1 = new String("somnath");
        System.out.println(str == str1);
        System.out.println(s == s1); //these identifier or varibles store address so they have same addresss(i.e. string present is string pool so return same address). Hence return true
        System.out.println(str == s); //these identifier or varibles store address so they differ(i.e. as diffrent memory allocated to different object of string type). Hence return false
        System.out.println(str1.equals(s)); // but it check for content of string. Hence return true

        System.out.println();
        String str2 = "somnath";
        str += "xyz";
        str = str.concat("ada");
        System.out.println(str == str1);
        System.out.println(str2 == str1);
        System.out.println(str);

        /*
        String didn't changed but there address got changed as a new string made in string pool
        As we can see str1 and str2 share same address
        So we conclude that in string orignal strings are not affected
        IN JAVA STRINGS ARE IMMUTABLE.
         */

        //WE WILL CHECK THIS IN CONCEPT OF ARRAY
        int arr[] = {2,1};
        int arr1[] = {2,1};
        if(arr == arr1) {
            System.out.println("equal");
        }
        else System.out.println("not equal");
        System.out.println(arr);
        System.out.println(arr1);
        //we see both have diffrent address --> the same happen with string

        String st1="abc";
        String st2="";
        System.out.println(st1.contains(st2)); //every string contain empty string either in end or start or in between

        System.out.println(st1.substring(0,1));
        System.out.println(st1.substring(0,2));
        System.out.println(st1.substring(0,3));
    }
}
