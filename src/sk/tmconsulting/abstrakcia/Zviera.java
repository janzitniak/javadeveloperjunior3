package sk.tmconsulting.abstrakcia;

// Abstract class
abstract class Zviera {
    // Abstraktna metoda (nemoze mat telo)
    public abstract void saPrejavuje();
    // Standardna metoda (ma implementaciu, interface by nam to nezobral)
    public void spi() {
        System.out.println("Zzz");
    }
}
