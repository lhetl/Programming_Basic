package class_Practice_Thursday.class3_16.class3_16_practice;

public class LogicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 3, y= 9;
		System.out.println("논리 AND 테스트");
		System.out.println( (x < y) + ", " + (x > 0) + " : " + (x < y && x > 0));
		System.out.println( (x > y) + ", " + (x > 0) + " : " + (x > y && x > 0));
		System.out.println( (x < y) + ", " + (x < 0) + " : " + (x < y && x < 0));
		System.out.println( (x > y) + ", " + (x < 0) + " : " + (x > y && x < 0));
		System.out.println("논리 OR 테스트");
		System.out.println( (x < y) + ", " + (x > 0) + " : " + (x < y || x > 0));
		System.out.println( (x > y) + ", " + (x > 0) + " : " + (x > y || x > 0));
		System.out.println( (x < y) + ", " + (x < 0) + " : " + (x < y || x < 0));
		System.out.println( (x > y) + ", " + (x < 0) + " : " + (x > y || x < 0));
		System.out.println("논리 XOR 테스트");
		System.out.println( (x < y) + ", " + (x > 0) + " : " + (x < y ^ x > 0));
		System.out.println( (x > y) + ", " + (x > 0) + " : " + (x > y ^ x > 0));
		System.out.println( (x < y) + ", " + (x < 0) + " : " + (x < y ^ x < 0));
		System.out.println( (x > y) + ", " + (x < 0) + " : " + (x > y ^ x < 0));
		System.out.println("논리 NOT 테스트");
		System.out.println( (x < y) + " : " + !(x < y));
		System.out.println( (x > y) + " : " + !(x > y));

	}

}
