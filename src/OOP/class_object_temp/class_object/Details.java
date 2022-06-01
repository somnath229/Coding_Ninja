package OOP.class_object_temp.class_object;

public class Details {
    public String Name;
    private final int Roll_No;

//    public Details(){ //constructor -1
//        Roll_No = 100;
//    }
    public Details(String Name , int Roll_No){//constructor -2 with best use of final and this keyword
        System.out.println(this);
        this.Name = Name;
        this.Roll_No = Roll_No;
    }
//    public Details (String n){//constructor -3
//        Name = n;
//    }

//    public void setRoll_No(int rn){
//        if(rn <= 0) return ;
//        Roll_No = rn;
//    }
    public int getRoll_No(){
        return Roll_No;
    }
    public void print(){
        System.out.println(Name + " : "+Roll_No);
    }
}
