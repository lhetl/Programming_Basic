package class_test_Tuesday.class3_21;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		System.out.print("상자의 높이를 입력하시오:");
		a=sc.nextDouble();
		System.out.print("상자의 길이를 입력하시오:");
		b=sc.nextDouble();
		System.out.print("상자의 너비를 입력하시오:");
		c=sc.nextDouble();
		sc.close();
		System.out.print("상자의 체적은"+a*b*c+"입니다");
	}

}
