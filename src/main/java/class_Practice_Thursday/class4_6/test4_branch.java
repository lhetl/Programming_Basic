package class_Practice_Thursday.class4_6;

public class test4_branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,c=0,start,end,cnt=3;
		while (r<=cnt) {
			start = cnt-r;
			end=cnt+r;
			c=0;
			while (c<=2*cnt) {
				if (start <=c && c <=end ) System.out.print("*");
				else System.out.print(" ");
				c++;
			}
			System.out.println();
			r++;
		}
	}

}
