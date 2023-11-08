package class_test_Tuesday.class4_11;

public class test3 {
    public static void main(String[] args){
        int fibo1=0 ,fibo2=0, fibo3=1;
        System.out.print(fibo2+" ");
        while(fibo3<=5000){
            System.out.print(fibo3+" ");
            fibo1=fibo2;
            fibo2=fibo3;
            fibo3=fibo2+fibo1;

        }
    }
}
