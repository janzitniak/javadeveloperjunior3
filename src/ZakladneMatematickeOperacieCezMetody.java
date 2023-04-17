public class ZakladneMatematickeOperacieCezMetody {

    public static double scitaj(double cis1, double cis2) {
        return cis1 + cis2;
    }

    //TODO Pridajte dalsie metody, ktore budu pracovat s dalsimi matematickymi operaciami



    public static void main(String[] args) {
        double cislo1 = 5.0;
        double cislo2 = 2.5;

        System.out.printf("Výsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je: " + scitaj(cislo1, cislo2));

    }
}
