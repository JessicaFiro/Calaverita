package calavera;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author Given
 */
public class Calavera extends JFrame{



   public Calavera() {
        setTitle("Calaverita");
        setSize(500, 500);
        setLayout(null);
        Componentes();
        //this.setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



   public void Componentes() {



       JLabel etiqueta = new JLabel();
        etiqueta.setBounds(280, 40, 500, 300);
        etiqueta.setForeground(Color.BLUE);
        
        //Imagen
        ImageIcon imagen = new ImageIcon("fondo1.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 500, 500);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));



       JButton boton = new JButton();
        boton.setText("CLICK AQUÍ!!");
        boton.setBounds(150, 400, 200, 30);
        boton.setForeground(Color.BLACK);
        boton.setBackground(Color.orange);
        boton.setFont(new Font("cooper black", Font.PLAIN, 20));
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {



               CalaveraLiteraria texto = new CalaveraLiteraria();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);



               setVisible(false);



           }
        });



       add(etiqueta);
        add(etiqueta2);
        add(boton);



   }



   public static void main(String[] args) {
        Calavera calavera = new Calavera();
        calavera.setVisible(true);
    }



}