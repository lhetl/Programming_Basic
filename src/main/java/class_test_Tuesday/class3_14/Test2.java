package class_test_Tuesday.class3_14;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stu_name;
		int birth,grade,Tscore;
		double AvgScore;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		stu_name=sc.next();
		System.out.print("생년월일:");
		birth=sc.nextInt();
		System.out.print("학년:");
		grade=sc.nextInt();
		System.out.print("토익성적:");
		Tscore=sc.nextInt();
		System.out.print("평균 학점:");
		AvgScore=sc.nextDouble();
		sc.close();
		System.out.print(stu_name+",  "+birth+",  "+grade+",  "+Tscore+",  "+AvgScore);


	}

}

