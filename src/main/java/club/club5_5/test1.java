package club.club5_5;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        final int max_Size=5;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int sum=0;
        int[] arr = new int[max_Size];
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        for(int i=0;i<max_Size;i++){

            arr[i]=sc.nextInt();
        }
        for(int i=0;i<max_Size;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        sum/=max_Size;
        System.out.println("평균: "+max_Size+" 최댓값: "+max+" 최솟값: "+min);
    }
}
