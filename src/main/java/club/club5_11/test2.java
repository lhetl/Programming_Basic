package club.club5_11;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        System.out.println("영어 문장을 입력하십시오.: ");
        String sentence;
        Scanner sc = new Scanner(System.in);
        sentence=sc.nextLine();
        sentence.trim();
        String[] array= sentence.split(" ");
        StringBuilder reverse_Sentence = new StringBuilder();
        System.out.println("역순으로 출력");
        for(int i=0;i< array.length;i++){
            StringBuilder sb= new StringBuilder(array[i]).reverse();
            reverse_Sentence.append(sb.append(" "));
        }
        System.out.println(reverse_Sentence.toString());
    }
}
