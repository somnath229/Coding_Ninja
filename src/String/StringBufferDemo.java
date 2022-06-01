package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
//        str.append("def");
//        str.setCharAt(0,'d');
//        System.out.println(str);

        for(int i = str.length();i<10;i++){
            char c =(char)('a'+i);
            str.append(c);
        }
        System.out.println(str);

        // it is mutable as it work on same string
        //.. string is immutable as it every time create a new string


        String s = "abc";
        for(int i = s.length();i<10;i++){
            char c =(char)('a'+i);
            s += c;
        }
        System.out.println(s);



        String st = "abc";
        String st1 = "abc";
        String stt = "abcabc";

        System.out.println(st == st1);

        st +="abc";
        System.out.println(st);
        System.out.println(stt == st);

        String string = "somnath dubey";
        for(int i = 0;i<=string.length()-1;i++){
            System.out.print(string.charAt(i)+" ");
        }
    }
}
