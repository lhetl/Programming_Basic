package class_test_Tuesday.class3_21;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args){
		final double dim= 3.3058;
		int cnt;
		Scanner sc = new Scanner(System.in);
		System.out.print("평수를 입력하시오:");
		cnt=sc.nextInt();
		System.out.print(cnt+"평은 "+(double)(dim*cnt)+"평방미터 입니다");
		sc.close();

	}
}