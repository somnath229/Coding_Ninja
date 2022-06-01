package String;

public class StringIntro {
    public static void main(String[] args) {
        char arr[] = {'c','o','d','i','n','g'};
        for(int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        String e = "";
        System.out.println(e.length()); //null string
        String e1 = " ";
        System.out.println(e1.length()); // not null string
        String s = "somnath";
        System.out.println(s.length());
        String s1 = " Coding";
        String s2 = " dubey";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));


        System.out.println(s+s2);
        String result = s + s2;
        System.out.println(result);
        s = s + s2;
        System.out.println(s);
        s += s1;
        System.out.println(s);
        s = s.concat(s2);
        System.out.println(s);

        String str = "Coding";
        String str1 = "Ninja";
        String s11 = "Coding";

        System.out.println(str.equals(str1));
        System.out.println(str.equals(s11));
        System.out.println(str.contains("ing"));
        System.out.println(str.compareTo(s11));

        System.out.println(str.compareTo(str1)); //subtracts ASCII VALUE of 1st character
        String a ="abcd";
        String b="abcda";
        System.out.println(a.compareTo(b)); //The compareTo function returns the difference of length of strings when they are not equal.In case if the lengths are equal, then it returns the non-zero difference in ASCII values starting from 0th index to (n-1)st index and if all the indices of string are same, it returns 0.

        String a1="coding";
        System.out.println(a1.substring(0));
        System.out.println(a1.substring(6)+"print nothing as at s1.length() index");
        System.out.println(a1.substring(0,5));
        System.out.println(a1.substring(0,6));
//        System.out.println(a1.substring(0,7)); //error
//        System.out.println(a1.substring(-1,6));//error

        for(int i=2;i<4;i++)
        {
            System.out.print(a1.substring(i));
        }
    }
}
