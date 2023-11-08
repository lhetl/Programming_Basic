package class_test_Tuesday.class4_4;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("+------Add");
		System.out.println("-------Subtract");
		System.out.println("*------Multiply");
		System.out.println("/------Divide");
		System.out.println("Q------Quit");
		System.out.println("**********************");
		System.out.print("연산을 선택하시오: ");
		Scanner sc = new Scanner(System.in);
		char ans=sc.next().charAt(0);
		double a,b,result=0;
		switch(ans) {
			case '+':
				System.out.print("두 수를 공백으로 분리하여 입력하시오: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				result=a+b;
				System.out.print(result);
				break;
			case '-':
				System.out.print("두 수를 공백으로 분리하여 입력하시오: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				result=a-b;
				System.out.print(result);
				break;
			case '*':
				System.out.print("두 수를 공백으로 분리하여 입력하시오: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				result=a*b;
				System.out.print(result);
				break;
			case '/':
				System.out.print("두 수를 공백으로 분리하여 입력하시오: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				result=a/b;
				System.out.print(result);
				break;
			case 'Q':
				System.exit(0);
			case 'q':
				System.exit(0);
			default:
				System.out.print("부호를 잘못 입력하셨습니다");
				System.exit(0);
		}
		sc.close();

	}

}
