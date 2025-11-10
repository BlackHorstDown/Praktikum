public class Konto {
    private double kontostand;

    public void setKontostand(double kontostand){
        if (kontostand<0){
            System.out.println("Kontostand zu niedrig");
            return;
        }
        this.kontostand = kontostand;
    }
    public double getKontostand(){
        return kontostand;
    };
}
