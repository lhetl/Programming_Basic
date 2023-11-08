package class_test_Tuesday.class6_13.test2;

public class CellPhone {
    private String model_name;
    private String make_company;
    private String color;;
    private String camera;
    private Boolean power;

    public CellPhone(String model_name, String make_company, String color, boolean camera_check, Boolean power) {
        this.model_name = model_name;
        this.make_company = make_company;
        this.color = color;
        if(camera_check==true){
            this.camera = "장착";
        }else if(camera_check==false){
            this.camera="미장착";
        }
        this.power = power;
    }

    public CellPhone(String model_name, String make_company, String color, String camera, Boolean power) {
        this.model_name = model_name;
        this.make_company = make_company;
        this.color = color;
        this.camera = camera;
        this.power = power;
    }

    public CellPhone(String model_name, String make_company, String color, boolean camera_check) {
        this(model_name,make_company,color,camera_check,false);
    }
    public CellPhone(String model_name, String make_company, String color, String camera_check) {
        this(model_name,make_company,color,camera_check,false);
    }
    public CellPhone(String model_name, String make_company, String color) {
        this(model_name,make_company,color,"미확인",false);
    }
    public CellPhone(String model_name, String make_company) {
        this(model_name,make_company,"미확인","미확인",false);
    }

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
