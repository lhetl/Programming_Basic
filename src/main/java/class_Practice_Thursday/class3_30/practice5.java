package class_Practice_Thursday.class3_30;

import java.util.Scanner;
public class practice5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월 (1 ~ 12) ? ");
		int m = sc.nextInt();    sc.close();

		int days;
		switch(m) {
			case 1 : 	case 3 : 	case 5 : 	case 7 :
			case 8 :	case 10:  case 12:
				days = 31; break;
			case 4: 	case 6:	case 9:	case 11 :
				days = 30; break;
			case 2 : days = 28; break;
			default :
				System.out.println("허용되지 않는 월입니다.");
				return;
		}
		System.out.println(m + "월은 " + days + "일까지 입니다.");
	}
}