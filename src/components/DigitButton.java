package components;
import javax.swing.*;
import java.awt.*;
public class DigitButton extends JButton {

    private int value;

    private int width, height;

    public DigitButton(int value, int width, int height) {
        //handle constructor
        this.value = value;
        this.width = width;
        this.height = height;
        //Digit Button Setup
        setSize(width, height);
        setBackground(Color.decode("#A0A393"));
        setText(String.valueOf(value));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setFont(new Font("sans-serif", Font.BOLD, 30));
        setForeground(Color.WHITE);
        setBorder(null);
    }

    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }
    public int getValue () { return value; }
}
