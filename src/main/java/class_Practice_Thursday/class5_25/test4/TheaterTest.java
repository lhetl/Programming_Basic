package class_Practice_Thursday.class5_25.test4;

import java.util.Scanner;

public class TheaterTest {
    static Scanner sc = new Scanner(System.in);
    static TheaterSeats seats = new TheaterSeats();
    public static void main(String[] args) {

        int menu;

        seats.setSize(10, 8); // 좌석 수 지정

        do {
            displayMenu();
            menu = selectMenu();
            switch(menu) {
                case 0: // 예약 현황 표시
                    displaySeats(); break;
                case 1: // 예약 하기
                    reserveSeat(); break;
                case 2: // 예약 취소
                    cancelSeat(); break;
                case 3: // 종료
                    break;
            }
        } while(menu != 3);
        sc.close();
    }
    private static void displayMenu(){
        System.out.println("=================================");
        System.out.println("0: 예약현황 표시");
        System.out.println("1: 예약하기");
        System.out.println("2: 예약취소");
        System.out.println("3: 종료");
        System.out.println("=================================");
    }

    private static int selectMenu() {
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
    private static void displaySeats(){
        for(int i=0;i<seats.getRows();i++){
            for(int j=0;j<seats.getCols();j++){
                System.out.print(seats.getData(i,j)+"  ");
            }
            System.out.println("\n");
        }
    }
    private static void reserveSeat(){
        System.out.println("예약할 좌석의 행과 열을 차례대로 입력해주세요");
        int rowData=(sc.nextInt())-1;
        int colData=(sc.nextInt())-1;
        if(seats.getData(rowData,colData)==0) {
            seats.setData(rowData, colData, 1);
        }else{
            System.out.println("이미 예약된 좌석입니다");
        }
    }
    private static void cancelSeat(){
        System.out.println("취소할 좌석의 행과 열을 차례대로 입력해주세요");
        int rowData=(sc.nextInt())-1;
        int colData=(sc.nextInt())-1;
        if(seats.getData(rowData,colData)==1) {
            seats.setData(rowData, colData, 0);
        }else{
            System.out.println("이미 비어있는 좌석입니다");
        }
    }
}
