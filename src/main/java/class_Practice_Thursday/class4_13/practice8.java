package class_Practice_Thursday.class4_13;

public class practice8 {
	public static void main(String[] args) {
		int[] array = {88, 67, 56, 77, 99, 90, 44};
		double avg;
		int max=0, min=100, sum=0;
		
		for (int number : array) {
			sum += number;
			if(number > max) max = number;
			if(number < min) min = number;
		}
		avg = ((double)sum)/array.length;
		System.out.println("평균 : " + avg);
		System.out.println("최고 : " + max);
		System.out.println("최저 : " + min);
	}
}
