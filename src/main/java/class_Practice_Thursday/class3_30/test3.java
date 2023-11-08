package class_Practice_Thursday.class3_30;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income=0,tax=0;
		double taxper=0;
		System.out.print("소득을 입력하세요(단위:만원) :");
		Scanner sc = new Scanner (System.in);
		income=sc.nextInt();
		sc.close();
		if(income<1000) {
			taxper=8;
		}else if(income<=4000) {
			taxper=17;
		}else if(income<=8000){
			taxper=26;
		}else {
			taxper=35;
		}
		tax=(int)(income*(taxper/100)*10000);
		System.out.print("소득세는 "+tax+"입니다");
	}

}
