public class Quarder {
    // parameter
    private double a;
    private double b;
    private double c;
    //methoden
    public void setWerte(double a, double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double volumen(){

        return a*b*c;
    }
    public double mantel(){

        return 2*(a*c+b*c);
    }
}
