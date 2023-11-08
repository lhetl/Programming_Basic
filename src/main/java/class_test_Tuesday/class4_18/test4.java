package class_test_Tuesday.class4_18;

import java.util.Random;
import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        String result="";
        int userRSP, comRSP;
        for(char ans=' ';ans!='n';){
            System.out.print("\n가위(0), 바위(1), 보(2)를 선택하세요: ");
            userRSP = sc.nextInt();
            comRSP = r1.nextInt(3);
            if (comRSP == 0) {
                result = "가위";
            } else if (comRSP == 1) {
                result = "바위";
            } else if (comRSP == 2) {
                result = "보";
            }

            if ((userRSP - comRSP) == 1 || (userRSP - comRSP) == -2) {
                System.out.println("컴퓨터는 " + result + "를 내서 사용자가 이겼습니다.!!");
                System.out.print("user: " + userRSP + ", com: " + comRSP);
            } else if ((userRSP - comRSP) == -1 || (userRSP - comRSP) == 2) {
                System.out.println("컴퓨터는 " + result + "를 내서 사용자가 졌습니다.!!");
                System.out.print("user: " + userRSP + ", com: " + comRSP);
            } else if (userRSP == comRSP) {
                System.out.println("컴퓨터는 " + result + "를 내서 사용자와 비겼습니다.!!");
                System.out.print("user: " + userRSP + ", com: " + comRSP);
            }

            System.out.print("\n계속 하시겠습니까? (\"y\" or \"n\") :");
            ans=sc.next().charAt(0);
        }
        sc.close();
        System.out.println("게임을 종료합니다");
    }
}
