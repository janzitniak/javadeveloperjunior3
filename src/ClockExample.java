import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockExample {

    private JFrame frame;
    private JLabel timeLabel;

    public static void main(String[] args) {
        ClockExample clock = new ClockExample();
        clock.createAndShowGUI();
        clock.updateTime();
    }

    private void createAndShowGUI() {
        // Vytvoření hlavního okna
        frame = new JFrame("Java Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null); // vycentrovanie okna

        // Vytvoření a nastavení JLabelu pro zobrazení času
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(timeLabel);

        frame.setVisible(true);
    }

    private void updateTime() {
        while (true) {
            // Získání aktuálního času
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            // Aktualizace textu na JLabelu
            timeLabel.setText(sdf.format(now));

            // Pauza na 1 sekundu
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
