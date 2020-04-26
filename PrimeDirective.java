// Import statement:
import java.util.ArrayList;

public class PrimeDirective{

  // Add your methods here:
  public boolean isPrime(int number){


    //for statement to run through array
    for(int i = 0; i < number; i++){
      // if statement to check prime number
      // number is check against i and returns false
      if(number % i == 0 && number == 2){
        return false;
      }else if(number < 2){
        return true;
      }
    }
     return true;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(6));
  }

}
