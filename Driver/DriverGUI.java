package Driver;

import java.util.Scanner;
import Calculator.DecimalGUI;
import Calculator.IntegerGUI;
import Calculator.ScientificGUI;

/**
 * @author Rose Mccormack
 * @version 2024
 */
public class DriverGUI 
{
    /**
     * @param args This is the main method that will activate the primary GUI
     * for user input and then activate a secondary GUI based on user 
     * preference.
     */
    public static void main(String[] args) 
    {

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
