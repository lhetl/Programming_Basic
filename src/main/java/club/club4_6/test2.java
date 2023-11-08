package club.club4_6;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("출행할 행 개수를 입력해주세요: ");
		int linecnt=sc.nextInt();
		sc.close();
		System.out.println("==========================삼각형===================");
		for (int i=0;i<linecnt;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========================역삼각형===================");
		for (int i=0;i<linecnt;i++) {
			for(int j=0;j<linecnt-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
