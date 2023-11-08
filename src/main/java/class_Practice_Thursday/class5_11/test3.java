package class_Practice_Thursday.class5_11;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        System.out.println("문장을 입력하세요 :");
        String str;
        Scanner sc = new Scanner (System.in);
        str=sc.nextLine().trim();
        sc.close();
        boolean checkdot=false;
        char[] charset = str.toCharArray();
        for(int i=0;i<charset.length;i++){
            if (checkdot && Character.isLetter(charset[i]) && Character.isLowerCase(charset[i])){
                charset[i]=Character.toUpperCase(charset[i]);
                checkdot=false;
            }
            if(charset[i]=='.'){
                checkdot=true;
            }

        }
        str= new String(charset);
        if(checkdot==false){
            str+=".";
        }
        System.out.println(str);
    }
}


 /*   String str;
    System.out.println("문장을 입력하세요");
    Scanner sc = new Scanner(System.in);
    str=sc.nextLine();
    char[] strArray = str.toCharArray();
    boolean sentenceStart=false;
    for(int i=0;i<strArray.length;i++){
        if(!sentenceStart && Character.isLetter(strArray[i])){
          sentenceStart=true;
          if(Character.isLowerCase(strArray[i])){
              strArray[i]+=(char)('A'+(strArray[i]-'a'));
          }
        }else if(sentenceStart && strArray[i]=='.'){
              sentenceStart=false;
        }
    }
    str=new String(strArray);
    if (sentenceStart) str=str+".";
    System.out.println(str);
*/