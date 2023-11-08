package club.club3_30;

import java.util.Scanner;
import java.util.Arrays;
public class test3_branch {
	public static void main(String[] args) {
		System.out.print("입력받을 숫자의 개수를 입력하십시오. :");
		Scanner sc = new Scanner(System.in);
		int cnt;
		cnt=sc.nextInt();
		double[] arr=new double[cnt];
		double min,max,mid=0;
		System.out.print("서로 다른 숫자 "+cnt+"개를 입력하십시오. :");
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextDouble();
		}
		sc.close();
		Arrays.sort(arr);
		min=arr[0];
		max=arr[cnt-1];
		if(cnt%2==1) {
			mid= arr[((int)cnt/2)+1];
		}else if(cnt%2==0){
			mid=(arr[cnt/2-1]+arr[(cnt/2)])/2;
		}
		System.out.println("최댓값:"+max);
		System.out.println("중간값:"+mid);
		System.out.println("최솟값:"+min);
	}
}
