public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Ján";
        var priezvisko = "Žitniak";
        var vek = 18;

        System.out.println(meno);
        System.out.println(priezvisko);
        System.out.println(vek);

        // vek = vek + 1;
        // vek += 1;
        vek++; // to iste ako riadok vyssie, inkrementacia
        System.out.println("Vek o 1 rok viac = " +  vek);

        // vek = vek - 1;
        // vek -= 1;
        vek--; // dekrementacia
        System.out.println("Vek je znovu späť = " + vek);

    }
}
