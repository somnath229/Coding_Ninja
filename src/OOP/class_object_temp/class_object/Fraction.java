package OOP.class_object_temp.class_object;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator , int denominator){
        this.numerator = numerator;
        if(denominator == 0) {
            //TODO error out
        }
        this.denominator = denominator;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }
    public void setDenominator(int denominator){
        if(denominator == 0) {
            //TODO error out
            return;
        }
        this.denominator = denominator;
        simplify();
    }
    public void simplify(){
        int gcd = 1;
        int smallest = Math.min(numerator,denominator);
        for(int i = 2;i <= smallest ; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd ;
        denominator = denominator/gcd ;
    }
    public void print(){
        if(denominator == 1) System.out.println(numerator);
        else System.out.println(numerator + " / " + denominator);
    }
    public void add( Fraction f){
         this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
         this.denominator = f.denominator * this.denominator;
         simplify();
    }
    public void  multiply(Fraction f){
        this.numerator *=f.numerator;
        this.denominator *= f.denominator;
        simplify();
    }
    public static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDen = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNum , newDen);
        return f;
    }

}
