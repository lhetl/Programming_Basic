package class_Practice_Thursday.class3_23;

import java.util.Scanner;
public class practice2{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("좌표의 x값 >> ");
		int x = sc.nextInt();
		System.out.println("좌표의 y값 >> ");
		int y = sc.nextInt();
		sc.close();
		int qud;
		if (x == 0 || y == 0) {
			System.out.println("x나 y 중 하나가 0이면 분면 판단 불가");
			return;
		}

		if (x > 0) {
			if (y > 0) qud = 1;
			else qud = 4;
		}
		else {
			if (y > 0) qud = 2;
			else qud = 3;
		}
		System.out.println("좌표 (" + x + ", " + y + ")의 분면은 "
				+ qud + "분면입니다.");
	}
}
