package class_Practice_Thursday.class4_13;

public class practice6 {
    public static void main(String[] args) {
    	int dan, index;
    	for (dan = 2; dan <= 9; dan++) {
    		System.out.println(dan + "단");
    		for (index=1; index <= 9; index++) {
    			System.out.println(dan + " * " + index + " = " + dan*index);
    		}
    		System.out.println("");
    	}
   }
}
