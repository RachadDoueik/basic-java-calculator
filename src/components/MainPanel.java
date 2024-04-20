package components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel{
    private final int panelHeight , panelWidth;

    String screenState = "0";

    String memoryState = "";

    Screen screen;

    DigitButton zero ,one ,two ,three ,four ,five ,six ,seven ,eight ,nine;

    OperatorButton add, divide ,multiply ,subtract;

    Evaluate evaluate;

    AC ac;

    Point point;

    Power power;

    public MainPanel() {
         //Panel Setup
         panelHeight = 550;
         panelWidth = 450;
         setSize(panelWidth, panelHeight);
         Color grayHexColor = Color.decode("#202127");
         setBackground(grayHexColor);
         setLayout(null);


         //Setting Up and Adding The Screen
        screen = new Screen();
        screen.setText(screenState);
        add(screen).setBounds(30,30, screen.getScreenWidth(), screen.getScreenHeight());

        //Creating an instance of Custom Action Listener
        ButtonClickHandler bch = new ButtonClickHandler();

        //Digit Buttons:
        //Column 1
        zero = new DigitButton(0,185,46);
        zero.addActionListener(bch);
        one = new DigitButton(1,82,46);
        one.addActionListener(bch);
        four = new DigitButton(4 , 82 ,46);
        four.addActionListener(bch);
        seven = new DigitButton(7 , 82 ,46);
        seven.addActionListener(bch);
        //Column 2
        two = new DigitButton(2,82,46);
        two.addActionListener(bch);
        five = new DigitButton(5,82,46);
        five.addActionListener(bch);
        eight = new DigitButton(8,82,46);
        eight.addActionListener(bch);
        //Column 3
        three = new DigitButton(3,82,46);
        three.addActionListener(bch);
        six = new DigitButton(6,82,46);
        six.addActionListener(bch);
        nine = new DigitButton(9,82,46);
        nine.addActionListener(bch);


        //Special Buttons
        ac = new AC ();
        ac.addActionListener(bch);
        point = new Point();
        point.addActionListener(bch);
        evaluate = new Evaluate();
        evaluate.addActionListener(bch);
        power = new Power();
        power.addActionListener(bch);


        //Operator Buttons
        divide = new OperatorButton('÷',"#000000");
        divide.addActionListener(bch);
        multiply = new OperatorButton('×',"#000000");
        multiply.addActionListener(bch);
        add = new OperatorButton('+',"#A0A393");
        add.addActionListener(bch);
        subtract = new OperatorButton('-',"#A0A393");
        subtract.addActionListener(bch);

        //Adding Digit Buttons to the panel
        //Column 1
        add(zero).setBounds(30,424,zero.getWidth() ,zero.getHeight());
        add(one).setBounds(30,358,one.getWidth() ,one.getHeight());
        add(four).setBounds(30,292,four.getWidth() ,four.getHeight());
        add(seven).setBounds(30,226,seven.getWidth() , seven.getHeight());
        //Column 2
        add(two).setBounds(132,358,two.getWidth() , two.getHeight());
        add(five).setBounds(132,292,five.getWidth() ,five.getHeight());
        add(eight).setBounds(132,226,eight.getWidth() , eight.getHeight());
        //Column 3
        add(three).setBounds(234,358,three.getWidth() , three.getHeight());
        add(six).setBounds(234,292,six.getWidth() , six.getHeight());
        add(nine).setBounds(234,226,nine.getWidth() , nine.getHeight());


        //Adding Special Buttons
        add(ac).setBounds(30,160,ac.getWidth(),ac.getHeight());
        add(point).setBounds(234,424,point.getWidth(),point.getHeight());
        add(evaluate).setBounds(336,358,evaluate.getWidth(),evaluate.getHeight());
        add(power).setBounds(132,160,power.getWidth(),power.getHeight());


        //Adding Operator Buttons
        add(divide).setBounds(234,160,divide.getWidth(),divide.getHeight());
        add(multiply).setBounds(336,160,multiply.getWidth(),multiply.getHeight());
        add(subtract).setBounds(336,226,subtract.getWidth(),subtract.getHeight());
        add(add).setBounds(336,292,add.getWidth(),add.getHeight());

     }

     public int getPanelHeight(){
        return panelHeight;
     }

    public int getPanelWidth() {
        return panelWidth;
    }

    public void setScreenState (String newScreenState) {
        screenState = newScreenState;
    }

    public void setMemoryState(String newMemoryState) {
        memoryState = newMemoryState;
    }

   public class ButtonClickHandler implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            //Handling click on 0
               if(ae.getSource().equals(zero)) {
                   if(screen.getText().equals("0") && screen.getText().length() == 1){
                       setScreenState(screenState);
                   }
                   else{
                       setScreenState(screenState + "0");
                   }
                   screen.setText(screenState);
               }

            //Handling click on 1
            if(ae.getSource().equals(one)) {
                if(screen.getText().equals("0")){
                    setScreenState("1");
                }
                else{
                    setScreenState(screenState + "1");
                }
                screen.setText(screenState);
            }

            //Handling click on 2
            if(ae.getSource().equals(two)) {
                if(screen.getText().equals("0")){
                    setScreenState("2");
                }
                else{
                    setScreenState(screenState + "2");
                }
                screen.setText(screenState);
            }

            //Handling click on 3
            if(ae.getSource().equals(three)) {
                if(screen.getText().equals("0")){
                    setScreenState("3");
                }
                else{
                    setScreenState(screenState + "3");
                }
                screen.setText(screenState);
            }

            //Handling click on 4
            if(ae.getSource().equals(four)) {
                if(screen.getText().equals("0")){
                    setScreenState("4");
                }
                else{
                    setScreenState(screenState + "4");
                }
                screen.setText(screenState);
            }

            //Handling click on 5
            if(ae.getSource().equals(five)) {
                if(screen.getText().equals("0")){
                    setScreenState("5");
                }
                else{
                    setScreenState(screenState + "5");
                }
                screen.setText(screenState);
            }

            //Handling click on 6
            if(ae.getSource().equals(six)) {
                if(screen.getText().equals("0")){
                    setScreenState("6");
                }
                else{
                    setScreenState(screenState + "6");
                }
                screen.setText(screenState);
            }

            //Handling click on 7
            if(ae.getSource().equals(seven)) {
                if(screen.getText().equals("0")){
                    setScreenState("7");
                }
                else{
                    setScreenState(screenState + "7");
                }
                screen.setText(screenState);
            }

            //Handling click on 8
            if(ae.getSource().equals(eight)) {
                if(screen.getText().equals("0")){
                    setScreenState("8");
                }
                else{
                    setScreenState(screenState + "8");
                }
                screen.setText(screenState);
            }

            //Handling click on 9
            if(ae.getSource().equals(nine)) {
                if(screen.getText().equals("0")){
                    setScreenState("9");
                }
                else{
                    setScreenState(screenState + "9");
                }
                screen.setText(screenState);
            }

            //Handling AC click (Memory + Screen Clear)
            if(ae.getSource().equals(ac)){
                setScreenState("0");
                setMemoryState("");
                screen.setText(screenState);
                setMemoryState(memoryState);
            }


            //Handling Point Click
            if(ae.getSource().equals(point)){
                if(screenState.equals("0")){
                    setScreenState(screenState);
                }
                else if(!screenState.contains(".")) {
                    setScreenState(screenState + ".");
                }
                screen.setText(screenState);
            }

            //Handle Click on Add
            if(ae.getSource().equals(add)){
                if(screenState.equals("0")){
                    setScreenState(screenState);
                }
                else {
                    setMemoryState(memoryState + (screenState.contains("+") ? screenState.substring(1) : screenState));
                    setScreenState("+");
                    setMemoryState(Character.isDigit(memoryState.charAt(memoryState.length() -1)) ? memoryState + "-" : memoryState);
                    System.out.println(memoryState);
                }
                screen.setText(screenState);
            }


            //Handle Click on Subtract
            if(ae.getSource().equals(subtract)){
                if(screenState.equals("0")){
                    setScreenState(screenState);
                }
                else {
                    setMemoryState(memoryState + (screenState.contains("-") ? screenState.substring(1) : screenState));
                    setScreenState("-");
                    setMemoryState(Character.isDigit(memoryState.charAt(memoryState.length() -1)) ? memoryState + "-" : memoryState);
                    System.out.println(memoryState);
                }
                screen.setText(screenState);
            }

        }
   }
}
