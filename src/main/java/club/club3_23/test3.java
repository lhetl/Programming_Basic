package club.club3_23;
import java.util.Scanner;
import java.util.Arrays;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel[]= {65,69,73,79,85};
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 문자를 입력하세요: ");
		char input_text = sc.next().charAt(0);
		sc.close();
		if (input_text>=97) {
			input_text-=32;
		}
		if (input_text>=65 && input_text<=90) {

			int cnt=(int)input_text;
			if (Arrays.stream(vowel).anyMatch(i -> i ==cnt)){
				System.out.print("문자는 모음입니다");
			}else {
				System.out.print("문자는 자음입니다");
			}
		}else {
			System.out.print("잘못된 값을 입력했습니다");
		}
	}

}
