package class_Practice_Thursday.class5_4;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        final int x_max=3;
        final int y_max=3;
        int[][] board = new int[x_max][y_max];
        Scanner sc = new Scanner(System.in);
        int turn=1,row,col,cnt3,cnt4=0;
        String cont="",cnt="";
        String[] cnt2 = new String[2];
        //초기화 코드
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                board[r][c]=0;
            }
        }
        do {
            //출력 코드
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    if (board[r][c] == 0) System.out.print("x ");
                    else if (board[r][c] == 1) System.out.print("o ");
                    else System.out.print("★ ");
                }
                System.out.println();
            }

            //값 입력 코드
            do {

                System.out.print(turn + "번의 순서 입니다. 돌을 놓을 행과 열 번호는? :");
                cnt = sc.nextLine();
                cnt2 = cnt.split(" ");
                row = Integer.parseInt(cnt2[0]) - 1;
                col = Integer.parseInt(cnt2[1]) - 1;
                if (row>(x_max-1) || row<0 || col>(y_max-1) || col<0 || board[row][col]==1 ||board[row][col]==2 ) System.out.println("잘못된 값을 입력했습니다 다시 입력해주세요");
            }while(row>(x_max-1) || row<0 || col>(y_max-1) || col<0 ||board[row][col]==1 ||board[row][col]==2);
            board[row][col]= turn;

            //판별 코드
            for(int i=0;i<board.length;i++){
                cnt3=0;
                for(int j=0;j<board[i].length;j++){  // 가로 확인
                    if (board[i][j]==turn){
                        cnt3++;
                    }
                }
                if(cnt3==3){
                    System.out.println(turn+"번의 승리입니다");
                    cnt4=1;
                }
                cnt3=0;
                for(int j=0;j<board[i].length;j++){ // 세로 확인
                    if (board[j][i]==turn){
                        cnt3++;
                    }
                }
                if(cnt3==3){
                    System.out.println(turn+"번의 승리입니다");
                    cnt4=1;
                }
            }

            cnt3=0;
            for(int j=0;j<board.length;j++){  // 대각선1 확인
                if (board[j][j]==turn){
                    cnt3++;
                }
            }
            if(cnt3==3){
                System.out.println(turn+"번의 승리입니다");
                cnt4=1;
            }

            cnt3=0;
            for(int j=0;j<board.length;j++){  // 대각선2 확인
                if (board[j][board.length-j-1]==turn){
                    cnt3++;
                }
            }
            if(cnt3==3){
                System.out.println(turn+"번의 승리입니다");
                cnt4=1;
            }
            cnt3=0;
            if(cnt4==0) {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {  // 무승부 확인
                        if (board[i][j] == 1) {
                            cnt3++;
                        }
                        if(board[i][j]==2){
                            cnt3++;
                        }
                    }
                    if (cnt3 == 9) {
                        System.out.println("무승부 입니다");
                        cnt4 = 1;
                    }
                }
            }
            //while 반복 판별 코드
            turn = turn ==1? 2 :1;
            if(cnt4==0) {
                do{
                    System.out.print("계속 하시겠습니까? :");
                    cont=sc.nextLine();
                    if(cont.equalsIgnoreCase("n")){
                        System.out.println("게임을 종료합니다");
                        cnt4=2;
                    }else if(cont.equalsIgnoreCase("y")){
                        System.out.println("게임을 계속합니다");
                    }else{
                        System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
                    }
                }while(!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"));
            }else if (cnt4==1){

                for (int r = 0; r < board.length; r++) {
                    for (int c = 0; c < board[r].length; c++) {
                        if (board[r][c] == 0) System.out.print("x ");
                        else if (board[r][c] == 1) System.out.print("o ");
                        else System.out.print("★ ");
                    }
                    System.out.println();
                }

                do{
                    System.out.print("게임을 다시 하시겠습니까? :");
                    cont=sc.nextLine();
                    if(cont.equalsIgnoreCase("n")){
                        System.out.println("게임을 종료합니다");
                        cnt4=2;
                    }else if(cont.equalsIgnoreCase("y")){
                        System.out.println("게임을 다시합니다");
                        cnt4=0;
                        for(int r=0;r<board.length;r++){
                            for(int c=0;c<board.length;c++){
                                board[r][c]=0;
                            }
                        }
                        turn=1;
                    }else{
                        System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
                    }
                }while(!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"));
            }

        }while (cnt4!=2);

    }
}
