package OOP2;

public class Vehicle {
//    private Vehicle(){
//        System.out.println("constructur");
//    }  --> can't be accessed by VehicleUse class

    public Vehicle(){
        System.out.println("this is vehicle constructor");
    }

    private int topSpeed;
//    String color;
      protected String color;  //Truck.java

    public void setTopSpeed(int topSpeed){
//        topSpeed = topSpeed;  //->> will return 0 as it intialize this.number in this.number not number in this.number
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed(){
        return topSpeed;
    }
    public void print(){
        System.out.println("vehicle class");
        System.out.println("topSpeed : "+topSpeed);
        System.out.println("color : " + color);
    }

    public int sum (int a ,  int b){
        return a+b;
    }

    String colour;
    private int number;
    void print1()
    {
        System.out.println("vehicle");
    }
}
