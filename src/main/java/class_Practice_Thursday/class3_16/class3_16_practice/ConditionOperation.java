package class_Practice_Thursday.class3_16.class3_16_practice;
import java.util.Scanner;
public class ConditionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("첫 번째 숫자 (음수도 가능) >> ");
		int s1 = sc.nextInt();
		System.out.println("두 번째 숫자 (음수도 가능) >> ");
		int s2 = sc.nextInt();
		sc.close();
		s1 = s1 > 0 ? s1 : -s1; // s1 절대값을 구한다
		s2 = s2 > 0 ? s2 : - s2; // s2 절대값을 구한다

		int sum = s1 + s2;
		int max = s1 > s2 ? s1 : s2;

		System.out.println("절대값 합 : " + sum);
		System.out.println("절대값 최대 : " + max);
	}

}
