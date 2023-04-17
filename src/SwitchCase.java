public class SwitchCase {
    public static void main(String[] args) {
        int znamka = 4;
        switch (znamka) {
            case 1 -> System.out.println("Výborný");
            case 2 -> System.out.println("Chválitebný");
            case 3 -> System.out.println("Dobrý");
            case 4 -> System.out.println("Dostatočný");
            case 5 -> System.out.println("Nedostatočný");
            default -> System.out.println("Pre takú známku nemáme hodnotenie!");
        }

        String slovneHodnotenie = "Výborný";
        switch (slovneHodnotenie) {
            case "Výborný" -> System.out.println(1);
            case "Chválitebný" -> System.out.println(2);
            case "Dobrý" -> System.out.println(3);
            case "Dostatočný" -> System.out.println(4);
            case "Nedostatočný" -> System.out.println(5);
            default -> System.out.println("Pre takú známku nemáme hodnotenie!");
        }
    }
}
