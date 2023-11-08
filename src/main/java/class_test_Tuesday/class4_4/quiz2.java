package class_test_Tuesday.class4_4;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0,cnt2=0;
		for (int i=1;i<=30;i++) {
			cnt+=i*i+1;
		}
		System.out.println(cnt);
		for(int i=10;i<=30;i++) {
			for(int j=1;j<=5;j++) {
				cnt2+=i*j;
			}
		}
		System.out.println(cnt2);
	}

}
