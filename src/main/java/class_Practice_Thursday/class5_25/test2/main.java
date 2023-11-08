package class_Practice_Thursday.class5_25.test2;

public class main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(), m2 = new Matrix();
        int dto[][] = new int [][] {{1,2,3}, {4,5,6},{7,8,9}};
        m1.setData(dto);
        dto= new int[][] {{-1, -2, -3}, {4, 5, 6}, {-7, -8, -9}};
        m2.setData(dto);


        Matrix m3= m1.add(m2);
        System.out.println("두 행렬의 합"); display(m3.getMatrix());
        m3 = m1.subtract(m2);
        System.out.println("두 행렬의 차"); display(m3.getMatrix());
        m3 = m1.transpose();
        System.out.println("m1 행렬의 전치"); display(m3.getMatrix());
        m3 = m1.multiply(m2);
        System.out.println("두 행렬의 곱"); display(m3.getMatrix());
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
