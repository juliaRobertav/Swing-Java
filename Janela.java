import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    Janela(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null); //conseguir mover melhor os componenentes
        setBackground(Color.PINK);
    }

}
