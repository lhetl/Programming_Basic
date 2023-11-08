package class_Practice_Thursday.class3_16.class3_16_study;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		double avg,math,eng,pgm,cmp;
		Scanner sc = new Scanner(System.in);
		System.out.print("컴퓨터 개론 과목의 점수를입력하시오.:");
		cmp=sc.nextDouble();
		System.out.print("c언어 프로그래밍 과목의 점수를입력하시오.:");
		pgm=sc.nextDouble();
		System.out.print("영어 과목의 점수를입력하시오.:");
		eng=sc.nextDouble();
		System.out.print("일반수학 과목의 점수를입력하시오.:");
		math=sc.nextDouble();
		sc.close();
		avg=(math+eng+pgm+cmp)/4;
		System.out.print("평균점수는"+avg+"점 입니다");
	}

}
