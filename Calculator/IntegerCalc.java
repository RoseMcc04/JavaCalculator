package Calculator;
/**
 * @author Rose McCormack
 * @version 2024
 */
public class IntegerCalc implements CalculatorOperations<Integer>
{
    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns sum of both inputs
     */
    @Override
    public Integer add(Integer n1, Integer n2) 
    {
        return n1 + n2;
    }

    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns difference of both inputs
     */
    @Override
    public Integer subtract(Integer n1, Integer n2) 
    {
        return n1 - n2;
    }

    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns product of both inputs
     */
    @Override
    public Integer multiply(Integer n1, Integer n2) 
    {
        return n1 * n2;
    }

    /**
     * @param n1 First input - Dividend
     * @param n2 Second input - Divisor
     * @return Returns quotient of both inputs
     */
    @Override
    public Integer divide(Integer n1, Integer n2) 
    {
        return n1 / n2;
    }

    /**
     * @param n1 First input - Dividend
     * @param n2 Second input - Divisor
     * @return Returns remainder of both inputs
     */
    @Override
    public Integer modulus(Integer n1, Integer n2) 
    {
        return n1 % n2;
    }

    /**
     * @param n1 First input - Number
     * @param n2 Second input - Power
     * @return Returns result of n1 ^ n2
     */
    @Override
    public Integer exponent(Integer n1, Integer n2) 
    {
        return (int) Math.pow(n1, n2);
    }

    /**
     * @param n1 First input - Number
     * @return Returns the square root of the input
     */
    @Override
    public Integer squareRoot(Integer n1) 
    {
        return (int) Math.sqrt(n1);
    }

    /**
     * @param n1 First input -Number
     * @return Returns the cube root of the input
     */
    @Override
    public Integer cubeRoot(Integer n1) 
    {
        return (int) Math.cbrt(n1);
    }
}
