import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Usuarios {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JLabel lblEdad;
    private JSpinner spnEdad;
    private JLabel lblGenero;
    private JRadioButton rbtnM;
    private JRadioButton rbtnF;
    private JButton btnGuardar;
    private JTable tblDatos;
    public JPanel pnlMain;

    private char gender;
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuarios() {
        String[] cols = {"Nombre", "Apellido", "Edad", "Genero"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        tblDatos.setModel(model);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtnF);
        buttonGroup.add(rbtnM);

        rbtnM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender = 'M';
            }
        });
        rbtnF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender = 'F';
            }
        });
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] data = {txtNombre.getText(), txtApellido.getText(), spnEdad.getValue(), gender};
                model.addRow(data);
                txtNombre.setText("");
                txtApellido.setText("");
                spnEdad.setValue(0);
                rbtnF.setSelected(false);
                rbtnM.setSelected(false);
            }
        });
    }
}
