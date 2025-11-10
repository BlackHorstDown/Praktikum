public class testQuarder {
    public static void main(String[] args) {
        //neue klassen
        Quarder q1 = new Quarder();
        Quarder q2 = new Quarder();
        //setter
        q1.setWerte(10,10,10);
        q2.setWerte(10,10,9);

        double volumen1= q1.volumen();
        double volumen2= q2.volumen();
        if (volumen1>volumen2){
            System.out.println("Volumen1 ist größer");
            System.out.println(volumen1);
        } else if (volumen1<volumen2) {
            System.out.println("Volumen 2 ist größer");
            System.out.println(volumen2);

        } else{
            System.out.println("Volumen sind gleich");
        }

    }
}
