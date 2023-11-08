package class_test_Tuesday.class5_9;

import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int first_arr_x, first_arr_y, second_arr_x, second_arr_y;
        int cnt;
        do{
            System.out.print("첫 번째 행렬의 크기를 입력하세요: ");
            first_arr_y = sc.nextInt();
            first_arr_x = sc.nextInt();
            System.out.print("두 번째 행렬의 크기를 입력하세요: ");
            second_arr_y = sc.nextInt();
            second_arr_x = sc.nextInt();
            if (second_arr_y!=first_arr_x) System.out.println("행렬 곱을 할 수 없는 크기입니다 다시 입력해주세요(첫번째 행렬의 열 갯수와 두번째 행렬의 행 갯수가 같아야 함)");
        }while(second_arr_y!=first_arr_x);
        sc.close();
        int[][] first_arr= new int[first_arr_y][first_arr_x];
        int[][] second_arr= new int[second_arr_y][second_arr_x];
        int[][] result_arr= new int[first_arr_y][second_arr_x];
        System.out.println("첫번째 행렬: ");
        for(int i=0;i<first_arr.length;i++){
            for(int j=0;j<first_arr[i].length;j++){
                first_arr[i][j]=rand.nextInt(100);
                System.out.print(first_arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("두번째 행렬: ");
        for(int i=0;i<second_arr.length;i++){
            for(int j=0;j<second_arr[i].length;j++){
                second_arr[i][j]=rand.nextInt(100);
                System.out.print(second_arr[i][j]+" ");
            }
            System.out.println();
        }
//        결과 행렬 계산
        for(int i=0;i< result_arr.length;i++){

            for(int j=0;j<result_arr[i].length;j++){
                cnt=0;
                for(int k=0;k<first_arr_x;k++){
                    cnt+=first_arr[i][k]*second_arr[k][j];
                }
                result_arr[i][j]=cnt;
            }
        }
        System.out.println("결과 행렬:");
        for(int i=0;i< result_arr.length;i++){
            for(int j=0;j<result_arr[i].length;j++){
                System.out.print(result_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
