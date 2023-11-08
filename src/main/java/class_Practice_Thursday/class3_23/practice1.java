package class_Practice_Thursday.class3_23;

import java.util.Scanner;
public class practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("첫 번째 숫자 (음수도 가능) >> ");
		int s1 = sc.nextInt();
		System.out.println("두 번째 숫자 (음수도 가능) >> ");
		int s2 = sc.nextInt();
		System.out.println("세 번째 숫자 (음수도 가능) >> ");
		int s3 = sc.nextInt();
		sc.close();

		int meadianVal;
		if(s1 > s2) {
			if (s2 > s3)
				meadianVal = s2;
			else if (s3 > s1)
				meadianVal = s1;
			else
				meadianVal = s3;
		}
		else {
			if (s1 > s3)
				meadianVal = s1;
			else if (s2 < s3)
				meadianVal = s2;
			else
				meadianVal = s3;
		}
		System.out.println("중간값 : " + meadianVal);
	}
}