package OOP.class_object_temp;

import OOP.class_object_temp.class_object.Student; // package.class;
import OOP.class_object_temp.class_object.temp.Temp; // package.package.class; like scanner

import static OOP.class_object_temp.class_object.Student.sum;//package.class.function;

public class StudentTemp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "somnath";
        s1.Roll_no = 23;

        System.out.println(s1.name);
        System.out.println(s1.Roll_no);

        int a = sum(2);
        int b = s1.sub(3);
        System.out.println(a);
        System.out.println(b);

        Student.Age s5 = new Student.Age();
        s5.age = 22;
        System.out.println(s5.age);

        Temp temp = new Temp();
        temp.name = "somnath";
        temp.surname = "dubey";
        System.out.println(temp.name);
        System.out.println(temp.surname);
    }
}
