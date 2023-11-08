package class_Practice_Thursday.class3_9.class3_9_practice;
import java.util.Scanner;

public class HelloSay{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		String name= sc.next();
		sc.close();

		String helloMessage= "안녕하세요"+ name+"님, 자바의 세계에 오신것을 축하드립니다.";
		System.out.println(helloMessage);
	}

}
