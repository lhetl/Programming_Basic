package class_Practice_Thursday.class5_11;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner (System.in);
        System.out.print("영문 문자열을 입력하세요: ");
        str=sc.nextLine();
        sc.close();
        char[] strArray = str.toCharArray();
        int cnt=0;
        boolean wordstart=false;
        for(int i=0; i<strArray.length;i++){
            if(!wordstart && Character.isLetter(strArray[i])){
                wordstart=true;
                cnt++;
            }else if (wordstart && !Character.isLetter(strArray[i])){

                wordstart=false;
            }
        }
        if(wordstart){cnt++; wordstart=false; } // cnt++ else에 넣었을때
        System.out.println("영단어의 개수는 : "+cnt+" 개 입니다");
    }
}
