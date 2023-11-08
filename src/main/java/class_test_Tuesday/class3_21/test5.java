package class_test_Tuesday.class3_21;
import java.lang.Math;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("ax^2+bx+c");
		System.out.print("a를 입력하세요:");
		a=sc.nextInt();
		System.out.print("b를 입력하세요:");
		b=sc.nextInt();
		System.out.print("c를입력하세요:");
		c=sc.nextInt();
		sc.close();
		double n= (-1*b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
		double n2= (-1*b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
		System.out.print("이차방정식의 근은"+n+"또는"+n2+"입니다.");

	}

}
