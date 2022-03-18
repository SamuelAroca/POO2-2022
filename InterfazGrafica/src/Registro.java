import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registro {
    public JPanel pnlForm;
    private JTextField textField1;
    private JLabel Apellido;
    private JTextField textField2;
    private JButton saludarButton;
    private JLabel fechana;
    private JTextField ddMmYyyyTextField;
    private JButton fechanacimiento;

    public Registro() {
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().isEmpty() && !textField2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(new JFrame(),"Hola " + textField1.getText() + " " + textField2.getText());
                }else {
                    JOptionPane.showMessageDialog(new JFrame(), "Loca");
                }
            }
        });
    }

    private static boolean isValidFormat(String date) throws ParseException {
        Date myDate = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            myDate = format.parse(date);
            if (!date.equals(format.format(myDate))){
                myDate = null;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(new JFrame(),"Error: " + e.getMessage());
        }
        if (date == null){
            return false;
        }else {
            return true;
        }
    }
}
