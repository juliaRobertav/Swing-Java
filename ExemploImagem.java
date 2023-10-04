import javax.swing.*;

public class ExemploImagem extends JFrame {

    public ExemploImagem(){
        super("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 800);

        ImageIcon icon = new ImageIcon("src/Imagens/indo.jpg");
        JLabel label = new JLabel(icon);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExemploImagem();
    }


}
