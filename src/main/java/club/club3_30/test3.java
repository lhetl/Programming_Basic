package club.club3_30;

import java.util.Scanner;

//import java.util.Arrays;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,min,max,mid;
		Scanner sc = new Scanner(System.in);
		System.out.print("서로 다른 숫자 3개를 입력하십시오. :");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		sc.close();
		min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		mid = a+b+c-min-max;
		System.out.println("최댓값:"+max);
		System.out.println("중간값:"+mid);
		System.out.println("최솟값:"+min);

	}

}
