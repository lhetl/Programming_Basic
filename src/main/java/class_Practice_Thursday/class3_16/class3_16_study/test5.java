package class_Practice_Thursday.class3_16.class3_16_study;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		int cnt;
		System.out.print("정수를 입력하시오.:");
		Scanner sc=new Scanner(System.in);
		cnt=sc.nextInt();
		sc.close();
		/*System.out.println("천의자리:"+cnt/1000);
		cnt%=1000;
		System.out.println("백의자리:"+cnt/100);
		cnt%=100;
		System.out.println("십의자리:"+cnt/10);
		cnt%=10;
		System.out.println("천의자리:"+cnt);*/


		/*
		int thousands =cnt/1000;
		int r=cnt%1000;
		int hundreds = cnt/100;
		r=r%100;
		int tens=r/10;
		int ones=r%10;
		System.out.println("천의 자리:" + thousands);
		System.out.println("백의 자리:" + hundreds);
		System.out.println("십의 자리:" + tens);
		System.out.println("일의 자리:" + ones); */

		int count=(int)(Math.log10(cnt))+1;
		int count2;
		for (int i=0 ;i<count;i++) {
			count2=(int)Math.pow(10, count-i-1);
			System.out.println(count2+"의자리:"+(int)(cnt/count2));
			cnt%=count2;

		}
	}

}
