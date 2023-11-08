package class_Practice_Thursday.class4_6;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,cnt;
		Scanner sc = new Scanner(System.in);
		System.out.print("층의 개수를 입력하세요: ");
		cnt=sc.nextInt();
		sc.close();
		while (i<cnt) {
			j=0;
			while (j<cnt-i-1) {
				System.out.print(" ");
				j++;
			}
			j=0;
			while (j<2*i+1) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}

}
