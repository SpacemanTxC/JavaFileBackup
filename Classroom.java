// imports the arrays package
import java.util.Arrays;

public class Classroom {

  public static void main(String[] args){
    // creates the student array
    String[] students = {"Sade", "Alexus", "Sam", "Koma"
    };
    // declares mathScores as new array
    double[] mathScores = new double[4];

    // values defined in array mathScores
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;
    //prints the length of the array for students 
    System.out.println("The number of studetns in the class is " + students.length);
  }
}
