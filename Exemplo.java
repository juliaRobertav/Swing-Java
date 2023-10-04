package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Basico.janela"); //instancia o objeto de janela
        janela.setSize(800, 800); //método para tamanho da janela
        janela.setLocation(300, 300); //método que define a posição da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* quando fechar a janela o programa para de rodar,
        define ação ao fechar a janela */
        janela.setLayout(null); /*deixa livre pra qualquer método que for mover o componente, não fica limitado ao GRID
        define o tipo do layout, null permite posicionar elementos livremente*/
        janela.setVisible(true);

//        JLabel rotulo = new JLabel("Isto é uma label"); //instanciando a classe JLabel
//        rotulo.setBounds(100, 100, 300, 200); //definir posição e tamanho da janela
//        rotulo.setForeground(Color.decode("#f000")); //define cor do texto
//        rotulo.setFont(new Font("Arial", Font.BOLD, 40)); //define tamanho, estilo e tipo da fonte
//
//        janela.add(rotulo); //adiciona o componente da label na janela


        JButton botao = new JButton("Clique aqui");
        botao.setBounds(260, 200, 120, 60);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setForeground(Color.BLUE);
        botao.setBackground(Color.MAGENTA);
//        botao.addActionListener(e -> acao() );

        JTextField campoTexto = new JTextField();

        campoTexto.setSize(200, 50);
        campoTexto.setLocation(500, 600);

        JLabel label = new JLabel();
        label.setBounds(100, 100, 300, 200);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setText("Texto padrão");


        janela.add(campoTexto);
        janela.add(botao);
        janela.add(label);

        botao.addActionListener(e -> label.setText(campoTexto.getText()));

        janela.setVisible(true); //método que vai tornar a janela visivel
    }

//    public static void acao(){
//        System.out.println("Executando primeiro print");
//        System.out.println("Executando segundo print");
//    }


}
