package class_Practice_Thursday.class3_9.class3_9_study;
import java.util.Scanner;
public class Literal {

	public static void main(String[] args) {
		int x=0;
		System.out.println(x);

		float f = 12.3f;
		System.out.print(f);
		
		Scanner sc = new Scanner(System.in);
		double db = sc.nextDouble();
		//sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
	}
}
