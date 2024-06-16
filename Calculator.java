public class Calculator 
{
  /**
   * @param n1 First decimal input
   * @param n2 Second decimal input
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the decimal sum of the two inputs
   */
  public double addNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(n1 + n2);
  }

  /**
   * @param n1 First decimal input
   * @param n2 Second decimal input
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the difference of two numbers
   */
  public double subtractNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(n1 - n2);
  }

  /**
   * @param n1 First decimal input
   * @param n2 Second decimal input
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the product of the two numbers
   */
  public double multiplyNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(n1 * n2);
  }

  /**
   * @param n1 First decimal input
   * @param n2 Second decimal input
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the quotient of the two numbers
   */
  public double divideNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(n1 / n2);
  }

  /**
   * @param n1 First decimal input
   * @param n2 Second decimal input
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the remainder of the two numbers
   */
  public double modNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(n1 % n2);
  }

  /**
   * @param n1 Number being multiplied by itself
   * @param n2 The exponent the user chooses
   * @throws IllegalArgumentException This is thrown is one or both of the
   * input types is not a double.
   * @return Returns the result of the exponent
   */
  public double expNums(double n1, double n2) throws IllegalArgumentException
  {
    return Math.round(Math.pow(n1, n2));
  }
}