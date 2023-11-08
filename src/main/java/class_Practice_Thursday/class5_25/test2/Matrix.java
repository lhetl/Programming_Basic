package class_Practice_Thursday.class5_25.test2;

public class Matrix {
    private int[][] Data=new int[3][3];

    public int[][] getMatrix() {
        return Data;
    }
    public void setData(int[][] data) {
        Data = data;
    }

    public Matrix add (Matrix plus){
        Matrix res = new Matrix();
        for(int i=0;i< plus.Data.length;i++){
            for(int j=0;j< plus.Data[i].length;j++){
                res.Data[i][j]=Data[i][j]+plus.Data[i][j];
            }
        }
        return res;

    }
    public Matrix subtract(Matrix sub){
        Matrix res = new Matrix();
        for(int i=0;i< sub.Data.length;i++){
            for(int j=0;j< sub.Data[i].length;j++){
                res.Data[i][j]=Data[i][j]-sub.Data[i][j];
            }
        }
        return res;

    }
    public Matrix transpose(){
        Matrix res= new Matrix();
        for(int i=0;i< Data.length;i++){
            for(int j=0;j<Data[i].length;j++){
                res.Data[j][i]=Data[i][j];
            }
        }
        return res;
    }

    public Matrix multiply(Matrix multi){
        Matrix res = new Matrix();
        int[][] dtoData=new int[Data.length][multi.Data[0].length];
        int cnt=0;
        for(int i=0;i<dtoData.length;i++){

            for(int j=0;j<dtoData[i].length;j++){
                cnt=0;
                for(int k=0;k<Data[i].length;k++){
                    cnt+=Data[i][k]*multi.Data[k][j];
                }
                dtoData[i][j]=cnt;
            }
        }
        res.setData(dtoData);
        return res;
    }
}
