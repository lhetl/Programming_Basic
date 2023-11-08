package class_Practice_Thursday.class6_1.test1;

public class Plane {
    private int id,passengers;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Plane(){
        this(0,"",0);
    }
    public Plane(int id){
        this(id,"",0);
    }
    public Plane(int id,String model){
        this(id,model,0);
    }
    public Plane(int id,String model,int passengers){
        this.id=id;
        this.passengers=passengers;
        this.model=model;
    }
    public void print(){
        System.out.println("식별번호:"+this.id);
        System.out.println("모델:"+this.model);
        System.out.println("승객수:"+this.passengers);
        System.out.println();
    }
}
