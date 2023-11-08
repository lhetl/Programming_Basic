package class_Practice_Thursday.class4_13;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repeatCnt=true;
		String ans;
		float fuel=0,distance,ratio;
		/*
		for(;repeatCnt==true;){
			System.out.print("연료의 양을 입력하시오(l): ");
			fuel=sc.nextFloat();
			System.out.print("주행한 거리를 입력하세요(km): ");
			distance=sc.nextFloat();
			ratio=distance/fuel;
			System.out.print("연비는 "+ratio+"km/l 입니다. \n");
			System.out.print("다시 계산하시겠습니까?(Y/N) :");
			ans=""+sc.next().charAt(0);
			if (ans.equalsIgnoreCase("n")) {
				repeatCnt=false;
			}else if (!ans.equalsIgnoreCase("y")) {
				System.out.println("잘못된 값이 입력되었습니다");
				System.exit(0);
			}
		}*/
		for(ans="";!ans.equalsIgnoreCase("n");ans=""+sc.next().charAt(0)){
			System.out.print("연료의 양을 입력하시오(l): ");
			fuel=sc.nextFloat();
			System.out.print("주행한 거리를 입력하세요(km): ");
			distance=sc.nextFloat();
			ratio=distance/fuel;
			System.out.print("연비는 "+ratio+"km/l 입니다. \n");
			System.out.print("다시 계산하시겠습니까?(Y/N) :");

		}
		sc.close();
	}

}
