public class TernarnyVyraz {
    public static void main(String[] args) {
        int time = 20;

        // Sposob cez IF
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Sposob cez ternarny vyraz
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
