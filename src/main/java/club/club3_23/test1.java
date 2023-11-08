package club.club3_23;
import java.util.Scanner;
import java.lang.Math;
@SuppressWarnings("unused")
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력하세요:");
		int cnt;
		Scanner sc = new Scanner(System.in);
		cnt=sc.nextInt();
		sc.close();
		System.out.print("천의자리:"+cnt/1000);
		cnt%=1000;
		System.out.print("백의자리:"+cnt/100);
		cnt%=100;
		System.out.print("십의자리:"+cnt/10);
		cnt%=10;
		System.out.print("일의자리:"+cnt);

		/*int cnt2=(int)Math.log10(cnt)+1;
		double cnt3;
		for (int i=0;i<cnt2;i++) {
			cnt3 = Math.pow(10,cnt2-i-1);
			int cnt4=(int)cnt3;
			System.out.print(cnt4+"의자리:"+cnt/cnt4+"\n");
			cnt%=cnt3;
		}*/

	}

}
