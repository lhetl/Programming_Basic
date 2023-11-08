package class_test_Tuesday.class4_4;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("방정식의 계수 a,b,c,를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		double a,b,c,cnt,result1,result2;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		cnt=(b*b)-(4*a*c);
		sc.close();
		if (a==0) {
			if (b==0) {
				System.out.print("근이 존재하지 않는 식입니다");
			}else {
				result1=-c/b;
				System.out.print("근은: "+result1);
			}
		}else if (cnt>0) {
			result1=(-b-Math.sqrt(cnt))/(2*a);
			result2=(-b+Math.sqrt(cnt))/(2*a);
			System.out.print("실근은 : "+result1+","+result2);
		}else if (cnt==0) {
			result1=(-b)/(2*a);
			System.out.print("중근은: "+result1);
		}else if(cnt<0){
			System.out.print("실근이 존재하지 않는 식입니다");
		}
	}

}
