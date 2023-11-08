package class_Practice_Thursday.class3_30;

import java.util.Scanner;
public class practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		sc.close();

		if (c >= 'a' && c <= 'z') c = (char)(c - 'a' + 'A');
		else if (c >= 'A' && c <= 'Z') c = (char)(c - 'A' + 'a');
		else {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		System.out.println("변환 결과 : " + c);
	}
}
