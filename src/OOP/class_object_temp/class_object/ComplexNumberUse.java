package OOP.class_object_temp.class_object;

public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(4,5);
        c.print();

        ComplexNumber c1 = new ComplexNumber(6,7);
//        c.add(c1);
//        c.print();
        c1.print();

        ComplexNumber c2 = new ComplexNumber(6,7);
//        c.multiply(c2);
//        c.print();
        c2.print();

        ComplexNumber c3 = ComplexNumber.sum(c,c2);
        c.print();
        c2.print();
        c3.print();

        ComplexNumber  c4 =   c1.conjugate();
        c1.print();
        c4.print();

    }
}
