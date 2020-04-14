/*Droid that I created with different states: name, battery levels etc.*/
public class Droid{

  //object state
  String name;
  int batteryLevel;

  //string to print
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  //constructor for droid
  public Droid(String droidName){
    // each droid will have a name and 100 battery
    name = droidName;
    batteryLevel = 100;
  }
  // method to create what task is and the power level
  public String performTask(String task){
    batteryLevel = batteryLevel-10;
    return name + " is performing task: " + task;
  }
  // method energy report
  public String energyReport(){
    return "\nBattery level is "+ batteryLevel;
  }
  // method energy transfer
  public String energyTransfer(){
    if (batteryLevel != 100){
      batteryLevel = batteryLevel + 10;
    }
       return "Energy level increased to " + batteryLevel;
  }
  public static void main(String[] args){
    //create object new droid
    Droid droid1 = new Droid("Codey");

    // use name of the droid you want displayed
   System.out.println(droid1);

    //performing task
    System.out.println(droid1.performTask("dance"));
    System.out.println(droid1.energyReport());
    System.out.println(droid1.performTask("dance"));
    System.out.println(droid1.energyReport());
    // increase batter level
    System.out.println(droid1.energyTransfer());


  }
}
