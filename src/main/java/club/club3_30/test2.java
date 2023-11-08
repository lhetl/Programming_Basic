package club.club3_30;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		int score;
		char result;
		Scanner sc = new Scanner(System.in);
		System.out.print("시험 점수를 입력해주십시오. :");
		score=sc.nextInt();
		sc.close();
		switch(score/10) {
			case 10:
			case 9:
				result='A';
				break;
			case 8:
				result='B';
				break;
			case 7:
				result='C';
				break;
			case 6:
				result='D';
				break;
			default:
				result='F';
		}
		System.out.print("등급 :"+result);

	}

}
