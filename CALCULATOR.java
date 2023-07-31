import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculadora extends JFrame {
    // preparando váriaveis
    private JTextField numField1;
    private JTextField numField2;
    private JButton btnSoma;
    private JButton btnSubtrai;
    private JButton btnMultiplica;
    private JButton btnDivide;
    private JTextField resultField;

    public Calculadora() {
        // Configurações da janela
        setTitle("Calculadora");
        setSize(700, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        // Inicialização dos componentes
        numField1 = new JTextField();
        numField2 = new JTextField();
        btnSoma = new JButton("+");
        btnSubtrai = new JButton("-");
        btnMultiplica = new JButton("*");
        btnDivide = new JButton("/");
        resultField = new JTextField();

        // Adicionando os componentes à janela
        add(new JLabel("Número 1:"));
        add(numField1);
        add(new JLabel("Número 2:"));
        add(numField2);
        add(btnSoma);
        add(btnSubtrai);
        add(btnMultiplica);
        add(btnDivide);
        add(new JLabel("Resultado:"));
        add(resultField);

        // Configurando os listeners dos botões
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });

        btnSubtrai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });

        btnMultiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });
    }

    private void calcular(String operador) {

        // pegando os valores escritos nos campos
        String num1Str = numField1.getText();
        String num2Str = numField2.getText();

        // verifica se tem numeros nos campos antes de fazer a operação.
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite os dois números!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // convertendo os números para double.
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double resultado = 0.0;

        // com base no operador, fazer a operação
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;

                // mostra um erro caso tente dividir um numero por zero.
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }

        resultField.setText(String.valueOf(resultado)); // mostra o resultado
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}
