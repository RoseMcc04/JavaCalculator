package CalcOptions;
/**
 * @author Rose McCormack
 * @version 2024
 */
public class DecimalCalc implements CalculatorOperations<Double> 
{
    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns sum of both inputs
     */
    @Override
    public Double add(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(n1 + n2);
        return d1;
    }

    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns difference of both inputs
     */
    @Override
    public Double subtract(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(n1 - n2);
        return d1;
    }

    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns product of both inputs
     */
    @Override
    public Double multiply(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(n1 * n2);
        return d1;
    }

    /**
     * @param n1 First input - Dividend
     * @param n2 Second input - Divisor
     * @return Returns quotient of both inputs
     */
    @Override
    public Double divide(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(n1 / n2);
        return d1;
    }

    /**
     * @param n1 First input - Dividend
     * @param n2 Second input - Divisor
     * @return Returns remainder of both inputs
     */
    @Override
    public Double modulus(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(n1 % n2);
        return d1;
    }

    /**
     * @param n1 First input - Number
     * @param n2 Second input - Power
     * @return Returns result of n1 ^ n2
     */
    @Override
    public Double exponent(Double n1, Double n2) 
    {
        Double d1 = (double) Math.round(Math.pow(n1, n2));
        return d1;
    }

    /**
     * @param n1 First input - Number
     * @return Returns the square root of the input
     */
    @Override
    public Double squareRoot(Double n1) 
    {
        Double d1 = (double) Math.round(Math.sqrt(n1));
        return d1;
    }

    /**
     * @param n1 First input -Number
     * @return Returns the cube root of the input
     */
    @Override
    public Double cubeRoot(Double n1) 
    {
        Double d1 = (double) Math.round(Math.cbrt(n1));
        return d1;
    }
}
