package class_test_Tuesday.class5_2;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        String ans="";
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[30];
        int i;
        String cnt;
        for(i=0;i<30;i++){
            System.out.print((i+1)+"번째 값 입력: ");
            cnt=sc.nextLine();
            arr[i]=Double.parseDouble(cnt);
            do {
                System.out.print("계속하시겠습니까? :  ");
                ans = "";
                ans += sc.nextLine();
                if(!ans.equalsIgnoreCase("n") && !ans.equalsIgnoreCase("y")){
                    System.out.println("=============================\n잘못된 값을 입력했습니다 다시 입력해주세요\n=============================");
                }
            }while(!ans.equalsIgnoreCase("n") && !ans.equalsIgnoreCase("y"));
            if( ans.equalsIgnoreCase("n")) {
                i++;
                break;
            }
        }
        sc.close();
        double arrM=0,arrS=0,cnt2;
        for(int j=0;j<i;j++){
            arrM+=arr[j];
        }
        arrM/=i;
        for(int j=0;j<i;j++){
            arrS+=Math.pow((arr[j]-arrM),2);
        }
        cnt2=arrS/i;
        arrS=Math.sqrt(arrS/i);
        System.out.println("평균: "+arrM+"   표준편차:   "+arrS+"(√"+cnt2+")");
    }
}
