package club.club5_5;
import java.util.Arrays;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력해주세요.");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
        int searchnum;
        System.out.println("찾는 숫자 입력:");
        searchnum = sc.nextInt();
        int a = Arrays.binarySearch(arr, searchnum);
        if (a < 0) {
            System.out.println("숫자 없음");
        } else {
            System.out.println("숫자 " + (a + 1 + "번쨰 있음"));
        }
        sc.close();
    }
}
