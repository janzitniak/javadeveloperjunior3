package test;

public class StatickaMetodaMain {

    public static int vek;

    public static void main(String[] args) {
        String meno = "Ján";
        String priezvisko = "Žitniak";

        vek = 25;

        System.out.println("Moje meno je: " + meno + " " + priezvisko);
        System.out.println("A môj vek je " + vek);
    }
}
