package class_Practice_Thursday.class3_23;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {65,69,73,79,85};
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력:");
		char c;
		c=sc.next().charAt(0);
		sc.close();
		if ((c >=65 && c<=90) || (c>=97 && c<=122)) {
			if (c>=97) {
				c=(char)(c-32);
			}
			int cnt=0;
			for (int i=0;i<list.length;i++) {
				if(list[i]==(int)c){
					cnt=1;
				}
			}if (cnt==1) {
				System.out.print("입력하신 문자는 모음입니다!");
			}else {
				System.out.print("입력하시 문자는 자음입니다!");
			}
		}else {
			System.out.print("영문자가 아닌 문자를 입력했습니다");
		}
	}

}
