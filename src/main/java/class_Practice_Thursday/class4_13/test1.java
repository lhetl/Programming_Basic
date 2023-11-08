package class_Practice_Thursday.class4_13;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int n=0,sum=0,cnt=0;
		/* 1번쨰 방법
		for(n=sc.nextInt();n>=0;n=sc.nextInt()){
			sum=sum+n;
			cnt++;
			System.out.print("값?: ");
		}*/
		/* 2번째 방법(광기)
		for(System.out.print("값입력: "),n=sc.nextInt();n>=0;sum+=n,cnt++,System.out.print("값입력: "),n=sc.nextInt()){
		}*/
		n=sc.nextInt();
		for(;n>=0;n=sc.nextInt()){
			sum=sum+n;
			cnt++;
			System.out.print("값?: ");
		}
		/*do {
			System.out.print("값?: ");
			n=sc.nextInt();
			if (n>=0) sum=sum+n;
			cnt++;
		}while(n>=0);*/
		sc.close();
		float avg=((float)sum)/cnt;
		System.out.print("평균: :"+avg);
	}

}
