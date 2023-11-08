package class_Practice_Thursday.class5_25.test4;

import java.util.Scanner;

public class TheaterSeatsSystem {
    private int[][] data;
    static Scanner sc =new Scanner(System.in);
    public void setSize(int r,int c){
        data=new int[r][c];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=0;
            }
        }
    }

    public int getRows(){
        return data.length;
    }
    public int getCols(){
        return data[0].length;
    }

    public int getData(int r, int c) {
        return data[r][c];
    }

    public void setData(int r,int c,int v) {
        data[r][c]=v;
    }
    public void displayMenu(){
        System.out.println("=================================");
        System.out.println("0: 예약현황 표시");
        System.out.println("1: 예약하기");
        System.out.println("2: 예약취소");
        System.out.println("3: 종료");
        System.out.println("=================================");
    }

    public int selectMenu() {
        int ans;
        do{
            System.out.println("값을 입력하세요(0~3)");
            ans = sc.nextInt();
            if(ans >3 || ans <0){
                System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요 \n ========================================");
            }
        }while(ans>3 || ans<0);
        return ans;
    }
    public void displaySeats(){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
    public void reserveSeat(){
        System.out.println("예약할 좌석의 행과 열을 차례대로 입력해주세요");
        int rowData=(sc.nextInt())-1;
        int colData=(sc.nextInt())-1;
        if(data[rowData][colData]==0) {
            data[rowData][colData]=1;
        }else{
            System.out.println("이미 예약된 좌석입니다");
        }
    }
    public void cancelSeat(){
        System.out.println("취소할 좌석의 행과 열을 차례대로 입력해주세요");
        int rowData=(sc.nextInt())-1;
        int colData=(sc.nextInt())-1;
        if(data[rowData][colData]==1) {
            data[rowData][colData]=0;
        }else{
            System.out.println("이미 비어있는 좌석입니다");
        }
    }
}
