import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Notatka notatkaTrojargumentowa = new Notatka(
                "Notatka statyczna",
                "tresc mojej notatki wpisana statycznie",
                true);

        Scanner scanner = new Scanner(System.in);
        String wpisanaNotatka = scanner.nextLine();

        Notatka notatkaJednoarguymentowa = new Notatka(wpisanaNotatka);

        notatkaTrojargumentowa.wyswietlNotatke();
        notatkaJednoarguymentowa.wyswietlNotatke();
    }
}