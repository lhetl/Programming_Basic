package class_Practice_Thursday.class3_30;

import java.util.Scanner;
public class practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 (음수도 가능) >> ");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자 (음수도 가능) >> ");
		int b = sc.nextInt();
		System.out.println("연산 (a : 덧셈, s : 뺄셈, m : 곱셈, d : 나눗셈) 선택");
		char c = sc.next().charAt(0);
		sc.close();
		double result;
		if (c == 'a') result = a + b;
		else if (c == 's') result = a - b;
		else if (c == 'm') result = a * b;
		else if (c == 'd') result = a / b;
		else {
			System.out.println("허용되지 않는 문자입니다.");
			return;
		}
		System.out.println("결과는 " + result + "입니다.");
	}
}
