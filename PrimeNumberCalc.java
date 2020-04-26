// not working ???? 
import java.util.ArrayList;

public class PrimeNumberCalc{

  //method to test the prime number
  public static int PrimeNum(){
    // test 1-100 numbers for prime
    for(int i = 0; i < 100; i++){
        if(i == 2){
          //add prime number to arraylist
          primeNumbers.add(i);
          //test to see if the number is not two
        }else if(i != 2){
          // if checks (n/(n-1)) prime for divisble
            if(i % (i - 1) != 0){
              primeNumbers.add(i);
          }
        }
    }
  }


public static void main(String[] args){
  //System.out.println("Test-Test");

  //System.out.println(PrimeNum());
  ArrayList<Integer> primeNumbers = new ArrayList<>();

  System.out.println(ToString(primeNumbers));

}

}
