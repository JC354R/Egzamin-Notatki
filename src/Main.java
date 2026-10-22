public class Main {
    public static void main(String[] args) {

        Notatka notatkaTrojargumentowa = new Notatka(
                "Notatka statyczna",
                "tresc mojej notatki wpisana statycznie",
                true);

        Notatka notatkaJednoarguymentowa = new Notatka("tytul jednoarguentowy");
    }
}