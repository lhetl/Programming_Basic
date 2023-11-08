package class_Practice_Thursday.class3_16.class3_16_practice;
import java.util.Random;
public class test1 {
	public static void main(String[] args) {
		int x,y;
		Random r=new Random();
		x=r.nextInt(1000);
		y=x%101;
		System.out.println(x+"=>"+y);
		x=r.nextInt(1000);
		y=(x%100)+1;
		System.out.println(x+"=>"+y);
		
	}
}
