package class_Practice_Thursday.class5_4;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        final int x_max = 10;
        final int y_max = 8;
        Scanner sc=new Scanner(System.in);
        int[][] stage = new int[x_max][y_max];
        String cont="";
        for(int i=0;i<stage.length;i++){
            Arrays.fill(stage[i],0);
        }

        int x_put=0,y_put=0,count=0;
        do{
            count=0;
            for(int i=0;i< stage.length;i++){
                for(int j=0;j<stage[i].length;j++){
                    if(stage[i][j]==0){
                        count++;
                    }
                }
            }
            if(count==0){
                for(int i=0;i< stage.length;i++){
                    for(int j=0;j<stage[i].length;j++){
                        System.out.print(stage[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("죄송합니다 더 이상 남은 좌석이 없습니다");
                do{
                    System.out.print("좌석을 모두 초기화하여 다시 시작하시겠습니까? :");
                    cont=sc.nextLine();
                    if(cont.equalsIgnoreCase("n")){
                        System.out.println("시스템을 종료합니다");
                        System.exit(0);
                    }else if(cont.equalsIgnoreCase("y")){
                        System.out.println("시스템을 초기화합니다");
                        for(int i=0;i<stage.length;i++){
                            Arrays.fill(stage[i],0);
                        }
                    }else{
                        System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
                    }
                }while(!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"));
            }
            for(int i=0;i< stage.length;i++){
                for(int j=0;j<stage[i].length;j++){
                    System.out.print(stage[i][j]+" ");
                }
                System.out.println();
            }
            do {
                System.out.print("예약할 좌석의 번호를 입력하시오 (남은 좌석 수:" + count + " 종료:0) :");
                x_put = sc.nextInt() - 1;
                y_put = sc.nextInt() - 1;
                if(x_put==-1 || y_put==-1){
                    for(int i=0;i< stage.length;i++){
                        for(int j=0;j<stage[i].length;j++){
                            System.out.print(stage[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                }else if (x_put > (x_max-1) || x_put<-1 || y_put > (y_max-1) || y_put<-1){
                    System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
                    continue;
                }else if (stage[x_put][y_put] == 1) {
                    System.out.println("해당 좌석은 예약된 좌석입니다 다시 입력해주세요");
                    continue;
                }else {
                    stage[x_put][y_put] = 1;
                    break;
                }
            }while(true);
        }while(true);

    }
}
