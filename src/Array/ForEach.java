package Array;

public class ForEach {
    public static void main(String[] args) {
        int []arr = new int [4];
//        System.out.println(arr);
        arr[0]= 1;
        arr[1]= 4;
        arr[2]= 2;
        arr[3]= 3;
        for(int x : arr){
            System.out.println(x);
        }

        //var decides its data type on its own ->  introduced in java JDK:10
        //VAR CAN BE  USED AS VARIABLE(IDENTIFIER) AS WELL AS DATATYPE
        //var can also be  used in array but in this format
        var a = new int[4];
        a[3]= 4;
        a[2]= 2;
        a[1]= 1;
        a[0]= 3;
        for( var x : a){
            System.out.println(x);
        }


        var i = 2;
        var k = 2.2;
        var j = 'a';
        var l = true;
        System.out.println(i);
        System.out.println(k);
        System.out.println(j);
        System.out.println(l);


        int var = 10;
        System.out.println(var);
    }
}
