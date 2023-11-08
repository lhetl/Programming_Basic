package class_Practice_Thursday.class4_6;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		do {		
			System.out.println("a : 덧셈, s : 뺄셈, m : 곱셈, d : 나눗셈, q : 종료 ");
			char c = sc.next().charAt(0);
					
			if (c == 'q') {
				System.out.println("프로그램을 종료하였습니다.");
				cont = false;
			}
			else if (!(c == 'a' || c == 's' || c == 'm' || c == 'd')) 
				System.out.println("휴효하지 않는 메뉴입니다."); 
			else {
				System.out.println("첫 번째 숫자 (음수도 가능) >> ");
				int a = sc.nextInt();
				System.out.println("두 번째 숫자 (음수도 가능) >> ");
				int b = sc.nextInt();
				sc.close();
				double result = 0;
				if (c == 'a') result = a + b;
				else if (c == 's') result = a - b;
				else if (c == 'm') result = a * b;
				else if (c == 'd') result = a / b;
				System.out.println("결과는 " + result + "입니다.");
			}
		} while(cont);
	}

}
