package class_test_Tuesday.class5_9;

import java.util.Random;

public class test2 {
    public static void main(String[] args){
        final int max_x=5;
        final int max_y=3;
        Random rand= new Random();
        int[][] arr = new int[][] {{12, 56, 32, 16, 98}, {99, 56, 34, 41, 3}, {65, 3, 87, 78, 21}};
        int sum;
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=rand.nextInt(100);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/
        for(int i=0;i<max_y;i++){
            sum=0;
            for (int j=0;j<max_x;j++){
                sum+=arr[i][j];
            }
            System.out.println((i+1)+"번째 행의 합계: "+ sum);
        }
        for(int i=0;i<max_x;i++){
            sum=0;
            for (int j=0;j<max_y;j++){
                sum+=arr[j][i];
            }
            System.out.println((i+1)+"번째 열의 합계: "+ sum);
        }
    }
}
