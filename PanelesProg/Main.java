package PanelesProg;

// import java.awt.Dimension;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
// import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdivinarNumero juego = new AdivinarNumero();
            juego.setVisible(true);
        });
    }
}

    //     JFrame frame = new JFrame("Ventana");
    //     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //     JPanel panel = new JPanel();
    //     panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Establecer orientación vertical

    //     JTextField inputA = new JTextField(2);
    //     JTextField inputB = new JTextField(2);
    //     JLabel label = new JLabel("Función algebraica:");
    //     JTextField resultado = new JTextField(2);
    //     JButton sumarButton = new JButton("Sumar");
    //     JButton restarButton = new JButton("Restar");
    //     JButton dividirButton = new JButton("Dividir");
    //     JButton multiplicarButton = new JButton("Multiplicar");
    //     // Establecer dimensiones para los campos de entrada
    //     inputA.setPreferredSize(new Dimension(150, 30));
    //     inputB.setPreferredSize(new Dimension(150, 30));
    //     resultado.setPreferredSize(new Dimension(150, 30));

    //     panel.add(inputA);
    //     panel.add(inputB);
    //     panel.add(sumarButton);
    //     panel.add(restarButton);
    //     panel.add(dividirButton);
    //     panel.add(multiplicarButton);
    //     panel.add(label);
    //     panel.add(resultado);

    //     frame.getContentPane().add(panel);

    //     frame.pack();
    //     frame.setLocationRelativeTo(null);
    //     frame.setSize(500, 600);
    //     frame.setVisible(true);

    //     sumarButton.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             double a = Double.parseDouble(inputA.getText());
    //             double b = Double.parseDouble(inputB.getText());

    //             double resultadoCalculado = calculate(a, b, "+");

    //             resultado.setText(String.valueOf(resultadoCalculado));
    //         }
    //     });

    //     restarButton.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             double a = Double.parseDouble(inputA.getText());
    //             double b = Double.parseDouble(inputB.getText());

    //             double resultadoCalculado = calculate(a, b, "-");

    //             resultado.setText(String.valueOf(resultadoCalculado));
    //         }
    //     });
    //     multiplicarButton.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             double a = Double.parseDouble(inputA.getText());
    //             double b = Double.parseDouble(inputB.getText());

    //             double resultadoCalculado = calculate(a, b, "*");

    //             resultado.setText(String.valueOf(resultadoCalculado));
    //         }
    //     });

    //     dividirButton.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //             double a = Double.parseDouble(inputA.getText());
    //             double b = Double.parseDouble(inputB.getText());
    //             try{
    //                 double resultadoCalculado = calculate(a, b, "/");
    //                 resultado.setText(String.valueOf(resultadoCalculado));
    //             }catch(IllegalArgumentException ex){
    //                 JOptionPane.showInputDialog(frame, "No se puede dividir por cero"); // añadimos esto para que no pete el program
    //             }
    //         }
    //     });
    // }
    

    

    // public static double calculate(double number1, double number2, String operator) {
    //     switch (operator) {
    //         case "+":
    //             return number1 + number2;
    //         case "-":
    //             return number1 - number2;
    //         case "/":
    //             if(number2 == 0){
    //                 throw new IllegalArgumentException("No se puede dividir por cero");
    //             }else {
    //                 return number1 / number2;
    //             }
    //         case "*":
    //             return number1 * number2;
    //         default:
    //             throw new IllegalArgumentException("Operador no válido: " + operator);
    //     }
        // }

