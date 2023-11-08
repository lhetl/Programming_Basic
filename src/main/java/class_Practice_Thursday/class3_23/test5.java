package class_Practice_Thursday.class3_23;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[]=new int[3];
		int y[]=new int[3];
		for (int i=1;i<4;i++) {
			System.out.print(i+"번째 점을 입력하세요(x"+i+",y"+i+"):");
			x[i-1]=sc.nextInt();
			y[i-1]=sc.nextInt();
		}
		sc.close();
		if ((x[1]==x[0]) && (x[2]==x[1])) {   //x값 확인
			System.out.print("알림) 삼각형을 만들 수 없습니다");
		}else if (x[0]==x[1]) {
			System.out.print("알림) 삼각형을 만들 수 있습니다");
		}else if (x[0]== x[2]) {
			System.out.print("알림) 삼각형을 만들 수 있습니다");
		}
		else {   // y값 확인 공식
			double slope1= (y[1]-y[0])/(x[1]-x[0]);
			double slope2= (y[2]-y[0])/(x[2]-x[0]);
			if (slope1==slope2) {
				System.out.print("알림) 삼각형을 만들 수 없습니다");
			}else {
				System.out.print("알림) 삼각형을 만들 수 있습니다");
			}

		}

	}

}
