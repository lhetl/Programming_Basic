package class_Practice_Thursday.class3_30;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("F학점");
				break;
			default:
				System.out.println("유효하지 않은 값입니다.");
		}
	}

}
