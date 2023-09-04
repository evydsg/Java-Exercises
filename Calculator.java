
public class Calculator{
  public Calculator()
  {

  }

  public int add(int a, int b)
  {
    int sum = a + b;
    return sum;
  }
  
  public int subtract(int a, int b)
  {
    int difference = a - b;
    return difference;
  }

  public int multiply(int a, int b)
  {
    int product = a * b;
    return product;
  }

  public int divide(int a, int b)
  {
    int division = a/b;
    return division;
  }

  public int modulo(int a, int b)
  {
    int modulo = a%b;
    return modulo;
  }

  public static void main(String [] args)
  {
    Calculator myCalculator = new Calculator();
    
    System.out.println("Sum of two numbers: " + myCalculator.add(5,7));
    System.out.println("\nSubtraction of two numbers: " +myCalculator.subtract(45,11));
    System.out.println("\nProduct of two numbers: "+ myCalculator.multiply(29,3));
    System.out.println("\nDivision of two numbers: "+ myCalculator.divide(12,4));
    System.out.println("\nModulo of two numbers: "+ myCalculator.modulo(12,2));


  }
}