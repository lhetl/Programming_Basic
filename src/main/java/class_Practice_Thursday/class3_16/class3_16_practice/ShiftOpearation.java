package class_Practice_Thursday.class3_16.class3_16_practice;

public class ShiftOpearation {
	public static void main(String[] args){
		int x= 128, y= -128;
		
		System.out.println( "x >> 2 : " + Integer.toBinaryString(x) + " -> " 
					        + Integer.toBinaryString(x >> 2));
		System.out.println( "y >> 2 : " + Integer.toBinaryString(y) + " -> " 
					        + Integer.toBinaryString(y >> 2));
			
		System.out.println( "x >>> 2 : " + Integer.toBinaryString(x) + " -> " 
					          + Integer.toBinaryString(x >>> 2));
		System.out.println( "y >>> 2 : " + Integer.toBinaryString(y) + " -> " 
					          + Integer.toBinaryString(y >>> 2));
			
		System.out.println( "x << 2 : " + Integer.toBinaryString(x) + " -> " 
					        + Integer.toBinaryString(x << 2));
		System.out.println( "y << 2 : " + Integer.toBinaryString(y) + " -> " 
					        + Integer.toBinaryString(y << 2));

	}
}
