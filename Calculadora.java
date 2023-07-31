import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
/*    private JTextField numField1;
    private JTextField numField2;
    private JButton btnSoma;
    private JButton btnSubtrai;
    private JButton btnMultiplica;
    private JButton btnDivide;
    private JTextField resultField;*/

    public Calculadora() {
        // Configurações da janela
        setTitle("Calculadora");
        setSize(300, 200);
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

        String num1Str = numField1.getText();
        String num2Str = numField2.getText();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite os dois números!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);


        // aqui é outra coisa

        double resultado = 0.0;

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
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }

        resultField.setText(String.valueOf(resultado));
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






















































/*
import javax.swing.*;
import java.awt.*;

public class MinhaInterfaceGrafica extends JFrame {

    public MinhaInterfaceGrafica() {
        // Configurar o título da janela
        setTitle("Minha Interface Gráfica");

        // Definir o tamanho da janela (largura, altura)
        setSize(400, 300);

        // Definir como a janela será fechada quando clicar no botão de fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Definir um layout para organizar os componentes (ex: BorderLayout, GridLayout, etc.)
        setLayout(new FlowLayout());

        // Criar e adicionar componentes à janela
        JButton botao = new JButton("Clique em mim!");
        JLabel rotulo = new JLabel("Olá, Mundo!");

        add(botao);
        add(rotulo);

    }

    public static void main(String[] args) {
        // Criar e exibir a janela da interface gráfica
        SwingUtilities.invokeLater(() -> {
            MinhaInterfaceGrafica janela = new MinhaInterfaceGrafica();
            janela.setVisible(true);
        });
    }
}
*/
