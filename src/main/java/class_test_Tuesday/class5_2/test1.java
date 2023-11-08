package class_test_Tuesday.class5_2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        final int length = 10;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        System.out.println("정수를 입력하세요");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
