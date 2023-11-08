package class_Practice_Thursday.class3_30;

import java.util.Scanner;
import java.time.LocalDate;  //static 덕분에 객체생성 없이 바로 사용 가능 이거 시험에 나오겠네
public class test2_remodel {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		int byear,bmonth,bday,cyear,cmonth,cday,age=0;
		cyear=now.getYear();
		cmonth=now.getMonthValue();
		cday=now.getDayOfMonth();
		Scanner sc=new Scanner(System.in);
		System.out.print("생년월일을 입력하세요:");
		byear=sc.nextInt(); bmonth=sc.nextInt(); bday=sc.nextInt();
		//System.out.print("현재 년월일을 입력하세요:");
		//cyear=sc.nextInt(); cmonth=sc.nextInt(); cday=sc.nextInt();
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
