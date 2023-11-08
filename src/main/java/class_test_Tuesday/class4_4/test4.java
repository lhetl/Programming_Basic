package class_test_Tuesday.class4_4;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans;
		System.out.print("하나의 문자를 입력하세요: ");
		ans=sc.next().charAt(0);
		sc.close();
		if(ans>=97) {
			ans=(char)(ans-32);
		}
		switch(ans) {
			case 'A':
			case 'O':
			case 'I':
			case 'U':
			case 'E':
				System.out.print("입력하신 문자는 모음입니다.!!");
				break;
			default:
				System.out.print("입력하신 문자는 자음입니다.!!");
		}

	}
}
