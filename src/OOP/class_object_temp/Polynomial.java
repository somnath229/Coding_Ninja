package OOP.class_object_temp;

import OOP.class_object_temp.class_object.DynamicArray;

public class Polynomial {
    DynamicArray coefficient;
    public Polynomial(){
        coefficient = new DynamicArray();
        int deg ;
        int cof;
    }
    public void setCoefficient(int deg , int cof){
       coefficient.set(deg , cof);
    }
    public int getCoefficient(int deg){
//        System.out.println(coefficient.get(6)+ "deg");
        return coefficient.get(deg);
    }
    public int degree(){
        return coefficient.size();
    }
    public void print(){
        for(int i = 0;i <= degree() ;i++){
            if(getCoefficient(i) != 0){
                System.out.print(getCoefficient(i) + "x"+i+" + " );
            }
        }
        System.out.println();
    }
    public void add(Polynomial p ){
        for(int i = 0;i<= p.degree();i++){
            this.setCoefficient(i, this.getCoefficient(i) + p.getCoefficient(i));
        }
    }
    public void sub(Polynomial p ){
        for(int i = 0;i<= p.degree();i++){
            this.setCoefficient(i, this.getCoefficient(i) - p.getCoefficient(i));
        }
    }
//    public void mul(Polynomial p ){
//        for(int i = 0;i<= p.degree();i++){
//            this.setCoefficient(i, this.getCoefficient(i) + p.getCoefficient(i));
//        }
//    }
}
