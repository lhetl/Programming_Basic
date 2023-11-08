package class_Practice_Thursday.class3_9.class3_9_study;
import java.util.Scanner;
public class PersonalInfo {
	public static void main(String[] args) {
		String stu_name;
		int age;
		float height,weight;
		System.out.print("이름:");
		Scanner sc = new Scanner(System.in);
		stu_name=sc.next();
		System.out.print("나이:");
		age=sc.nextInt();
		System.out.print("키:");
		height=sc.nextFloat();
		System.out.print("몸무게:");
		weight=sc.nextFloat();
		System.out.print(stu_name+",\t"+age+",\t"+height+",\t"+weight);
		sc.close();
	}
}
