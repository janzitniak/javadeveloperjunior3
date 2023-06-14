package opakovanie.rozhranie;

// Definícia rozhrania Drawable
interface Drawable {
    void draw();
}

// Implementácia rozhrania pre triedu Circle
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Vykresľujem kruh");
    }
}

// Implementácia rozhrania pre triedu Rectangle
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Vykresľujem obdĺžnik");
    }
}

// Hlavná trieda
public class RozhranieMain {
    public static void main(String[] args) {
        Drawable drawable1 = new Circle();
        drawable1.draw(); // Vykresľujem kruh

        Drawable drawable2 = new Rectangle();
        drawable2.draw(); // Vykresľujem obdĺžnik
    }
}
