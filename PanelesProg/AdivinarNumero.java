package PanelesProg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdivinarNumero extends JFrame {

    JLabel instrucciones;
    JTextField numAdivinar;
    JButton botonComprobar;
    JTextField comprobarButton;

    public AdivinarNumero() {
        setTitle("Juego de adivinar numero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // cracion de componentes :

        instrucciones = new JLabel("Introduce un numero");
        
        numAdivinar = new JTextField(5);
        botonComprobar = new JButton("Introduce un numero");

        // Config del layout
        setLayout(new BorderLayout());

        // Panle con componentes
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(instrucciones);
        panel.add(numAdivinar);
        panel.add(botonComprobar);

        add(panel, BorderLayout.CENTER);
        Random r = new Random();
        int rand = r.nextInt(100) * 1;
        // Listener
        botonComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el número ingresado por el usuario
                String textoNumero = numAdivinar.getText().trim();

                if (!textoNumero.isEmpty()) { // Verificar si el campo no está vacío
                    try {
                        int numeroIngresado = Integer.parseInt(textoNumero);

                        // Comparar con el número a adivinar (suponiendo que 'rand' es el número a
                        // adivinar)
                        if (numeroIngresado == rand) {
                            JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Has adivinado el número!");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El número ingresado no es correcto. ¡Sigue intentando!");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce un número.");
                }
            }

        });
    }

}