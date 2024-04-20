package components;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
    private static int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private static int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    int frameWidth , frameHeight;


    public Calculator () {
        //Inheritance Handling
        super("Rashad's Java Calculator");

        //Setting Up The Frame
        setVisible(true);
        setResizable(false);
        frameHeight = 550;
        frameWidth = 460;
        setSize(frameWidth , frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        //Adding The Main Panel To The Frame
        MainPanel mainPanel = new MainPanel();
        add(mainPanel).setBounds(0,0, mainPanel.getPanelWidth() , mainPanel.getPanelHeight());

    }
}
