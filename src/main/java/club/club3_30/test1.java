package club.club3_30;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오:  ");
		year=sc.nextInt();
		sc.close();

		//boolean year_check= year%400==0 || (year % 4==0 && year%100!=0);
		//if (year_check)System.out.print(year+"년은 윤년입니다.");
		//else System.out.print(year+"년은 평년입니다.");
		if (year%400==0 || (year % 4==0 && year%100!=0)) {
			System.out.print(year+"년은 윤년입니다.");
		}else {
			System.out.print(year+"년은 평년입니다.");
		}
	}

}
