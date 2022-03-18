import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Registro {
    private JLabel nombre;
    private JTextField digiteSuNombreTextField;
    public JLabel peso;
    public JLabel estatura;
    private JTextField digiteElPesoEnTextField;
    private JTextField digiteLaEstaturaEnTextField;
    private JButton calcularButton;
    public JPanel pnlForm;

    public Registro() {
        digiteElPesoEnTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        digiteLaEstaturaEnTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!digiteSuNombreTextField.getText().isEmpty() && !digiteElPesoEnTextField.getText().isEmpty() && !digiteLaEstaturaEnTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(new JFrame(),"Su IMC es: " + calcularIMC());
                }else {
                    JOptionPane.showMessageDialog(new JFrame(), "Termine de llenar loca");
                }
            }
        });
    }

    public Float calcularIMC(){
        float peso = Float.parseFloat(digiteElPesoEnTextField.getText());
        float altura = Float.parseFloat(digiteLaEstaturaEnTextField.getText());
        return peso/(altura*altura);
    }
}
