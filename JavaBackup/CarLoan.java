public class CarLoan {
	public static void main(String[] args) {
		// var created for the calculator
  int carLoan = 10000;
  int loanLength = 3; //years
  int interestRate = 5; //5% intrest rate
	int downPayment = 2000;
	// if statement to check if the loan is an error , can be bought in full or the monthly payment
    if(loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    } else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full");
    } else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) /   100;
      int monthlyPayment = monthlyBalance + interest;
      //print out 233
      System.out.println(monthlyPayment);
    }
	}
}
