package OOP.class_object_temp.class_object;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f = new Fraction(20,30);
        f.print();

        f.setNumerator(15);
        int d = f.getDenominator();
        System.out.println(d);
        f.print();

        f.setNumerator(8);
        f.setDenominator(6);
        f.print();

        Fraction f1 = new Fraction(3,4);
        f.add(f1);
        f1.print();
        f.print();

        Fraction f2 = new Fraction(4,5);
        f2.multiply(f1);
        f1.print();
        f2.print();

        Fraction f3 = Fraction.add(f,f2); //static function
        f3.print();
        f.print();
        f2.print();

    }
}
