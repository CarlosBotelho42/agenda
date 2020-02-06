package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {


    private JButton buttonAdd;
    private JButton buttonDel;
    private JTable tableCont;
    private JLabel Label;
    private JPanel roorPanel;

    public MainForm(){

        setContentPane(roorPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().width / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();

    }

    private void setListeners() {

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                new ContactForm();
                dispose();

            }
        });

        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



            }
        });


    }





}
