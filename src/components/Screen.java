package components;
import javax.swing.*;
import java.awt.*;

public class Screen extends JTextField{

    private int screenHeight , screenWidth;

    public Screen () {
        //Screen Setup
        screenHeight = 100;
        screenWidth = 390;
        setBackground(Color.decode("#ADBF5E"));
        setColumns(30);
        setFont(new Font( "sans-serif",Font.BOLD,50));
        setSize(screenWidth ,screenHeight);
        setEditable(false);
        setBorder(null);
    }

    public int getScreenWidth(){
        return screenWidth;
    }

    public int getScreenHeight(){
        return screenHeight;
    }
}
