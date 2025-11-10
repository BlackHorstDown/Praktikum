public class RechteckTest {
    public static void main(String[] args) {
        Rechteck r = new Rechteck();
        r.breite = 8.0;
        r.laenge = 2.0;
        double f = r.getFlaeche();
        System.out.println(f);
// (1) Objekt erzeugen
// (2) Datenfelder direkt setzen
// (3) Fläche in eine Variable schreiben und dann ausgeben
    }
} // class