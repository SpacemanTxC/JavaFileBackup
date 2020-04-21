import java.util.ArrayList;

class PrimeNumbers{
  // create an array to store the values of prime numbers
  // then create an if statement to check if the value is a prime numbers
  // store prime number in the array
  // display the array


  // array to store base prime numebrs
  static int[] basePrimeNum =  {1,3,5,7};
  // creates array(needs to be init)
  ArrayList<Integer> primeNumList = new ArrayList<Integer>();


  //main method
  public static void main(String[] args){
      // System.out.println(basePrimeNum[0] + "Test");

    //if statement to create numbers to use for array
    for(int i = 0; i < 100; i++ ){
      if(((i + 1)% i) != 0){
        System.out.println("Test " + basePrimeNum[0]);
      }
    }
  }
}
