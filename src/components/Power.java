package components;

import javax.swing.*;
import java.awt.*;

public class Power extends JButton {
    public Power () {
        setSize(82,46);
        setBackground(Color.black);
        setForeground(Color.WHITE);
        setText("POW");
        setBorder(null);
        setFont(new Font("sans-serif",Font.BOLD,30));
    }
}
