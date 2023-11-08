package class_Practice_Thursday.class3_16.class3_16_practice;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=(byte)0x00, y=(byte)0xFF;
		byte z;
		z=(byte)(x&y);
		System.out.println("&:"+z);
		z=(byte)(x|y);
		System.out.println("|:"+Byte.toUnsignedInt(z));
		z=(byte)(x^y);
		System.out.println("^:"+Byte.toUnsignedInt(z));
		z=(byte)~y;
		System.out.println("~:"+z);
	}

}
