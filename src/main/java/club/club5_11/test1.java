package club.club5_11;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int max_row,max_column;
        System.out.println("배열의 행을 입력하세요.:  ");
        max_row=sc.nextInt();
        System.out.println("배열의 열을 입력하세요.:  ");
        max_column=sc.nextInt();
        int[][] array= new int[max_row][max_column];
        System.out.println("배열의 원소들을 입력하시오.");
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array[i].length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<max_row;i++){
            sum=0;
            for(int j=0;j<max_column;j++){
                sum+=array[i][j];
            }
            System.out.println((i+1)+"행의 합:"+sum);
        }
        for(int i=0;i<max_column;i++){
            sum=0;
            for(int j=0;j< max_row;j++){
                sum+=array[j][i];
            }
            System.out.println((i+1)+"열의 합:"+sum);
        }
    }
}
