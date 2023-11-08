package club.club5_25;


public class test1 {
    public static void main(String[] args){
        order("치킨");
        order("햄버거",2);
        order("피자","올리브 많이 주세요!");
    }

    public static void order(String food){
        System.out.println("주문한 음식:"+food);
    }

    public static void order(String food, int count){
        System.out.println("주문한 음식:"+food+",  수량: "+count);
    }

    public static void order(String food, String request){
        System.out.println("주문한 음식:"+food+", 요청사항: "+request);
    }
}


