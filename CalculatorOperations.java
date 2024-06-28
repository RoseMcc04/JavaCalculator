public interface CalculatorOperations<T>  
{
  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public void add(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public void subtract(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public void multiply(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public void divide(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public void modulus(T n1, T n2); 
}