package class_Practice_Thursday.class3_16.class3_16_study;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		Double x,y;
		Scanner sc=new Scanner(System.in);
		int cnt;
		System.out.print("x좌표의 값을 입력하세요");
		x=sc.nextDouble();
		System.out.print("y좌표의 값을 입력하세요");
		y=sc.nextDouble();
		sc.close();
		//cnt = (x>0 && y>0) ? 1:((x<0 && y>0) ? 2: ((x<0 && y<0)? 3: ((x>0 && y<0) ? 4: 0)));
		cnt = x>0? (y>0?1:4) : (y>0?2:3);
		cnt = (x==0 || y==0)? 0:cnt;
		if (cnt!=0){
			System.out.print("x좌표"+x+"과 y좌표"+y+"인 점의 사분면은 제"+cnt+"사분면 입니다.");
		}else if (cnt==0) {
			System.out.print("x좌표"+x+"과 y좌표"+y+"인 점은 그래프 위에 존재하는 점입니다");
		}
	}

}
