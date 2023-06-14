package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SwingListApp extends JFrame {
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public SwingListApp() {
        setTitle("Swing List App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(list);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newItem = JOptionPane.showInputDialog(SwingListApp.this, "Enter a new item:");
                if (newItem != null && !newItem.isEmpty()) {
                    listModel.addElement(newItem);
                }
            }
        });

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public List<String> getListItems() {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            items.add(listModel.getElementAt(i));
        }
        return items;
    }

    public static void main(String[] args) {
        SwingListApp app = new SwingListApp();
        app.setVisible(true);
    }
}
