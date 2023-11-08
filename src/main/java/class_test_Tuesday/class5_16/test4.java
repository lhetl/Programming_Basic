package class_test_Tuesday.class5_16;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans="",ToChangeStr,ChangedStr;
        do{
            System.out.println("========================");
            System.out.println("1. 암호화");
            System.out.println("2. 복호화");
            System.out.println("3. 종료");
            System.out.println("========================");
            System.out.print("메뉴를 선택하세요: ");
            ans = sc.nextLine();
            if(ans.equalsIgnoreCase("1")) {
                System.out.print("평문을 입력하세요:");
                ToChangeStr = sc.nextLine().toLowerCase();
                char[] dto = ToChangeStr.toCharArray();
                for (int i = 0; i < dto.length; i++) {
                    if (dto[i] != ' ') {
                        if (((int) dto[i]) + 4 > 122) {
                            dto[i] = (char) (dto[i] - 22);
                        } else {
                            dto[i] = (char) (dto[i] + 4);
                        }
                    }
                }
                System.out.print("암호화된 문자열 : ");
                System.out.println(dto);
            }
            else if(ans.equalsIgnoreCase("2")) {
                System.out.print("암호문을 입력하세요:");
                ChangedStr = sc.nextLine().toLowerCase();
                char[] dto = ChangedStr.toCharArray();
                for (int i = 0; i < dto.length; i++) {
                    if (dto[i] != ' ') {

                        if (((int) dto[i]) - 4 < 97) {
                            dto[i] = (char) (dto[i] +22);
                        } else {
                            dto[i] = (char) (dto[i] -4);
                        }
                    }
                }
                System.out.print("복호화된 문자열 : ");
                System.out.println(dto);
            }else if(!ans.equalsIgnoreCase("3")){
                System.out.println("잘못된 값을 입력했습니다");
            }
        }while(!ans.equalsIgnoreCase("3"));
        sc.close();
    }
}
