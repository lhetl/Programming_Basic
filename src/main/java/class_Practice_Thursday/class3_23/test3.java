package class_Practice_Thursday.class3_23;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 대문자:");
		char uc,lc;
		uc=sc.next().charAt(0);
		sc.close();
		if('A' <= uc && uc <='Z'){
			lc = (char)('a'+(uc - 'A'));
			System.out.print(lc);
		}else {
			System.out.println("영문 대문자가 아닙니다");
		}
	}

}
