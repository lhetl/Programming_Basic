package class_test_Tuesday.class5_30.test2;

public class CellPhone {
    private String model_name;
    private String make_company;
    private String color;;
    private String camera;
    private Boolean power;

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getMake_company() {
        return make_company;
    }

    public void setMake_company(String make_company) {
        this.make_company = make_company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String Camera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        if(camera==true){
            this.camera = "장착";
        }else if(camera==false){
            this.camera="미장착";
        }

    }

    public void setPowerOn() {
        this.power = true;
        System.out.println("전원이 켜졌습니다");
    }
    public void setPowerOff(){
        this.power=false;
        System.out.println("전원이 꺼졌습니다");
    }



    public String toString() {
        return "모델명 : " + model_name + "\n" +
                "제조사 : " + make_company + "\n" +
                "색상 : " + color + "\n" +
                "카메라 장착여부 : " + camera + "\n";
    }
}
