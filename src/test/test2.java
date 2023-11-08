package test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double g=9.8;
		double kga=0.1,kgb=0.1,kgc=0.1,kgr=0.345;  //kga- a 무게 kgb - b 무게 kgc - c 무게 kgr- r무게
		double na=kga*g;  //na - a의 힘(N)
		double nb=kgb*g;   //nb - b의 힘(N)
		double nc=kgc*g;   //nc - c의 힘(N)
		double nr=kgr*g;    //nr - r의 힘(N)
		double thetab=Math.PI/3;  //thetab - a,b의 각도
		double thetabc=0; //thetabc - a,b의 합력과 c의 각도

		kga=0.02;
		kgb=0.05;
		kgc=0.03;
		kgr=0.142;  //kga- a 무게 kgb - b 무게 kgc - c 무게 kgr- r무게
		na=kga*g;  //na - a의 힘(N)
		nb=kgb*g;   //nb - b의 힘(N)
		nc=kgc*g;   //nc - c의 힘(N)
		nr=kgr*g;    //nr - r의 힘(N)
		thetab=Math.PI/2;  //thetab - a,b의 각도
		thetabc=Math.PI/12; //thetabc - a,b의 합력과 c의 각도

		double r1=(na*na)+(nb*nb)+(2*na*nb*Math.cos(thetab));  //a,b의 합력 크기
		r1=Math.sqrt(r1);  //a,b의 합력 크기 값
		double r2=(r1*r1)+(nc*nc)+(2*nc*r1*Math.cos(thetabc)); //a,b의 합력과 c의 합력 크기
		System.out.print(nr+" |||   "+Math.sqrt(r2));  //r의 크기와 a,b,c의 합력 크기 비교
	}

}
