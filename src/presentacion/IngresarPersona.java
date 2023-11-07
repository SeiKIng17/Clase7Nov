package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel plnPirncipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JLabel lblidioma;
    private JComboBox cbmidioma;
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtPrefieroNoDecir;

    public IngresarPersona () {
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(plnPirncipal);
        this.setVisible(true);
        this.setSize(800,500);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cbmidioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "Masculino" :
                                (rbtFemenino.isSelected()) ? "Femenino" :
                                        (rbtOtro.isSelected()) ? "Otro" :
                                                (rbtPrefieroNoDecir.isSelected()) ? "PrefieroNoDecir": "";

                String mensaje = "Tus Datos son: \n" +
                                 "Codigo: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apelldio: " + apellido + "\n" +
                                 "idioma: " + idioma + "\n" +
                                 "AceptoTerminos" + aceptoTerminos;
                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}