package class_test_Tuesday.class5_9;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        final int max_num1=100;
        final int max_num2=10;
        int[][] storage = new int[max_num1][max_num2];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<storage.length;i++) {
            Arrays.fill(storage[i], 0);
        }
        String ans="",cnt="";
        String[] cnt2 = new String[3];
        int thingpos  , thingnum, thingcount,cnt3=0;
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
                    System.out.print("물품 번호(0~"+(max_num1-1)+")와 저장 위치(1~"+max_num2+")와 갯수를 같이 입력하시오 : ");
                    cnt=sc.nextLine();
                    cnt2=cnt.split(" ");
                    thingnum=Integer.parseInt(cnt2[0]);
                    thingpos=Integer.parseInt(cnt2[1]);
                    thingcount=Integer.parseInt(cnt2[2]);
                    if(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1) || thingcount<1) System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
                }while(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1) || thingcount<1);
                storage[thingnum][thingpos-1]+=thingcount;
            }else if (ans.equalsIgnoreCase("o")){
                do{
                    System.out.print("물품 번호(0~"+(max_num1-1)+")와 저장 위치(1~"+max_num2+")와 갯수를 같이 입력하시오 : ");
                    cnt=sc.nextLine();
                    cnt2=cnt.split(" ");
                    thingnum=Integer.parseInt(cnt2[0]);
                    thingpos=Integer.parseInt(cnt2[1]);
                    thingcount=Integer.parseInt(cnt2[2]);
                    if(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1) || thingcount<1) System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
                }while(thingpos<1 || thingpos>max_num2 || thingnum<0 || thingnum>(max_num1-1) || thingcount<1);
                if (storage[thingnum][thingpos-1] >= thingcount) {
                    storage[thingnum][thingpos - 1] -= thingcount;
                }
                else{
                    storage[thingnum][thingpos-1]=0;
                }
            }else if (ans.equalsIgnoreCase("s")){
                for(int i=1;i<=max_num2;i++){
                    System.out.print(i+" 번째: ");
                    cnt3=0;
                    for(int j=0 ;j<storage.length;j++){
                        if(storage[j][i-1]!=0) System.out.print(j+ "번 물품:" +storage[j][i-1]+ "개");
                        else cnt3++;
                    }
                    if(cnt3==max_num1) System.out.println("Empty");
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
