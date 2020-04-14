public class Magic {
	public static void main(String[] args) {
    // myNUmber as the original number
    int myNumber = 100;
    // each step
		int stepOne =  myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);

    /*the trick is that it will always equals three even
   if the myNumber int is changed. */
	}
}
