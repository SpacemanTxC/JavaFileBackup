public class SavingsAccount {
  // create the overall balance var
  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  //method to check and view your account balance
  public void checkBalance(){
    System.out.println( "Hello!");
    System.out.println("Your balance is "+ balance);
  }
  // method to deposit values
  public int deposit(int amountToDeposit){
    int newAmount = balance + amountToDeposit;
    balance = newAmount;
    System.out.println("You just deposited " + amountToDeposit);
    return balance;
  }
  // method to withdraw values
  public int withdraw(int amountToWithdraw){
    int newAmount2 = balance - amountToWithdraw;
    balance = newAmount2;
    System.out.println("You just withdrew " + amountToWithdraw);
    return balance;
  }

  public String toString(){
  return "This is a savings account with " + balance + " saved.";
}

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    savings.withdraw(300);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

  }
}
