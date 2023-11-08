package club.club4_6;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] arr = new int [5];
		int sum=0;
		System.out.println("5개의 숫자를 입력해주세요.");
		
		/*for(int i:arr) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum); */
		sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		sc.close();
		System.out.println(sum);
	}

}
