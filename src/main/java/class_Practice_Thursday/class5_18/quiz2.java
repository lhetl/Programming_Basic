package class_Practice_Thursday.class5_18;


public class quiz2
{
    private int hour, minute;
    /*
    public void print(){
        System.out.println(hour+" "+minute);
    }
    public static void main(String[] args) {
        quiz2 t = new quiz2();
        t.hour = 11;
        t.minute = 35;
        t.print();
    }*/

    public int gethour() {
        return hour;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int getminute() {
        return minute;
    }

    public void setminute(int minute) {
        this.minute = minute;
    }

    public static void main(String[] args) {
        quiz2 t = new quiz2();
        t.sethour(11);
        t.setminute(35);
        System.out.println(t.gethour()+t.getminute());
    }
};

