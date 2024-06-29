<<<<<<< HEAD
public class ScientificCalc implements CalculatorOperations<Double>
=======
public class ScientificCalc implements CalculatorOperations<Double> extends DecimalCalc
>>>>>>> calcOptions
{
    /**
     * @param n1 First input
     * @param n2 Second input
     * @return Returns sum of the inputs
     */
    @Override
    public Double add(Double n1, Double n2) 
    {
        return n1 + n2;
    }
}
