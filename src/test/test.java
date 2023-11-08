package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double g=9.8;   //중력가속도(고정값)
		double kga=0.1,kgb=0.1,kgR=0.205;
		double theta= Math.PI/3; //kga- a 무게 kgb - b 무게 kgR- R무게 theta - a,b의 각도 1번실험
		kga=0.05;
		kgb=0.1;
		kgR=0.127;
		theta= Math.PI/2; //kga- a 무게 kgb - b 무게 kgR- R무게 theta - a,b의 각도 2번실험
		double na=kga*g; //na - a의 힘(N)
		double nb=kgb*g; //nb - b의 힘(N)
		double nR=kgR*g; //nR - R의 힘(N)
		double r=(na*na)+(nb*nb)+(2*na*nb*(Math.cos(theta))); //a,b 합력 크기 구하기
		System.out.print(nR+"======"+Math.sqrt(r));  //R의 힘과 a b 합력의 힘 비교
	}

}
