package Tarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Kevin Ramirez
 */
public class FormularioLibro extends JFrame implements ActionListener {
    JLabel eti1, eti2, eti3, eti4, eti5;
    JTextField txtnombre, txtcliente, txttelefono, txtcorreo;
    JButton btnaceptar, btnsalir, btnregresar;

    JPanel panel;

    FormularioLibro() {
        //Configuaracion de ventana
        setTitle("Formulario Libro");
        setLocationRelativeTo(null);
        setResizable(false);

        //Jlabels
        //titulo
        eti1 = new JLabel("Formulario Libro");
        eti1.setBounds(20, 30, 200, 20);
        
        //
        eti2 = new JLabel("Nombre ");
        eti2.setBounds(40, 80, 180, 20);

        eti3 = new JLabel("Editorial ");
        eti3.setBounds(40, 120, 180, 20);
        
        eti4 = new JLabel("Fecha");
        eti4.setBounds(40, 160, 180, 20);
        
        eti5 = new JLabel("Autor");
        eti5.setBounds(40, 200, 180, 20);

        //texto
        txtnombre = new JTextField();
        txtnombre.setBounds(100, 80, 180, 20);

        txtcliente = new JTextField();
        txtcliente.setBounds(100, 120, 180, 20);
        
        txttelefono = new JTextField();
        txttelefono.setBounds(100, 160, 180, 20);
        
        txtcorreo = new JTextField();
        txtcorreo.setBounds(100, 200, 180, 20);

        //botones
        btnsalir = new JButton("Salir");
        btnsalir.addActionListener(this);
        btnsalir.setBounds(260, 280, 80, 20);
        
        btnaceptar = new JButton("Aceptar");
        btnaceptar.setBounds(140, 280, 80, 20);
        
        btnregresar = new JButton("Menú");
        btnregresar.addActionListener(this);
        btnregresar.setBounds(50, 280, 80, 20);
        
        //JPanel
        panel = new JPanel();
        panel.setLayout(null);

        panel.add(eti1);
        panel.add(eti2);
        panel.add(eti3);
        panel.add(eti4);
        panel.add(eti5);

        panel.add(txtnombre);
        panel.add(txtcliente);
        panel.add(txttelefono);
        panel.add(txtcorreo);

        panel.add(btnaceptar);
        panel.add(btnregresar);
        panel.add(btnsalir);

        add(panel);
        setSize(400, 400);
        setVisible(true);
        setResizable(false);

    }//closed
    
    public static void main(String[] args) {
        FormularioLibro f3 = new FormularioLibro();

    }//closed main

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnsalir) {
            System.exit(0);
        }

        if (e.getSource() == btnregresar) {
            Principal newPrincipal = new Principal();
            newPrincipal.setVisible(true);

            this.dispose();
        }
    }//closed
    
}//closed class
