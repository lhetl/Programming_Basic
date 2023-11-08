package class_Practice_Thursday.class3_30;

import java.util.Random;  import java.util.Scanner;
public class practice3{
	public static void main(String[] args) {
		Random rnd = new Random();
		int quest = rnd.nextInt(100); // 무작위로 범위 내 숫자가 나옴
		char answer = (quest%2) == 0 ? 'e':'o';

		Scanner sc = new Scanner(System.in);
		System.out.println("짝수라 생각하면 e를, 홀수라고 생각하면 o를 입력 : ");
		char guess = sc.next().charAt(0);
		sc.close();

		if (guess == answer)
			System.out.println("축하합니다!!!");
		else
			System.out.println("다음 기회에 ...");
	}
}
