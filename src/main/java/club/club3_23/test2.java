package club.club3_23;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		int year_data;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오. :");
		year_data=sc.nextInt();
		boolean result = ((year_data%4==0 && year_data%100!=0)||(year_data%400==0))? true : false;
		System.out.print(result);
		sc.close();
	}

}
