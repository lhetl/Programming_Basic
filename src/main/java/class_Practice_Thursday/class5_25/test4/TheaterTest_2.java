package class_Practice_Thursday.class5_25.test4;

public class TheaterTest_2 {
    public static void main(String[] args) {
        int menu;
        TheaterSeatsSystem system = new TheaterSeatsSystem();
        system.setSize(10, 8); // 좌석 수 지정

        do {
            system.displayMenu();
            menu = system.selectMenu();
            switch(menu) {
                case 0: // 예약 현황 표시
                    system.displaySeats(); break;
                case 1: // 예약 하기
                    system.reserveSeat(); break;
                case 2: // 예약 취소
                    system.cancelSeat(); break;
                case 3: // 종료
                    break;
            }
        } while(menu != 3);
    }

}
