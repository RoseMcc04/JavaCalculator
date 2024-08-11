package Driver;

import Calculator.DecimalGUI;
import Calculator.IntegerGUI;
import Calculator.ScientificGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rose Mccormack
 * @version 2024
 */
public class DriverGUI 
{
    // position of x-axis of screen where the Driver appears
    private static final int X_LOC = 300;
    // position of y-axis of screen where the Driver appears
    private static final int Y_LOC = 300;
    // width of the Driver
    private static final int WIDTH = 500;
    // length of the Driver
    private static final int HEIGHT = 500;
    // name that will appear on the Driver window
    private static final String NAME = "CalcDriver";
    // frame object for the Driver
    private JFrame frame;

    /**
     * @param args This is the main method that will activate the primary GUI
     * for user input and then activate a secondary GUI based on user 
     * preference.
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    {
        DriverGUI newGUI = new DriverGUI();
    }

    /**
     * This is the no-arg constructor that will initialize the driver for
     * the multi-layer calculator. 
     */
    public DriverGUI() 
    {
        createFrame();
        initializeComponents();
        displayFrame();
    }

    /**
     * @return Returns the JFrame object for the GUI
     */
    public JFrame getFrame() 
    {
        return frame;
    }

    /**
     * This method will create the frame of the Driver.
     */
    private void createFrame() 
    {
        frame = new JFrame();
        frame.setTitle(NAME);
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
    }

    /**
     * This method is a helper method that initializes the components of the
     * Driver.
     */
    private void initializeComponents() 
    {
        initializeButtons();
    }

    /**
     * This method will allow us to display the Driver.
     */
    private void displayFrame() 
    {
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(0);
    }

    /**
     * This method will allow us to create the buttons in the Driver that will
     * activate separate calculators. 
     */
    private void initializeButtons() 
    {
        JPanel center = new JPanel();
        center.setName("center");
        JButton decimalButton = new JButton("Decimal");
        decimalButton.setName("decimalButton");
        decimalButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                CallDecimalGUI();
            }
        });
        JButton integerButton = new JButton("Integer");
        integerButton.setName("integerButton");
        integerButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                CallIntegerGUI();
            }
        });
        JButton scientificButton = new JButton("Scientific");
        scientificButton.setName("scientificButton");
        scientificButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                CallScientificGUI();
            }
        });
        center.add(decimalButton);
        center.add(integerButton);
        center.add(scientificButton);
        frame.add(center, BorderLayout.CENTER);
    }

    /**
     * This method will allow us to include a DecimalGUI object in the primary 
     * DriverGUI.
     */
    @SuppressWarnings("unused")
    private void CallDecimalGUI() 
    {
        DecimalGUI newGUI = new DecimalGUI();
    }

    /**
     * This method will allow us to include an IntegerGUI object in the 
     * primary DriverGUI.
     */
    @SuppressWarnings("unused")
    private void CallIntegerGUI() 
    {
        IntegerGUI newGUI = new IntegerGUI();
    }

    /**
     * This method will allow us to include a ScientificGUI oject in the
     * primary DriverGUI.
     */
    @SuppressWarnings("unused")
    private void CallScientificGUI() 
    {
        ScientificGUI newGUI = new ScientificGUI();
    }
}
