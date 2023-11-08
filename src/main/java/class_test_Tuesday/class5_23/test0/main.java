package class_test_Tuesday.class5_23.test0;

import class_Practice_Thursday.class3_9.class3_9_study.test;

public class main {
    public static void main(String[] args){
        test1 myarray = new test1();
        myarray.append(3);
        int res = myarray.append(-2);
//        if (res==-1) System.out.println("값이 동적 배열에 추가되지 못했습니다");
        myarray.append(4);
        System.out.println(myarray.getSize()+" "+myarray.getCapacity());
        myarray.append(5);
        myarray.append(6);
        System.out.println(myarray.getSize());
        System.out.println(myarray.getCapacity());
        myarray.shrink();
        System.out.println(myarray.getCapacity());
        myarray.delete();
        myarray.delete();
        myarray.shrink();
        System.out.println(myarray.getCapacity());
    }
}
