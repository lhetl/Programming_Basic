package class_Practice_Thursday.class3_9.class3_9_study;

public class test {

	public static void main(String[] args) {
		int[][] a11;
		int cnt=6;
		a11=new int[cnt][cnt];
		for (int i=0;i<cnt;i++) {
			for(int j=0;j<cnt;j++){
				a11[i][j]=i+j;
			}
		}
		for (int i=0;i<cnt;i++) {
			for(int j=0;j<cnt;j++){
				System.out.println("a["+i+"]["+j+"]="+a11[i][j]);
			}
		}
	}

}
