package class_test_Tuesday.class5_2;

import java.util.Random;

public class test5 {
    public static void main(String[] args){
        Random rnd = new Random();
        int num,cnt=0;
        int[] arr=new int[20];
        for(int i=0;i<1000;i++){
            num=rnd.nextInt(20);
            arr[num]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            System.out.println(i+" :"+ arr[i]);
            if(max<arr[i]) {
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println("최대 발생 수:"+cnt);
    }
}
