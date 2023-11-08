package class_test_Tuesday.class5_23.test0;

public class test1 {
    private int capacity=3;
    private int size=0;

    private int[] data = new int[capacity];

    public int getSize(){return size;}
    public int getCapacity(){return capacity;}
    public int append(int val){
        if(val >0){
            if(capacity==size){
                capacity=2*capacity;
                int[] data1=new int[capacity];
                for(int i=0;i<size;i++){
                    data1[i]=data[i];

                }
                data=data1;
            }
            data[size]=val;
            size++;
            return val;
        }
        else return -1;
    }
    public int delete(){
        if (size != 0) {
            size--;
            return data[size];
        }
        else return -1;
    }
    public int shrink(){
        if(size<capacity/2){
            capacity=capacity/2;
            int[] data1=new int[capacity];
            for(int i=0;i<size;i++){
                data1[i]=data[i];
            }
            data=data1;
            return capacity;
        }
        else return -1;
    }
}
