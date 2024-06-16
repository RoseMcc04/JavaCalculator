public class ScientificCalculator extends Calculator
{
    /**
     * @param n1 First decimal input
     * @param n2 Second decimal input
     * @throws IllegalArgumentExceltion This is thrown if one or both of the
     * input types is not a double.
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
     * @throws IllegalArgumentException This is thrown if one or both of the
     * input types is not a double.
     * @return Returns the difference of the inputs
     */
    @Override
    public double subtractNums(double n1, double n2) throws 
        IllegalArgumentException
    {
        return n1 - n2;
    }
}
