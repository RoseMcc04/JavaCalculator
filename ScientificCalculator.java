public class ScientificCalculator extends Calculator
{
    /**
     * @param n1 First decimal input
     * @param n2 Second decimal input
     * @return Returns a decimal sum of the two inputs
     */
    @Override
    public double addNums(double n1, double n2) throws IllegalArgumentException
    {
        return n1 + n2;
    }

    /**
     * @param n1 First decimal input
     * @param n2 Second decimal input
     * @return Returns the difference of the inputs
     */
    public double substractNums(double n1, double n2) 
    {
        return n1 - n2;
    }
}
