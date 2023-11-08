package class_Practice_Thursday.class4_13;

public class quiz1 {

	public static void main(String[] args) {
		for(int x = 0; x < 3 ; x++)
		{
		  for(int y = 0; y <= 2 ; y++)
		     System.out.println(x);
		  System.out.println();		
		}
		
		
		//====================================
		
		int x=0;
		for( ; ; )
		{
		   if ( x > 10) {
			   break;
		   }
		   System.out.print(x + "  ");
		   x++;
		}
		
//		===================================2-1==================

		int i=0,s=0;
		while(i<=30){
			s=s+(i*i+1);
			i++;
		}
		System.out.println("\n\n"+s);
//		==>>> for 로 변경
		for(s=0,i=1;i<=30;i++){
			s=s+(i*i+1);
		}
		System.out.println(s);
//		====================================2-2=====================
		i=10;
		s=0;
		int j;
		while(i<=30){
			j=1;
			while(j<=5){
				s=s+(i*j);
				j++;
			}
			i++;
		}
		System.out.println(s);
//		==>>>>>>>> for 로 변경
		for(i=10,s=0;i<=30;i++){
			for(j=1;j<=5;j++){
				s=s+(i*j);
			}
		}
		System.out.println(s);
	}

}
