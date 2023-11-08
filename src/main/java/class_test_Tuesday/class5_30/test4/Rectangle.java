package class_test_Tuesday.class5_30.test4;

public class Rectangle {
    private int width;
    private int height;
    private Point point;
    public void setStartPoint(Point point) {
        this.point = point;
    }
    public int getX(){
        return this.point.getX();
    }
    public int getY(){
        return this.point.getY();
    }



    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return this.height * this.width;
    }
    public Rectangle intersect(Rectangle dto){
        Rectangle rec = new Rectangle();
        Point dtoPoint = new Point();
        Rectangle r1,r2;
        if(this.getArea()>dto.getArea()){
            r1=this;
            r2=dto;
        }else{
            r2=this;
            r1=dto;
        }

        int r1_x,r1_y,r1_width,r1_height,r2_x,r2_y,r2_width,r2_height;
        r1_x=r1.point.getX();
        r1_y=r1.point.getY();
        r1_width=r1.width;
        r1_height=r1.height;
        r2_x=r2.point.getX();
        r2_y=r2.point.getY();
        r2_width=r2.width;
        r2_height=r2.height;
        if(r2_x>=r1_x && r2_x+r2_width <=r1_x+r1_width){
            dtoPoint.setX(r2_x);
            rec.setWidth(r2_width);
        }else if(r2_x<r1_x){
            dtoPoint.setX(r1_x);
            rec.setWidth(r2_x+r2_width-r1_x);
        }else if(r1_x<r2_x){
            dtoPoint.setX(r2_x);
            rec.setWidth(r1_x+r1_width-r2_x);
        }
        if(r2_y>=r1_y && r2_y+r2_height <=r1_y+r1_height){
            dtoPoint.setY(r2_y);
            rec.setHeight(r2_height);

        } else if(r2_y<r1_y){
            dtoPoint.setY(r1_y);
            rec.setHeight(r2_y+r2_height-r1_y);
        }else if(r1_y<r2_y){
            dtoPoint.setY(r2_y);
            rec.setHeight(r1_y+r1_height-r2_y);
        }
        rec.setStartPoint(dtoPoint);
        if(rec.getHeight()<=0 || rec.getWidth()<=0){
            return null;
        }else{
            return rec;
        }


    }
}
