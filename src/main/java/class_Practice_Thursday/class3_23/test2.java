package class_Practice_Thursday.class3_23;
import java.util.Scanner;
public class test2 {
	public static void mu() {
		Scanner sc = new Scanner (System.in);
		String ans;
		System.out.print("\n*********************\n+---Add\n----Subtract\n*---Multiply\n/---Divide\nQ---Quit\n*********************");
		System.out.print("\n연산을 선택하시오:");
		ans = sc.next();
		int n=ans.charAt(0);
		if ( n ==42 || n==45 || n== 43 || n== 47) {
			System.out.print("두 수를 공백으로 분리하여 입력하시오:");
			double a,b;
			a=sc.nextDouble();
			b=sc.nextDouble();
			if (n==42) System.out.print(a*b);
			if (n==43) System.out.print(a+b);
			if (n==45) System.out.print(a-b);
			if (n==47) {
				if(b!=0) {
					System.out.print(a/b);
				}else if (b==0){
					System.out.print("잘못된 숫자를 입력했습니다\n");
				}
			}

			mu();
		}else if (n==81 || n==113) {
			sc.close();
			System.exit(0);

		}else {
			System.out.print("잘못된 문자를 입력했습니다\n");
			mu();
		}
	}
	public static void main(String[] args) {
		mu();
	}

}
