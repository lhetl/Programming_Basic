package class_test_Tuesday.class3_21;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		double per;
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액을 입력하시오:");
		money= sc.nextInt();
		System.out.print("연이율을 입력하시오(단위 퍼센트)");
		per=sc.nextDouble();
		sc.close();
		double per2=per/100;
		double money2=money+money*per2;//1년후
		money2=money2+money2*per2; //2년후
		System.out.print("2년 후의 예금액은 "+money2+"입니다");

	}

}
