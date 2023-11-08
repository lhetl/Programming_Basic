package class_Practice_Thursday.class4_20;

import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        int val, cnt = 0, sum = 0;
        int [] array = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("0과 100 사이의 값을 입력 (그외의 값 종료) : ");
        val = sc.nextInt();
        while (val >= 0 && val <= 100) {
            array[cnt] = val;
            cnt = cnt + 1; // 입력 정수의 개수 세기
            System.out.println("0과 100 사이 값 입력 (그외의 값 종료) : ");
            val = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for(int i=1; i < cnt; i++) {
            sum = sum + array[i]; // 합 구하기
            if (array[i] > max) max = array[i]; // 최대값 구하기
            if (array[i] < min) min = array[i]; // 최소값 구하기
        }
        if (cnt != 0)
            System.out.println("평균 : " + (double) sum / cnt);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        sc.close();
    }
}
