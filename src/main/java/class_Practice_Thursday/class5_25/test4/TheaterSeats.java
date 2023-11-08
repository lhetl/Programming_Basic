package class_Practice_Thursday.class5_25.test4;

import java.util.Scanner;

public class TheaterSeats {
    private int[][] data;


    public void setSize(int r,int c){
        data=new int[r][c];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=0;
            }
        }
    }

    public int getRows(){
        return data.length;
    }
    public int getCols(){
        return data[0].length;
    }

    public int getData(int r, int c) {
        return data[r][c];
    }

    public void setData(int r,int c,int v) {
        data[r][c]=v;
    }

}
