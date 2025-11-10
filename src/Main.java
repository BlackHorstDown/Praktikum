public class Main {

    public static void main(String[] args) { // <--- Korrigierte Signatur der main-Methode
        int a = 2;
        int b = 3;
        int c = 8;

        float result = ((float)a+b+c)/3;
        // Minimum
        System.out.println(result + " Mittelwert") ;
        int minimum = a;
        if (a>b){
            minimum = b;
        }
        if (minimum>c){
            minimum = c;
        }
        System.out.println(minimum + " Minimum") ;

        int n = 4;
        int quadrat = 0;
        int summe = 0;
        for (int i=1; i<=n; i++){
            quadrat = i*i;
            summe = summe+quadrat;
        }
        System.out.println(summe + " Quadrat") ;


        int t = 2;
        int ergebnis = 0;
        if (t < 0) {
            ergebnis = 10;
        }
        else if (t < 5 && 0<=t){
            ergebnis = 10 - 2*t;
        }
        else {
            ergebnis = 0;
        }

        System.out.println(ergebnis + " ergebnis") ;

        muster(5);
    } 

    // Die muster-Methode muss auch IN die Klasse!
    public static void muster(int n) {
        int muster = 0;
        for (int i=1; i<=n; i++){
            muster = (muster*10) +i;
            String punkte = "";
            for (int j=1; j<=n-i; j++){
                punkte = punkte + ".";

            }
            System.out.println(muster + punkte);
        }
    }

}