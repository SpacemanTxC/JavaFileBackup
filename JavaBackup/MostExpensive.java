import java.util.ArrayList;

class MostExpensive {

  public static void main(String[] args) {
// creates an array list to store expenses
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
// stores mostExpensive items value
    double mostExpensive = 0;

    // Iterate over expenses
      //uses a for each loop to go through each expense in expenses
      //creates a double of expense
    for(double expense : expenses){
      //if statement uses to check then set the most expensive expense 
        if (expense > mostExpensive ){
          mostExpensive = expense;
        }
    }

    System.out.println(mostExpensive);

  }

}
