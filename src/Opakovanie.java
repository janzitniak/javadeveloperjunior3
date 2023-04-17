public class Opakovanie {
    public static void main(String[] args) {
        var a = 1;
        switch (a) {
            case 1:
                System.out.println("Je to 1");
                break;
            case 2:
                System.out.println("Je to 2");
                break;
            default:
                System.out.println("Nie je to žiadne číslo");
        }

        var nejakyText = "Čau";
        switch (nejakyText) {
            case "Ahoj":
                System.out.println("Je to ahoj");
                break;
            case "Čau":
                System.out.println("Je to čau");
                break;
            default:
                System.out.println("Nie je to ani jedno z toho!");
        }


    }
}
