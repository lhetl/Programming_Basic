package class_Practice_Thursday.class4_20;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        System.out.println("정수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        final int arraylength=10;
        int[] Arraynum = new int[arraylength];
        for(int i=0;i<arraylength;i++){
            Arraynum[i]=sc.nextInt();
        }
//      Arrays 객체 사용
        int sum=Arrays.stream(Arraynum).sum();
        int max= Arrays.stream(Arraynum).max().getAsInt();
        int min = Arrays.stream(Arraynum).min().getAsInt();

//        수업
        sum =0;
        for(int i=0;i<arraylength;i++){
            sum=sum+Arraynum[i];
        }
        max=Integer.MIN_VALUE;
        for(int i=0;i<arraylength;i++){
            if(max<Arraynum[i]) max=Arraynum[i];
        }
        min=Integer.MAX_VALUE;
        for(int i=0;i<arraylength;i++){
            if(min>Arraynum[i]) min=Arraynum[i];
        }

        System.out.println("합: "+sum+" 최댓값: "+max+" 최솟값: "+min);
    }
}
