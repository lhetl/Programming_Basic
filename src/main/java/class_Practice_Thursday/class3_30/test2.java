package class_Practice_Thursday.class3_30;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int byear,bmonth,bday,cyear,cmonth,cday,age=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("생년월일을 입력하세요:");
		byear=sc.nextInt(); bmonth=sc.nextInt(); bday=sc.nextInt();
		System.out.print("현재 년월일을 입력하세요:");
		cyear=sc.nextInt(); cmonth=sc.nextInt(); cday=sc.nextInt();
		sc.close();
		if(cmonth>bmonth) {   //생일지남
			age=cyear-byear;
		}else if(cmonth==bmonth) {
			if(cday>=bday) {//생일 지남
				age=cyear-byear;
			}else {   //생일 안지남
				age=cyear-byear-1;
			}
		}else {
			age=cyear-byear;
		}
		System.out.print("현재 사용자나이:"+age);
	}
}
