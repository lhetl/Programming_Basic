package class_Practice_Thursday.class6_1.test4;


public class NationTest {
    public static void main(String[] args) {
        double p1,p2,p3;
        Nation n1 = new Nation("대한민국",4977,100032,17074), n2 = new Nation("일본",12728,377835,39731), n3 = new Nation();
        n3.setCountry("중국");
        n3.setPopulation(133004);
        n3.setArea(9596960);
        n3.setIncome(3677);
        System.out.println("==================================================================================");
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        System.out.println("==================================================================================");

        Nation mostPopulation=new Nation();
        double max = Math.max(n1.getPopulation(),n2.getPopulation());
        max=Math.max(max,n3.getPopulation());
        if (max==n1.getPopulation()){
            mostPopulation=n1;
        }else if (max==n2.getPopulation()){
            mostPopulation=n2;
        }else if(max==n3.getPopulation()){
             mostPopulation=n3;
        }else{
            mostPopulation=null;
        }
        System.out.println("가장 인구가 많은 국가");
        System.out.println(mostPopulation.toString());
        System.out.println("==================================================================================");

        Nation mostIncome=new Nation();
        int max2 = Math.max(n1.getIncome(),n2.getIncome());
        max2=Math.max(max2,n3.getIncome());
        if (max2==n1.getIncome()){
            mostIncome=n1;
        }else if (max2==n2.getIncome()){
            mostIncome=n2;
        }else if(max2==n3.getIncome()){
            mostIncome=n3;
        }else{
            mostIncome=null;
        }
        System.out.println("가장 국민소득이 높은 국가");
        System.out.println(mostIncome.toString());
        System.out.println("==================================================================================");

        // main 메소드 나머지 부분 완성
    }
}
