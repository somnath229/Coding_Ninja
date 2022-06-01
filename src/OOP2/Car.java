package OOP2;

public class Car extends Vehicle {
    int gear;
    private int seats;
    private int speed;

    public Car(int seats, int speed) { //Constructor
        this.seats = seats;
        this.speed = speed;
        System.out.print("This Is Car constructor");
    }
    public Car() {
        System.out.print("This Is Car constructor");
    }
    public void print(){  //function overrideing and this will run not vehicle print()
        super.print();
        System.out.println("car class");
        System.out.println("gear : "+gear);
    }

    public int dif (int a ,  int b){
        return a-b;
    }

    void print1()
    {
        System.out.println("car");
    }

}
//    public static void main(String args[]) {
//        Car c = new Car();
//        c.name = "Ferrari";
//    }