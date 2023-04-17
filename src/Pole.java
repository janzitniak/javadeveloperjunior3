public class Pole {
    public static void main(String[] args) {
        String [] auta = {"Honda", "Audi", "BMW"};
        // Cyklus s pevnym poctom opakovani, vypisanie obsahu pola
        for (int i = 0; i < auta.length; i++) {
            System.out.println(auta[i]);
        }
        // Foreach, efektivnejsi sposob vypisovanie pola
        for (String auto: auta) {
            System.out.println(auto);
        }

        int [] celeHodnoty = {1, 8, 10, 11, 12};
        // Foreach funguje aj na primitivne typy
        for (int celaHodnota: celeHodnoty) {
            System.out.println(celaHodnota);
        }


        // Priklad na scitanie
        double[] hodnoty = {1.90, 8, 10, 12, 15};
        double sum = 0;
        for (int i = 0; i < hodnoty.length; i++) {
            sum = sum + hodnoty[i];
        }
        System.out.println("Súčet je: " + sum);

        for (double hodnota: hodnoty) {
            System.out.println(hodnota);
        }
    }
}
