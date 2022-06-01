package OOP2;

public class Audi extends Car {
    Audi(int x, int y) { //Constructor
        super(x,y);
        System.out.print("This Is Para Audi ");
    }

    void Audi() {
        System.out.print("This Is Def fuction  Audi");
    }

    Audi() {
        System.out.print("This Is Audi ");
//        super(); --> super can always be called in first / starting
    }

    void print1()
    {
        System.out.println("Honda");
    }
}
