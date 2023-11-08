package class_Practice_Thursday.class4_6;

import java.util.Random;     
import java.util.Scanner;
public class practice5 {
     public static void main(String[] args) {
    	 int answer = (new Random()).nextInt(100) + 1; // 1~100 무작위 숫자
    	 int guess;
    	 char programCont;
    	 Scanner sc = new Scanner(System.in);
    	 boolean cont = true;		
    	 do { // 바깥 반복문 추가, 제어하기 위해 programCont 변수 선언하여 사용
    		 cont = true;
    		 System.out.println("게임을 시작합니다.");
    		 while(cont) {
    			 System.out.println("예측값 ? ");
    			 guess = sc.nextInt();
    			 if (guess > answer) System.out.println("정답보다 큽니다.");
    			 else if (guess < answer) System.out.println("정답보다 작습니다.");
    			 else {
    				 System.out.println("정답입니다!!!");
    				 cont = false;
    			 }
    		 }
    		 System.out.println("계속 하시겠습니까 ? ('y' or 'n') "); 
    		 programCont = sc.next().charAt(0);
    	 } while(programCont == 'y');
    	 System.out.println("게임을 종료합니다.");
    	 sc.close();	
}

}