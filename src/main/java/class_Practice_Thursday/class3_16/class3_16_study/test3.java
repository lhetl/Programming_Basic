package class_Practice_Thursday.class3_16.class3_16_study;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end,distance;
		Double oil,FE;
		Scanner sc = new Scanner(System.in);
		System.out.print("출발한 지점의 주행거리계");
		start=sc.nextLong();
		System.out.print("도착한 지점의 주행거리계");
		end=sc.nextLong();
		System.out.print("사용한 연료");
		oil=sc.nextDouble();
		sc.close();
		distance=end-start;
		FE=distance/oil;
		System.out.print("연비는"+FE+"km/l 입니다.");

	}

}
