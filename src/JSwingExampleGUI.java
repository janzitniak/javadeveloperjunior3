import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class JSwingExampleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World Swing Title"); // vytvorime okno

        frame.setMinimumSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny

        frame.setContentPane(panel); // my dany panel pridame do frame


        // JText
        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField);


        JLabel labelText = new JLabel("Hello World Swing!"); // popisok
        labelText.setBounds(140,50,150,20); // x, y, sirka, vyska
        panel.add(labelText);


        JButton btnOk = new JButton("Vypiš!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                labelText.setText( textField.getText() );
            }
        });


        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(210, 100, 80, 20);
        panel.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });


        // display it
        frame.pack();
        frame.setVisible(true);
    }
}