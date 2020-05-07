public class OverloadedMethods {
  //class needs the same name as the file

  public static void main(String[] args){
    //create instance here
    OverloadedMethods om = new OverloadedMethods();
    om.print();
    //the diff parameters for the methods are why they connect to the correct
    //print
    om.print("second print method");

    om.print("second"," third");
  }
  //overload methods here
  public void print(){
    System.out.println("original print method");
  }
  public void print(String str){
    //calls on the input about string str
    System.out.println(str);
  }
  public void print(String str, String str2){
    System.out.println(str + " " + str2);
  }
  // this has the same number of parameters as above so it will create an
  // error and the comilation will fail
  /*public void print(String first, String second){
    System.out.println(first+ " " +second);
  }*/
}
