package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm  extends JFrame {
    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textFhone;
    private JButton buttonCancel;
    private JButton buttonSave;


    public ContactForm(){

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().width / 2); //Definir local que a tela aparece ao iniciar o prgrama

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Vai matar o Programa ao fechar a janela

        setListeners();

    }

    private void setListeners() {

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                new MainForm();
                dispose();

            }
        });

    }

}
