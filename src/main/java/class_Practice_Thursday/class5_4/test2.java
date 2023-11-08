package class_Practice_Thursday.class5_4;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        final int x_max=5;
        final int y_max=3;
        int[][] box= new int[x_max][y_max];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<box.length;i++){
            System.out.print((i+1)+"번째 행의 값 입력("+y_max+"개): ");
            for(int j=0;j<box[i].length;j++){
                box[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<box.length;i++){

            for(int j=0;j<box[i].length;j++){
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
    }
}
