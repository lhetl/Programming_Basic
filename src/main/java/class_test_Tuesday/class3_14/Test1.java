package class_test_Tuesday.class3_14;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abc";
		System.out.print(s);
		double d =12.3;
		int f=(int)d;
		System.out.print(f);
		Scanner sc = new Scanner(System.in);
		double db=sc.nextDouble();
		System.out.print(db);
		s =sc.next();
		sc.close();
		System.out.print(s);
	}

}
