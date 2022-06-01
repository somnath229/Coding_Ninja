package OOP.class_object_temp.class_object;

import OOP.class_object_temp.Polynomial;

public class PolynomialUse {
    public static void main(String[] args) {
//        Polynomial p = new Polynomial();
//        p.setCoefficient(0,3);
//        p.setCoefficient(7,2);
//        p.print();
//
//        Polynomial p1 = new Polynomial();
//        p1.setCoefficient(0,3);
//        p1.setCoefficient(2,2);
//        p1.print();
//        p1.setCoefficient(1,4);
//        p1.setCoefficient(2,5);
//        p1.print();
//
//        p.add(p1);
//        p.print();
//        p1.print();
        Polynomial p = new Polynomial();
        p.setCoefficient(2,1);
        p.setCoefficient(3,2);
        p.setCoefficient(6,4);
        p.print();
        Polynomial p2 = new Polynomial();
        p2.setCoefficient(4,3);
        p2.setCoefficient(2,1);
        p2.print();
        p.sub(p2);
        p.print();
        p2.print();
    }
}
