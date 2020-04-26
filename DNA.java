public class DNA{
 //program is to identify protien strains in DNA
  // 3 conditions /3; Starts ATG; Ends TGA


  public static void main(String[] args){

  // DNA strands used & var need to be in local scope
  String dna1 ="ATGCGATACGCTTGA"; //protein
  String dna2 = "ATGCGATACGTGA";  //not
  String dna3 = "ATTAATATGTACTGA"; //protein

  //main dna used (Change here for diff dna)
  String dna = dna1;
  //find length of dna
  int length = dna.length();
  // find where index begins
  int start  = dna.indexOf("ATG");
  // end of protien
  int end = dna.indexOf("TGA");

  System.out.println("Length :" + length);
  System.out.println("Start :" + start);

  //if statement checks if it is not -1 & / 3
  if(start != -1 && end != -1 && (end - start) % 3  == 0 ){
     //subtracing unwanted values
    String protein = dna.substring(start, end+3);
    System.out.println("Protein :" + protein);
  }else{
    System.out.println("No protein.");
  }



  }
}
