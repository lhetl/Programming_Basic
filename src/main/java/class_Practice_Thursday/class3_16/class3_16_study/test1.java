package class_Practice_Thursday.class3_16.class3_16_study;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		double x;
		System.out.println("x의 값을 입력하시오");
		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();
		sc.close();
		double f_x;
		f_x=5*Math.pow(x,3)+6*Math.pow(x,2)-8*x+2;
		System.out.println("값은"+f_x+"입니다.");
	}
}
