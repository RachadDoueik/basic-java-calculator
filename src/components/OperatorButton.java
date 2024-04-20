package components;
import javax.swing.*;
import java.awt.*;

public class OperatorButton extends JButton{

    private char value;

    private String hexColor;

    public OperatorButton(char value , String hexColor) {
        //Constructor
        this.value = value;
        this.hexColor = hexColor;
        setSize(82,46);
        setBackground(Color.decode(hexColor));
        setForeground(Color.WHITE);
        setText(String.valueOf(value));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setBorder(null);
        setFont(new Font("sans-serif",Font.BOLD,30));
    }

    public char getValue () {
        return value;
    }
}
