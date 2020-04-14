/*This program creates a basic two input calculator that prints value created in the program to the terminal.*/

//class to create a calculator
public class Calculator{

  // constructor(blue print)
  public Calculator(){}

    //method of addition with two inputs
    public int add(int a, int b){
      return a + b;
    }

    //method of subtraction with two inputs
    public int subtract(int c, int d){
      return c -d;
    }

    //method of multiplication with two inputs
    public int multiply(int e, int f){
      return e * f;
    }

    //method of dividing with two inputs
    public int divide( int g, int h){
      return g / h;
    }

    //method of modulos with two inputs
    public int modulo(int i, int j){
      return i % j;

    }

    //main method
    public static void main(String[] args){
      //run the constructor for new object
      Calculator myCalculator = new Calculator();

      //runs the method of addition and prints out
      System.out.println(myCalculator.add(5, 7));

      //run the method of subtraction and prints out
      System.out.println(myCalculator.subtract(12, 34));
    }


}
