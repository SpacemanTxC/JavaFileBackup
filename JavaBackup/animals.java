class Animal {}
  //class animal is thee super class

public class Dog extands Animal{
  private String name;
  private String breed;
  // creates the blue print for dogs under animal
  // dog class is a subclass for animals


   Public Dog(String name, String breed){
     super(); // implicit call to the superclass constructor
     this.name = name; // uses this to call on the dog class
     this.breed = breed;
   }

   public Dog(){
     this("Fido", "German Sheperd") //this compiles to call and create 
   }
}
