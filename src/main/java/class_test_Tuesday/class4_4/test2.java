package class_test_Tuesday.class4_4;

import java.util.Scanner;
import java.util.Random;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r1 = new Random();
		System.out.print("가위(0), 바위(1), 보(2)를 선택하세요: ");
		int userRSP,comRSP;
		String result="";
		userRSP=sc.nextInt();
		comRSP=r1.nextInt(3);
		if(comRSP==0) {
			result="가위";
		}else if(comRSP==1) {
			result="바위";
		}else if(comRSP==2) {
			result="보";
		}
		sc.close();
		if ((userRSP-comRSP)==1 ||(userRSP-comRSP)==-2 ){
			System.out.println("컴퓨터는 "+result+"를 내서 사용자가 이겼습니다.!!");
			System.out.print("user: "+userRSP+", com: "+comRSP);
		}else if ((userRSP-comRSP)==-1 ||(userRSP-comRSP)==2 ){
			System.out.println("컴퓨터는 "+result+"를 내서 사용자가 졌습니다.!!");
			System.out.print("user: "+userRSP+", com: "+comRSP);
		}else if (userRSP==comRSP){
			System.out.println("컴퓨터는 "+result+"를 내서 사용자와 비겼습니다.!!");
			System.out.print("user: "+userRSP+", com: "+comRSP);
		}
	}

}
