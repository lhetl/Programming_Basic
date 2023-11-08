package class_test_Tuesday.class4_4;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		
		int cnt=0;
		while(i<=30){
			cnt+=i*i+1;
			i ++;
		}
		System.out.println(cnt);
		i=10;
		int j=1;
		cnt=0;
		while(i<=30) {
			j=1;
			while(j<=5){
				cnt=cnt+i*j;
				j++;
			}
			i++;
		}
		System.out.println(cnt);
	}
}
