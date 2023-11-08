package club.club4_6;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int ans,input,cnt=1;
		ans=rnd.nextInt(100)+1;
		
		System.out.print("1에서 100 사이 숫자를 입력해주세요.: ");
		input=sc.nextInt();
		
		while(ans!=input) {
			if (input>ans) {
				System.out.println(input+"보다 작은 숫자입니다. 다시 입력해주세요.");
				
			}else if (input<ans) {
				System.out.println(input+"보다 큰 숫자입니다, 다시 입력해주세요.");
			}
			input=sc.nextInt();
			cnt++;
		}
		sc.close();
		
		System.out.println("축하합니다! "+cnt+"번만에 맞추셨습니다");
	}

}
