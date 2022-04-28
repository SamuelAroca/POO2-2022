import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practica extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton guardarButton;
    private JTextArea textArea1;
    private JButton abrirButton;
    private JPanel panelMain;
    private JLabel lblNombreArchivo;

    private File file;

    String texto = "";

    public Practica() {
        setContentPane(panelMain);
        abrirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int result = chooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File fileToSave = chooser.getSelectedFile();
                        FileWriter fwriter = new FileWriter(fileToSave);
                        PrintWriter pwriter = new PrintWriter(fwriter);
                        pwriter.print(textArea1.getText());
                        fwriter.close();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(new JFrame(), "Error: " + ex.getMessage());
                    }
                }
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== guardarButton){
                    texto += textField1.getText() + "\t" +textField2.getText() + "\t" + textField3.getText() + "\n";
                    textArea1.setText(texto);
                    textField1.setText(null);
                    textField2.setText(null);
                    textField3.setText(null);

                }
            }
        });
    }
}
