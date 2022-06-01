package OOP.class_object_temp.class_object;

public class ComplexNumber {
    private int real;
    private int imaginary;
    public ComplexNumber(int real , int imaginary ){
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }

    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public void print(){
        if(imaginary < 0 ){
            System.out.println( real + " - " + "i"+Math.abs(imaginary));
        }
        else  System.out.println(real + " + " +"i"+imaginary);
    }
    public void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    public void multiply(ComplexNumber c){
        int newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        this.imaginary = (this.imaginary * c.real) + (this.real * c.imaginary);
        this.setReal(newReal);
    }

    public static ComplexNumber sum(ComplexNumber c , ComplexNumber c1){
        int newReal = c.real + c1.real;
        int newImaginary = c.imaginary + c1.imaginary;
        ComplexNumber cn = new ComplexNumber(newReal , newImaginary);
        return cn;
    }
    public ComplexNumber conjugate(){
        int newImag = this.imaginary - (2 * this.imaginary);
        ComplexNumber cn = new ComplexNumber(this.real , newImag);
        return cn;
    }
}
