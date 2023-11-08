package class_Practice_Thursday.class4_6;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int n=0,sum=0,cnt=0;
		/*n=sc.nextInt();
		while(n>=0) {
			sum=sum+n;
			cnt++;
			System.out.print("값?: ");
			n=sc.nextInt();
		}*/
		do {
			System.out.print("값?: ");
			n=sc.nextInt();
			if (n>=0) sum=sum+n;
			cnt++;
		}while(n>=0);
		sc.close();
		float avg=((float)sum)/cnt;
		System.out.print("평균: :"+avg);
	}

}
