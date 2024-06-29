public interface CalculatorOperations<T>  
{
  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T add(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T subtract(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T multiply(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T divide(T n1, T n2);

  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T modulus(T n1, T n2);
  
  /**
   * @param n1 First input
   * @param n2 Second input
   */
  public T exponent(T n1, T n2);

  /**
   * @param n1 First input
   */
  public T squareRoot(T n1);

  /**
   * @param n1 First input
   */
  public T cubeRoot(T n1);
}