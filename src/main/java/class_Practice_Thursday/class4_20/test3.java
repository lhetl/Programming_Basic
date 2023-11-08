package class_Practice_Thursday.class4_20;

import java.util.Arrays;
import java.util.Scanner;
public class test3 {
    public static void main(String[] args){
        final int vector_cnt= 100;
        final int vector_vers=2;
        int[][] vector=new int[vector_cnt][vector_vers];
        int cnt;
        String[] word= new String[vector_cnt];
        Arrays.fill(word,"");
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=vector_cnt;i++){
            if(i<=26){
                word[i-1]+=(char)(i+96);
            }else{
                if(i%26==0){
                    word[i-1]+=word[(i-1)/26-1]+'z';
                }else {
                    word[i-1]+=word[i/26-1]+(char)(i%26+96);
                }

            }
        }
        for(int i=0;i<vector_cnt;i++){
            System.out.print("벡터 "+word[i]+"를 입력하시오( ");
            for(int j=1;j<=vector_vers;j++){
                System.out.print(word[i]+""+j+" ");
            }
            System.out.print("): ");
            for(int k=0;k<vector_vers;k++){
                vector[i][k]=sc.nextInt();
            }
        }
        sc.close();
        System.out.print("벡터의 합은 vector ( ");
        for(int i=0;i<vector_vers;i++){
            cnt=0;
            for(int j=0;j<vector_cnt;j++){
                cnt+=vector[j][i];
            }
            System.out.print(cnt+" ");
        }
        System.out.print(")");
    }
}
