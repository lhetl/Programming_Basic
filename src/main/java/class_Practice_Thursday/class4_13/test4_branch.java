package class_Practice_Thursday.class4_13;

import java.util.Scanner;

public class test4_branch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형 줄 수 입력:");
		int cnt=sc.nextInt()-1;
		for (int r = 0; r <=cnt; System.out.println(),r++){
			for (int start=cnt-r,end=cnt+r,c = 0; c <= 2 * cnt; c++) {
				if (start <= c && c <= end) System.out.print("*");
				else System.out.print(" ");
			}
		}
	}
}
