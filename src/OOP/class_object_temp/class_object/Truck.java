package OOP.class_object_temp.class_object;

import OOP2.Vehicle;

public class Truck extends Vehicle {
    int maxCapacity;
    public void print(){
        super.print();
        System.out.println("sub class in different package");
        System.out.println("setTop speed : " + getTopSpeed());
        System.out.println("Color : "+ color);
    }

    public static void main(String[] args) {
        Truck t = new Truck();
        t.print();
    }
}
