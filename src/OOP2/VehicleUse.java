package OOP2;

 class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();

        Car c = new Car();
        c.gear = 10;
        c.setTopSpeed(100);
//        System.out.println(c.getTopSpeed());
        c.color = "Black";
        c.print();

//        Audi a =new Audi();
        Audi a = new Audi(5,7);
        a.Audi();

        Car c1 = new Audi();
        c1.print1();

        Vehicle v1 = new Car();
        v1.print();                // present in both class function
        System.out.println(v1.sum(2,5));       //super class function
//        v1.dif(5,2);           //sub class function

    }
}
