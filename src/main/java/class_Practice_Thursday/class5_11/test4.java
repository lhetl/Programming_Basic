package class_Practice_Thursday.class5_11;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        String str,changestr;
        System.out.println("문장을 입력하세요");
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();

        changestr=str.replaceAll("[^\\uAC00-\\uD7A30-9a-zA-Z]", " ");
        changestr=changestr.toUpperCase();
        String[] strArray=changestr.split(" ");
        int cnt=0;
        for(int i=0;i< strArray.length;i++){
            cnt=1;
            if(strArray[i]=="") continue;
            for(int j=i+1;j<strArray.length;j++){
                if(strArray[i].compareTo(strArray[j])==0){
                    cnt++;
                    if(i!=j){
                        strArray[j]="";
                    }

                }
            }
            System.out.println(strArray[i]+"    "+cnt);
        }

    }
}

/*
int cnt;
for(int i=0;i<subs.length.i++){
  if(subs[i] !=null){
      cnt=1;
      for(int j=i+1;j<subs.length;j++){
          if(subs[i].equals(subs[j])){
            cnt++;
            subs[j]=null;
          }
      }
      System.out.println(subs[i]+"\t"+cnt);
   }
}
 */
