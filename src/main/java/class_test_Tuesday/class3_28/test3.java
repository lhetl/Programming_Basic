package class_test_Tuesday.class3_28;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14;
		System.out.print("문자를 입력하세요 <R,T,C>:");
		Scanner sc = new Scanner(System.in);
		char ans=sc.next().charAt(0);
		double weight,height,radius,dim;
		if(ans=='R') {
			System.out.print("밑변의 길이, 높이를 입력하세요:");
			weight=sc.nextDouble();
			height=sc.nextDouble();
			dim=weight*height;
			System.out.print("사각형의 면적은:"+dim);
		}else if(ans=='T') {
			System.out.print("밑변의 길이, 높이를 입력하세요:");
			weight=sc.nextDouble();
			height=sc.nextDouble();
			dim=weight*height/2;
			System.out.print("삼각형의 면적은:"+dim);
		}else if(ans=='C') {
			System.out.print("반지름의 길이를 입력하세요:");
			radius=sc.nextDouble();
			dim=radius*radius;
			System.out.print("원의 면적은:"+dim*PI+"(π=3.14로 계산 실제 값:"+dim+"π)");
		}
		sc.close();
	}

}
