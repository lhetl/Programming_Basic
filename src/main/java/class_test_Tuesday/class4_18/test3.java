package class_test_Tuesday.class4_18;

public class test3 {
    public static void main(String[] args){
        System.out.print("0 ");
        for(int fibo1 =0 ,fibo2=0, fibo3=1;fibo3<=5000;fibo3=fibo1+fibo2){
            System.out.print(fibo3+" ");
            fibo1=fibo2;
            fibo2=fibo3;

        }
    }
}
