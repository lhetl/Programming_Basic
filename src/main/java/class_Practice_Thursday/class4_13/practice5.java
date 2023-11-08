package class_Practice_Thursday.class4_13;

import java.util.Scanner;
public class practice5 {
	public static void main(String[] args) {
		System.out.println("n의 값을 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		sc.close();	
		int n = sc.nextInt();
		int i;
		for(i=2; i < n; i++) {
		 	if((n % i) == 0) break;
		}
		if (i == n) System.out.println("소수입니다.");
		else System.out.println("소수가 아닙니다.");
		
	}
}