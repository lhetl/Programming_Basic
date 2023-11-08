package class_Practice_Thursday.class4_13;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nPr 의 n과 r의 값을 입력하세요");
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		int p=1,i=0;
		for(i=0,p=1;i<=r-1;i++){
			p=p*(n-i);
		}
		for(i=0,p=1;i<=r-1;p=p*(n-i),i++){}
		System.out.print(n+"P"+r+"의 값은 "+p+"입니다");
	}

}
