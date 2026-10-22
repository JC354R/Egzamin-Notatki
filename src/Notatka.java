import java.time.LocalDate;
import java.util.Date;

public class Notatka {

    public String tytul;
    public String tresc;
    public boolean priorytet;
    public LocalDate dataDodania;

    //konstruktor 3 argumentowy
    public Notatka(String tytul, String tresc, boolean priorytet) {
        this.tytul = tytul;
        this.tresc = tresc;
        this.priorytet = priorytet;
        this.dataDodania = LocalDate.now();
    }

    //konstruktor 1 argumentowy
    public Notatka(String tytul) {
        this.tytul = tytul;
        this.tresc = "";
        this.priorytet = false;
        this.dataDodania = LocalDate.now();
    }

    //metoda wypisujaca notatke
    public void wyswietlNotatke (){
        System.out.println("_________________________");
        if(priorytet != false){
            System.out.println("Notatka WAŻNA! " + tytul);
        }else{
            System.out.println("Notatka " + tytul);
        }

        System.out.println(tresc);
        System.out.println(dataDodania);
        System.out.println("_________________________");

    }
}
