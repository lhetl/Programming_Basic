package class_Practice_Thursday.class3_16.class3_16_practice;

public class IncDecOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		
		a = 3; b = 5; c = 6;
		d = a++ + b++ - c--;
		System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);

		a = 3; b = 5; c = 6;
		d = ++a + ++b - --c;
		System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);

		a = 3; b = 5; c = 6;
		d = ++a + b++ - --c;
		System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d);	

	}

}
