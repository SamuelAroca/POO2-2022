import javax.swing.*;

public class ActividadClase {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setContentPane(new Registro().pnlForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
