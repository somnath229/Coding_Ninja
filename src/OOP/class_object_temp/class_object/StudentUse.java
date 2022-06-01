package OOP.class_object_temp.class_object;

import java.util.Scanner;

import static OOP.class_object_temp.class_object.Student.sum;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println(s1); // address of s1

        s1.name = "somnath";
        s1.Roll_no = 123;

        int res = sum(2);
        int res2 = s1.div(2);
        int res3 = s1.mul(2);
        int res4 = s1.sub(2);
        int res5 = s1.mod(2);

        int res1 = sum(2);

        System.out.println(s1.name);
        System.out.println(s1.Roll_no);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);

        //Getter and Setter
//        Details d = new Details();
//        d.Name = "somnath";
//        d.setRoll_No(132);
//        System.out.println(d.getRoll_No());
//        System.out.println(d);

        //Constructor
        Details d1 = new Details("Somnath",12);
        System.out.println(d1);
        d1.print();
        Details d2 = new Details("somnathdubey" , 13);
        System.out.println(d2);
        d2.print();
//        Details d3 = new Details();
//        d3.Name = "somnathjii";
//        d3.print();
    }
}
