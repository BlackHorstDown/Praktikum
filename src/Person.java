import javax.lang.model.element.Name;

public class Person {
    private String Name;
    private Integer Alter;
    public void setName(String Name){
        this.Name=Name;
    }
    public void setAlter(Integer Alter) {
        if (Alter > 0 && Alter < 100) {
            this.Alter = Alter;
        }
    }
        //if(MatNr<9999){Integer Matrikelnummer=MatNr;}
        // erste Zahle ?
        // int z = wert / 1000;
        // if (z>=1 && z<= 2)
}
