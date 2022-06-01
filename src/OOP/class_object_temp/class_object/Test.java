package OOP.class_object_temp.class_object;
//
////class Studen{
////    int roll_no;
////    String name;
////}
////class Test {
////    public static void main (String[] args) {
////        Studen s=new Studen();
////        System.out.println(s);
////
////
////
////    }
////}
//
////When the object of Test class is created,the constructor with no arguments is called.
////When  this(10,20) is encountered , the constructor with two arguments int and int is called because this is the reference of the object. So using this way we can call more than one constructor.
//class Test
//{
//    int a;
//    int b;
//    Test()
//    {
//        this(10, 20);
//        System.out.print("constructor one ");
//    }
//    Test(int a, int b)
//    {
//        this.a = a;
//        this.b = b;
//        System.out.print("constructor two ");
//    }
//
//}
//class Box{
//    int width;
//    int height;
//    int length;
//    void volume(){
//        System.out.println(length * width * height);
//    }
//}
//class new_test{
//    public static void main(String[] args)
//    {
//        Test object = new Test();
//        Box b = new Box();
//        b.height = 5;
//        b.width = 4;
//        b.volume();
//    }
//}
//class Test{
//    static int marks;
//    void set_marks(int marks)
//    {
//        this.marks=marks;               //Line 1
//    }
//}
//class MCQ {
//    public static void main (String[] args) {
//        Test t=new Test();
//        t.set_marks(78);                //Line 2
//        System.out.print(Test.marks);   //Line 3
//    }
//}
//class Test
//{
//    static int a = 10;
//    static int b;
//    static void fun(){
//        b = a * 4;
//    }
//}
//class MCQ{
//    public static void main(String[] args)
//    {
//        Test t=new Test();
//        t.fun();
//        System.out.print(Test.a+Test.b);
//    }
//}
