package class_Practice_Thursday.class6_1.test3;

public class Movie {
    private String name;
    private String director;
    private double point;

    public Movie(String name, String director, double point) {
        this.name = name;
        this.director = director;
        this.point = point;
    }
    public Movie(){
        this("","",0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String dircetor) {
        this.director = dircetor;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public void print(){
        System.out.println("영화제목:"+this.name);
        System.out.println("영화감독:"+this.director);
        System.out.println("평   점:"+this.point);
        System.out.println();
    }
}
