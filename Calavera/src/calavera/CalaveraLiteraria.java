package calavera;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Given
 */
public class CalaveraLiteraria extends JFrame {

    public CalaveraLiteraria() {
        setTitle("Calaverita");
        setSize(500, 500);
        setLayout(null);
        Componentes();
        //this.setResizable(false);
        setLocationRelativeTo(null);
    }

    public void Componentes() {

        JLabel eti = new JLabel();
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        JLabel etiqueta3 = new JLabel();
        JLabel etiqueta4 = new JLabel();
        JLabel etiqueta5 = new JLabel();
        
        eti.setText("** Para: Eduardo             De:Jessica **");
        eti.setForeground(Color.LIGHT_GRAY);
        eti.setBounds(80, 100, 350, 100);
        eti.setFont(new Font("serif", Font.PLAIN, 20));
        
        etiqueta.setText(" Mi amigo siempre serás ");
        etiqueta.setForeground(Color.RED);
        etiqueta.setBounds(110, 145, 200, 100);
        etiqueta.setFont(new Font("serif", Font.PLAIN, 17));
        
                
        etiqueta2.setText(" No importa que un día no vayas a estar " );
        etiqueta2.setBounds(110, 175, 300, 100);
        etiqueta2.setForeground(Color.ORANGE);
        etiqueta2.setFont(new Font("serif", Font.PLAIN, 17));
       
        
        etiqueta3.setText(" Un lugar en mi corazón sin duda tendrás " );
        etiqueta3.setBounds(110, 205, 300, 100);
        etiqueta3.setForeground(Color.YELLOW);
        etiqueta3.setFont(new Font("serif", Font.PLAIN, 17));
       
        
        
        etiqueta4.setText(" Pero con la catrina te irás a actuar " );
        etiqueta4.setBounds(110, 235, 300, 100);
        etiqueta4.setForeground(Color.GREEN);
        etiqueta4.setFont(new Font("serif", Font.PLAIN, 17));
      
        
        ImageIcon imagen = new ImageIcon("fondo.jpg");
        etiqueta5.setBounds(0,0,500,500);
        etiqueta5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta5.getWidth(), etiqueta5.getHeight(), Image.SCALE_SMOOTH)));
        
        JButton boton = new JButton();
        boton.setText("Regresar");
        boton.setBounds(175, 395, 100, 30);
        boton.setBackground(Color.LIGHT_GRAY);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Calavera literaria = new Calavera();
                literaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                literaria.setVisible(true);

                setVisible(false);

            }
        });

        add(eti);
        add(etiqueta);
        add(etiqueta2);
        add(etiqueta3);
        add(etiqueta4);
        add(etiqueta5);
        add(boton);

    }

}
