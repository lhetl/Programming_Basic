package class_Practice_Thursday.class5_25.test3;

public class Matrix{
    private int[][] Data;

    public int[][] getMatrix() {
        int[][] res = new int [Data.length][Data[0].length];
        for (int i=0;i<Data.length;i++){
            for(int j=0;j<Data[i].length;j++){
                res[i][j]=Data[i][j];
            }
        }
        return Data;
    }
    public void setData(int[][] data) {
        int[][] res = new int [data.length][data[0].length];
        for (int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
//                System.out.println(data[i][j]);
                res[i][j]=data[i][j];
            }
        }
        this.Data=res;
    }

    public Matrix add (Matrix plus) throws ArrayIndexOutOfBoundsException{
        Matrix res = new Matrix();
        if((Data.length != plus.Data.length) ||(Data[0].length != plus.Data[0].length) ){
            GlobalExceptionHandler();
        }
        res.Data=new int[Data.length][Data[0].length];
        for(int i=0;i<Data.length;i++){
            for(int j=0;j<Data[i].length;j++){
                if (Data.length<=i || Data[0].length <=j){
                    res.Data[i][j]+=0;
                }else{
                    res.Data[i][j]+=Data[i][j];
                }
                if (plus.Data.length<=i || plus.Data[0].length <=j){
                    res.Data[i][j]+=0;
                }else{
                    res.Data[i][j]+=plus.Data[i][j];
                }
            }
        }
        return res;
    }
    public Matrix subtract(Matrix sub) throws ArrayIndexOutOfBoundsException{
        Matrix res = new Matrix();
        if((Data.length != sub.Data.length) ||(Data[0].length != sub.Data[0].length) ){
            GlobalExceptionHandler();
        }
        res.Data=new int[Data.length][Data[0].length];
        for(int i=0;i<Data.length;i++){
            for(int j=0;j<Data[i].length;j++){
                if (Data.length<=i || Data[0].length <=j){
                    res.Data[i][j]+=0;
                }else{
                    res.Data[i][j]+=Data[i][j];
                }
                if (sub.Data.length<=i || sub.Data[0].length <=j){
                    res.Data[i][j]+=0;
                }else{
                    res.Data[i][j]+=sub.Data[i][j];
                }
            }
        }
        return res;
    }
    public Matrix transpose(){
        Matrix res= new Matrix();
        res.Data=new int[Data[0].length][Data.length];
        for(int i=0;i< Data.length;i++){
            for(int j=0;j<Data[i].length;j++){
                res.Data[j][i]=Data[i][j];
            }
        }
        return res;
    }

    public Matrix multiply(Matrix multi) throws ArrayIndexOutOfBoundsException{
        Matrix res = new Matrix();
        if(Data[0].length != multi.Data.length){
            GlobalExceptionHandler();
        }
        res.Data=new int[Data.length][multi.Data[0].length];
        int cnt=0;
        for(int i=0;i<res.Data.length;i++) {

            for (int j = 0; j < res.Data[i].length; j++) {
                cnt = 0;
                for (int k = 0; k < Data[i].length; k++) {
                    cnt += Data[i][k] * multi.Data[k][j];
                }
                res.Data[i][j] = cnt;
            }
        }
        return res;
    }
    public void GlobalExceptionHandler(){
//        System.out.println("행렬의 크기가 잘못되었습니다");
        try{

        }catch(IndexOutOfBoundsException e){
            System.out.println("행렬의 크기가 잘못되었습니다");
        }
    }
}
