package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class StringScanner {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\Somnath Dubey\\Documents\\JavaIDE\\out\\production\\Coding Ninja\\src\\String\\Demo.txt");
//        Scanner sc=new Scanner(file);
//        sc.useDelimiter("\\Z");
//        String demo = sc.nextLine();
//        System.out.println(demo);


        Scanner sc=new Scanner(System.in);  //System.in represent input stream

        String str = sc.next();
        String str1 = sc.next();

        System.out.println(str + " " + str.length());
        System.out.println(str1 + " " + str1.length());

        String s = sc.nextLine();
        System.out.println(s + " " + s.length());

        int i = sc.nextInt();
        String s1 = sc.nextLine();
        System.out.println(i);
        System.out.println(s1 + " " + s1.length());

        int j = sc.nextInt();
        String s2 = sc.next();
        System.out.println(j);
        System.out.println(s2 + " " + s2.length());



    }
}
