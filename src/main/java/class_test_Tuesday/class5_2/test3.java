package class_test_Tuesday.class5_2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        final double MAX =Math.pow(2,64)-1;
        int num;
        do {
            System.out.print("10진수를 입력하시오: ");
            num = sc.nextInt();
            if(num>MAX || num<0){
                System.out.println("=============================\n잘못된 값을 입력했습니다 다시 입력해주세요\n=============================");
            }
        }while (num>MAX || num<0);
        int num2=num;
        int[] arr = new int[64];
        if(num==0) System.out.println("0");
        for(int i=0;num>=1;i++){
            if(num%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
            num/=2;
        }
        sc.close();
        for(int i=(int)(Math.log(num2)/Math.log(2))+1;i>0;i--){
            System.out.print(arr[i-1]);
        }
    }
}
