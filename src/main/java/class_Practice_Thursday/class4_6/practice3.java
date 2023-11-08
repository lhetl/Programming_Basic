package class_Practice_Thursday.class4_6;

import java.util.Random;     
import java.util.Scanner;
public class practice3 {
     public static void main(String[] args) {
    	 int answer = (new Random()).nextInt(100) + 1; // 1~100 무작위 숫자
    	 int guess;
    	 Scanner sc = new Scanner(System.in);
    	 boolean cont = true;		
    	 while(cont) { // 정답이 될 때 까지 무한 루프
    		 System.out.println("예측값 ? ");
    		 guess = sc.nextInt();	
    		 if (guess > answer) System.out.println("정답보다 크다");
    		 else if (guess < answer) System.out.println("정답보다 작다");
    		 else {
    			 System.out.println("정답!!!");
    			 cont = false;
    		 }
    	 }
    	 sc.close();
     }
}