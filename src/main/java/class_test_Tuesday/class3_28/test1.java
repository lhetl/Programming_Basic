package class_test_Tuesday.class3_28;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,min;
		System.out.print("3개의 정수를 입력하세요 (3 4 5)");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		if(a<b) {
			if(a>c) { // c<a<b
				min=c;
			}else {   //a<=c && a<b
				min=a;
			}
		}else {
			if(b>c) {   // c<b<=a
				min=c;
			}else {      //b<=c && b<=a
				min=b;
			}
		}
		System.out.print("가장 작은 값:"+min);
	}

}
