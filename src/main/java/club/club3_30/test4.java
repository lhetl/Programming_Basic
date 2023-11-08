package club.club3_30;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char stpcnt;
		int a,b;
		double ans;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("두 정수를 입력하십시오. :");
			a=sc.nextInt();
			b=sc.nextInt();
			ans=(double)a/b;
			ans=(double)Math.round((double)a/b*100)/100;
			System.out.println(a+"/"+b+"="+ans);
			System.out.print("계속 하시겠습니까? (y/n)");
			stpcnt=sc.next().charAt(0);
		}while(stpcnt=='y');
		sc.close();
	}

}
