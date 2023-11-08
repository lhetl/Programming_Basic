package class_Practice_Thursday.class3_30;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char answ;
		double weight,height,radius,size;
		System.out.print("문자를 입력하세요 <R,T,C>:");
		Scanner sc = new Scanner(System.in);
		answ=sc.next().charAt(0);

		switch(answ) {
			case 'R':
				System.out.print("밑변 길이, 높이를 입력하세요: ");
				weight=sc.nextDouble();
				height=sc.nextDouble();
				size=weight*height;
				System.out.print("사각형의 면적은: "+size);
				break;
			case 'T':
				System.out.print("밑변 길이, 높이를 입력하세요: ");
				weight=sc.nextDouble();
				height=sc.nextDouble();
				size=weight*height/2;
				System.out.print("삼각형의 면적은: "+size);
				break;
			case 'C':
				System.out.print("반지름을 입력하세요");
				radius=sc.nextDouble();
				size=radius*radius*Math.PI;
				System.out.print("원의 면적은: "+size+" 혹은 "+(radius*radius)+"π");
				break;
			default:
				System.out.print("유효하지 않은 값을 입력했습니다.");

		}
		sc.close();
		/*
		if (answ=='T' || answ=='R') {
			System.out.print("밑변 길이, 높이를 입력하세요: ");
			weight=sc.nextDouble();
			height=sc.nextDouble();
			if(answ=='T') size=weight*height/2;
			else size=weight*height;
			System.out.print("도형 면적은: "+size);
		}else if (answ=='C') {
			System.out.print("반지름을 입력하세요");
			radius=sc.nextDouble();
			size=radius*radius*Math.PI;
			System.out.print("원의 면적은: "+size+" 혹은 "+(radius*radius)+"π");
		}
		*/
	}

}
