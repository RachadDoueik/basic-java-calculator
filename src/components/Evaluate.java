package components;
import javax.swing.*;
import java.awt.*;

public class Evaluate extends JButton {
    public Evaluate () {
        setSize(82,112);
        setBackground(Color.decode("#FB4710"));
        setForeground(Color.WHITE);
        setText("=");
        setBorder(null);
        setFont(new Font("sans-serif",Font.BOLD,30));
    }
}
