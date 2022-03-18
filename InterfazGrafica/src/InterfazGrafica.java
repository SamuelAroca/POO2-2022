import javax.swing.*;
import java.awt.*;

public class InterfazGrafica {

    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Saludo");
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Registro().pnlForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(960,739);
        frame.setLocationRelativeTo(null);


    }
}
