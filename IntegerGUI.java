// Import statement for all javax.swing objects
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Rose McCormack
 * @version 2024
 */
public class IntegerGUI extends IntegerCalc
{
<<<<<<< HEAD
    /**
     * This is the no-arg constructor for the IntegerGUI. We will have made 
     * helper methods to allow us to create a more efficient GUI 
     * algorithmically.
     */
    public IntegerGUI() 
    {

    }

    /**
     * @return This method returns the JFrame object for the IntegerGUI.
     */
    public JFrame getFrame() 
    {

    }

    /**
     * A helper method that allows us to create the JFrame for the IntegerGUI.
     */
    private void createFrame() 
    {

    }

    /**
     * 
     */
=======
    // position of x-axis for IntegerGUI object
    private static final int X_SIZE = 300;
    // position of y-axis for IntegerGUI object
    private static final int Y_SIZE = 300;
    // width of the IntegerGUI object
    private static final int WIDTH = 500;
    // height of the IntegerGUI object
    private static final int HEIGHT = 500;
    // name that will appear on IntegerGUI window
    private static final String NAME = "IntegerCalc";
    // text result if there is an error
    private static final String ERROR_MESSAGE = "ERROR";
    // JFrame object for the IntegerGUI
    private JFrame frame;
    // JTextField for the left input on the IntegerGUI object
    private JTextField leftOpField;
    // JTextField for the right input on the IntegerGUI object
    private JTextField rightOPField;
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
        rightOPField = new JTextField(5);
        rightOPField.setName("rightOperand");
        JPanel north = new JPanel();
        north.add(leftOpField);
        north.add(rightOPField);
        frame.add(north, BorderLayout.NORTH);
    }
>>>>>>> calcGUIs
}
