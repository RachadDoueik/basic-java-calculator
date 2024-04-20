package components;

import javax.swing.*;
import java.awt.*;

public class Point extends JButton {
    public Point (){
        setSize(82,46);
        setBackground(Color.decode("#A0A393"));
        setForeground(Color.WHITE);
        setText(".");
        setBorder(null);
        setFont(new Font("sans-serif",Font.BOLD,30));
    }
}
