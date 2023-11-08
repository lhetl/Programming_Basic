package class_Practice_Thursday.class4_20;

import java.util.Arrays;
import java.util.Random;

public class test1 {
    public static void main(String[] args){
        int[] randomArray = new int[10];
        Arrays.fill(randomArray,0);
        Random rnd = new Random();
        for(int i=0;i<randomArray.length;i++){
            randomArray[i]=rnd.nextInt(201)-100;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
