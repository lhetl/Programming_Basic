package class_test_Tuesday.class5_9;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int max_y=3;
        final int max_x=4;
        int[][] arr=new int[max_y][max_x];
        int[][] clone_arr=new int[max_x][max_y];
        System.out.println("행렬 입력");
        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+"번째 행을 입력하세요: ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("전치 행렬");
        for(int i=0;i< clone_arr.length;i++){
            for(int j=0;j< clone_arr[i].length;j++){
                clone_arr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i< clone_arr.length;i++){
            for(int j=0;j< clone_arr[i].length;j++){
                System.out.print(clone_arr[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
