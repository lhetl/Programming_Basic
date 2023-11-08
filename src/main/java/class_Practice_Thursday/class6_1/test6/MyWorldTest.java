package class_Practice_Thursday.class6_1.test6;

import java.util.Scanner;

public class MyWorldTest {
    public static void main(String[] args) {
        MyWorld[] p = new MyWorld[4];
        p[0]=new MyWorld("Lee");
        p[1]=new MyWorld("Kim");
        p[2]=new MyWorld("Kang");
        p[3]=new MyWorld("Song");
        for (int i=0;i<4;i++){
            p[i].print();
        }
        String name;
        Scanner sc = new Scanner(System.in);
        Boolean check;
        for(int i=0;i<4;i++) {
            System.out.println(p[i].getUserName() + "의 친구를 입력하세요 : ");
            name = sc.nextLine();
            check=false;
            for(int j=0;j<4;j++){
                if (name.equalsIgnoreCase(p[j].getUserName())) {
                    if(i==j){
                        do {
                            System.out.println("자신은 절친으로 지정할 수 없습니다\n이름을 다시 입력하세요: ");
                            name=sc.nextLine();
                        }while(name.equalsIgnoreCase(p[i].getUserName()));
                    }else{
                        check=true;
                        p[i].setMyworld(p[j]);
                    }
                }
            }
            if(check==false){
                System.out.println("등록되지않은 사용자입니다 다시 입력하세요");
                i--;
            }

        }
        for (int i=0;i<4;i++){
            p[i].print();
        }

    }
}

