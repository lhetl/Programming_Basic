package class_Practice_Thursday.class4_13;

import java.util.Scanner;
public class practice2 {
     public static void main(String[] args) {
    	 System.out.println("n의 값을 입력하시오. ");
    	 Scanner sc = new Scanner(System.in);
    	 int n = sc.nextInt();
    	 sc.close();
    	 int i, factorial; // 큰숫자는 double형 선언해야 오버플로 발생 x
    	 for(i=1, factorial=1 ; i <= n; i++) { // i=n, factorial=1; i >= 1; i--
    		 factorial = factorial * i;      // 위의 조건식은 감소 방법
    	 }
    	 System.out.println("1 ~ " + n + "까지의 곱은 " + factorial + "입니다.");
     }
}
