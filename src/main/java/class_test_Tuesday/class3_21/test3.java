package class_test_Tuesday.class3_21;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour,min,sec,allsec;
		Scanner sc= new Scanner(System.in);
		System.out.print("시간을 입력하시오. (시):");
		hour=sc.nextInt();
		System.out.print("시간을 입력하시오. (분):");
		min=sc.nextInt();
		System.out.print("시간을 입력하시오. (초):");
		sec=sc.nextInt();
		allsec=hour*3600+min*60+sec;
		sc.close();
		System.out.print(hour+"시간 "+min+"분 "+sec+"초는 "+allsec+"초 입니다.");

	}

}
