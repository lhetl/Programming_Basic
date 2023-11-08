package class_Practice_Thursday.class6_1.test4;

public class Nation {
    private String country;
    private double population;
    private int area;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    private int income;
    public Nation(){
        this("",0.0,0,0);
    }

    public Nation(String country, double population, int area, int income) {
        this.country = country;
        this.population = population;
        this.area = area;
        this.income = income;
    }

    public String getCountry() {
        return country;
    }

    public double getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public int getIncome() {
        return income;
    }

    public String toString() {
        return "국가 이름 : "+this.country+
                "\n인    구 : "+this.population+"만명"+
                "\n넓    이 : "+this.area+"km^2"+
                "\n국민 소득 : "+this.income+"$";
    }

}
