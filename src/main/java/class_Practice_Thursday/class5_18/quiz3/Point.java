package class_Practice_Thursday.class5_18.quiz3;

class Point {
    private int x;
    private int y;

    public int getX()
    {
        return x;
    }
    public void setX(int xCoord)
    {
        this.x=xCoord;
    }

    public int getY()
    {
        return y;
    }
    public void setY(int yCoord)
    {
        this.y=yCoord;
    }
    public static void main(String[] args){
        Point p1 = new Point();
        p1.setX(100);
        p1.setY(200);
    }
};


