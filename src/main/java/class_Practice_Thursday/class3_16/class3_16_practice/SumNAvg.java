package class_Practice_Thursday.class3_16.class3_16_practice;
import java.util.Scanner;
public class SumNAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 성적 입력 >>");
		int s1=sc.nextInt();
		System.out.println("두번째 성적 입력 >>");
		int s2=sc.nextInt();
		System.out.println("세번째 성적 입력 >>");
		int s3=sc.nextInt();
		sc.close();
		int sum=s1+s2+s3;
		double avg=sum/3.0;
		System.out.println("합:"+sum);
		System.out.println("평균:"+avg);
	}

}
