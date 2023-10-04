import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        Janela janela = new Janela("Títul da Janela");
//        Rotulo rotulo = new Rotulo();
//        CampoTexto campoTexto = new CampoTexto();
//        Botao botao = new Botao("Botão");
//
//        botao.addActionListener(e -> rotulo.setText(campoTexto.getText()));
//        janela.add(rotulo);
//        janela.add(campoTexto);
//        janela.add(botao);
//        janela.setVisible(true);

        JFrame frame = new JFrame("Exemplo Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 800);

        ImageIcon iconeAmpliado = new ImageIcon("src/Imagens/opa.gif");
        iconeAmpliado.setImage(iconeAmpliado.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));

        JLabel label = new JLabel(iconeAmpliado);
        frame.add(label);
        frame.setVisible(true);


    }
}