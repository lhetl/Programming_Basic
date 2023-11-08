package class_Practice_Thursday.class3_30;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float weight,height,std_weight=0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력:");
		height= sc.nextFloat();
		std_weight = (height-100)*0.9f;
		System.out.print("몸무게 입력:");
		weight=sc.nextFloat();
		sc.close();
		if (weight > std_weight*1.05) {
			System.out.print("과체중");
		}else if(weight < std_weight*0.95) {
			System.out.println("저체중");
		}else {
			System.out.println("표준 체중");
		}
	}

}
