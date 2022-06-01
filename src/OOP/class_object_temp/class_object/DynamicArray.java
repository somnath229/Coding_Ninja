package OOP.class_object_temp.class_object;

public class DynamicArray {
    private int data[];
    private int dataIndex;
    public DynamicArray(){
        data = new int[5];
        dataIndex = 0;
    }
    public int size(){
        return dataIndex;
    }
    public void add(int element, int index){

        if(index >= data.length){
            restructure();
        }
        data[index] = element;
        dataIndex = index ;
    }
    public void restructure(){
        int temp[] = data;
        data = new int[data.length * 2];
        for(int i = 0;i< temp.length;i++){
            data[i] = temp[i];
        }
    }
    public void set( int index ,int element){
//        if(index > dataIndex) return ;           //excempted only for polynomial
        if(index < dataIndex) data[index] = element;
        else {
            add(element,index);
        }
    }
    public int get(int index){
        if(index > dataIndex){
            //TODO error out
            return -1;
        }
        return data[index];
    }
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        else return false;
    }
    public int removeLast(){
        if(size() == 0) return -1;
        int value = data[dataIndex-1];
        data[dataIndex] = 0;
        dataIndex--;
        return value;
    }
}
