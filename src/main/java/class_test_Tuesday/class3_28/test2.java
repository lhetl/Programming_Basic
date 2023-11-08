package class_test_Tuesday.class3_28;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt;
		int price;
		System.out.print("물건의 개수를 입력해주세요:");
		cnt=sc.nextInt();
		sc.close();
		if (cnt>=10) {
			price=100*cnt*90/100;
		}else {
			price=100*cnt;
		}
		System.out.print("물건의 전체 가격은:"+price+"원 입니다.");
	}

}

