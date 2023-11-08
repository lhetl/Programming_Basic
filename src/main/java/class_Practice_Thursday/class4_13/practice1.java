package class_Practice_Thursday.class4_13;

import java.util.Scanner;
public class practice1 {
     public static void main(String[] args) {
    	 int dan;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("원하는 단 ? ");
    	 dan = sc.nextInt();
    	 sc.close();
    	 for(int index=1; index <= 9;index++) {
    		 System.out.println(dan + " * " + index + " = " + dan*index);
    	 }
    }
}