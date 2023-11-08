package class_Practice_Thursday.class5_4;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        final int max_num1=100;
        final int max_num2=10;
        int[] storage = new int[max_num1];
        Scanner sc =new Scanner(System.in);
        Arrays.fill(storage,0);
        String ans="",cnt="";
        String[] cnt2 = new String[2];
        int thingpos =0 , thingnum=0;
        do{
            ans="";
            System.out.println("===================================");
            System.out.println("입고 (i)");
            System.out.println("출고 (o)");
            System.out.println("재고 (s)");
            System.out.println("종료 (q)");
            System.out.println("===================================");
            System.out.print("select menu ('i','o','s', or 'q') :");
            ans+=sc.nextLine();
            if(ans.equalsIgnoreCase("i")){
                do{
                    System.out.print("물품 번호(0~"+(max_num1-1)+")와 저장 위치(1~"+max_num2+")를 같이 입력하시오 : ");
                    cnt=sc.nextLine();
                    cnt2=cnt.split(" ");
                    thingnum=Integer.parseInt(cnt2[0]);
                    thingpos=Integer.parseInt(cnt2[1]);
                    if(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1)) System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
                }while(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1));
                storage[thingnum]=thingpos;
            }else if (ans.equalsIgnoreCase("o")){
                do{
                    System.out.print("물품 번호(0~"+(max_num1-1)+")를 입력하세요: ");
                    cnt=sc.nextLine();
                    thingnum=Integer.parseInt(cnt);
                    if(thingnum<0 || thingnum>(max_num1-1)) System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
                }while(thingnum<0 || thingnum>(max_num1-1));
                storage[thingnum]=0;
            }else if (ans.equalsIgnoreCase("s")){
                for(int i=1;i<=max_num2;i++){
                    System.out.print(i+" 번째: ");
                    for(int j=0 ;j<storage.length;j++){
                        if(storage[j]==i) System.out.print(j+ " ");
                    }
                    System.out.println();
                }

            }else if (ans.equalsIgnoreCase("q")){
                System.out.println("시스템을 종료합니다");
                break;
            }else{
                System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
            }

        }while(!ans.equalsIgnoreCase("q"));
        sc.close();

    }
}
