package class_Practice_Thursday.class5_18.practice3;

public class Complex {
    private double imagine,real;

    public String toString() {
        return real+ " + " + imagine + "i";
    }
    public Complex add(Complex complex){
        Complex res = new Complex();
        res.setReal(this.real+ complex.real);
        res.setImagine(this.imagine+ complex.imagine);
        return res;
    }
    public Complex subtract(Complex complex){
        Complex res = new Complex();
        res.setReal(this.real- complex.real);
        res.setImagine(this.imagine- complex.imagine);
        return res;
    }

    public double getImagine() {
        return imagine;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
}
