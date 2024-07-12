package Calculator;
// Import statement for all javax.swing objects
import javax.swing.*;

import IntegerCalc;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Rose McCormack
 * @version 2024
 */
public class IntegerGUI extends IntegerCalc
{
    // position of x-axis for IntegerGUI object
    private static final int X_LOC = 300;
    // position of y-axis for IntegerGUI object
    private static final int Y_LOC = 300;
    // width of the IntegerGUI object
    private static final int WIDTH = 500;
    // height of the IntegerGUI object
    private static final int HEIGHT = 500;
    // name that will appear on IntegerGUI window
    private static final String NAME = "IntegerCalc";
    // name that will appear next to the result text field
    private static final String RESULT = "Result = ";
    // text result if there is an error
    private static final String ERROR_MESSAGE = "ERROR";
    // JFrame object for the IntegerGUI
    private JFrame frame;
    // JTextField for the left input on the IntegerGUI object
    private JTextField leftOpField;
    // JTextField for the right input on the IntegerGUI object
    private JTextField rightOpField;
    // JLabel for the result label for the calculation
    private JLabel resultLabel;

    /**
     * This is the no-arg constructor for the IntegerGUI. We will use this to
     * activate helper methods that create the GUI and its components. 
     */
    public IntegerGUI() 
    {
        createFrame();
        initializeComponents();
        displayFrame();
    }

    /**
     * @return This method returns the JFrame object used to create the 
     * IntegerGUI object. 
     */
    public JFrame getFrame() 
    {
        return frame;
    }

    /**
     * This method will create the JFrame object for the IntegerGUI. 
     */
    private void createFrame() 
    {
        frame = new JFrame();
        frame.setTitle(NAME);
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
    }

    /**
     * This method will initialize the components of the IntegerGUI object.
     */
    private void initializeComponents() 
    {
        initializeInputs();
        initializeResults();
        initializeButtons();
    }

    /**
     * This method will allow us to display the JFrame object for the 
     * IntegerGUI object.
     */
    private void displayFrame() 
    {
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This will allow us to initialize two areas for user input and will 
     * create the NORTH part of the BorderLayout layout model.
     */
    private void initializeInputs() 
    {
        leftOpField = new JTextField(5);
        leftOpField.setName("leftOperand");
        rightOpField = new JTextField(5);
        rightOpField.setName("rightOperand");
        JPanel north = new JPanel();
        north.add(leftOpField);
        north.add(rightOpField);
        frame.add(north, BorderLayout.NORTH);
    }

    /**
     * This method will allow us to initialize the results area for the 
     * IntegerGUI object in the CENTER part of the BorderLayout layout model.
     */
    private void initializeResults() 
    {
        JPanel center = new JPanel();
        resultLabel = new JLabel(RESULT);
        center.add(resultLabel);
        resultLabel.setName("resultLabel");
        frame.add(center, BorderLayout.CENTER);
    }

    /**
     * This method will help us initialize the buttons for the IntegerGUI 
     * object in the SOUTH part of the BorderLayout layout model. 
     */
    private void initializeButtons() 
    {
        JPanel south = new JPanel();
        JButton add = new JButton("+");
        add.setName("addButton");
        add.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int sum = add(getLeftNum(), getRightNum());
                updateResult(sum);
            } 
        });
        JButton subtract = new JButton("-");
        subtract.setName("subButton");
        subtract.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int diff = subtract(getLeftNum(), getRightNum());
                updateResult(diff);
            } 
        });
        JButton multiply = new JButton("x");
        multiply.setName("multButton");
        multiply.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int product = multiply(getLeftNum(), getRightNum());
                updateResult(product);
            } 
        });
        JButton divide = new JButton("÷");
        divide.setName("divButton");
        divide.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int quotient = divide(getLeftNum(), getRightNum());
                updateResult(quotient);
            } 
        });
        JButton mod = new JButton("%");
        mod.setName("subButton");
        mod.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int mod = modulus(getLeftNum(), getRightNum());
                updateResult(mod);
            } 
        });
        JButton exp = new JButton("^");
        exp.setName("subButton");
        exp.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int exp = exponent(getLeftNum(), getRightNum());
                updateResult(exp);
            } 
        });
        JButton sqrt = new JButton("√");
        sqrt.setName("subButton");
        sqrt.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int sqrt = squareRoot(getLeftNum());
                updateResult(sqrt);
            } 
        });
        JButton cbrt = new JButton("∛");
        cbrt.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                int cbrt = cubeRoot(getLeftNum());
                updateResult(cbrt);
            }    
        });
        south.add(add);
        south.add(subtract);
        south.add(multiply);
        south.add(divide);
        south.add(mod);
        south.add(exp);
        south.add(sqrt);
        south.add(cbrt);
        frame.add(south, BorderLayout.SOUTH);
    }
    
    /**
     * @return Returns the left number inputted by the user
     */
    private Integer getLeftNum() 
    {
        Integer leftNum = Integer.parseInt(leftOpField.getText());
        return leftNum;
    }

    /**
     * @return Returns the right number inputted by the user
     */
    private Integer getRightNum() 
    {
        Integer rightNum = Integer.parseInt(rightOpField.getText());
        return rightNum;
    }

    /**
     * Method that updates calculator result based on user input
     */
    private void updateResult(Integer result) 
    {
        if (!(result instanceof Integer)) 
        {
            resultLabel.setText(RESULT + ERROR_MESSAGE);
        }
        else 
        {
            resultLabel.setText(RESULT + result);
        }
    }
}
