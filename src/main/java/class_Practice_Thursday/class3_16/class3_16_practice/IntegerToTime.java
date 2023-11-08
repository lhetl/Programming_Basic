package class_Practice_Thursday.class3_16.class3_16_practice;
import java.util.Scanner;
public class IntegerToTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("초를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		sc.close();
		int hour=i/3600;
		int remain = i%3600;
		int minute= remain/60;
		int second = remain%60;
		System.out.println(hour+"시"+minute+"분"+second+"초");
		
	}

}
