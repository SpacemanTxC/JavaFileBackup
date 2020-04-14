public class Continents {

  //Project is to create a program that prints out information about continents
	public static void main(String[] args) {
			// creates a var to store a value used later
    int continent = 4;
		// switch statement to go through the different continents
		switch (continent){
      case 1:
          System.out.println("North America: Mexico City , Mexico");
        	break;

      case 2:
          System.out.println("South America: Sao Paulo, Brazil");
        	break;

      case 3:
          System.out.println("Europe: Moscow, Russia");
        	break;
						// system prints out 3 because the value is 4
						// case 4 is where it checks the number value
       case 4:
          System.out.println("Africa: Lagos, Nigeria");
        	break;

       case 5:
          System.out.println("Asia: Shanghai, China");
      		break;

       case 6:
          System.out.println("Australia: Sydney, Australia");
          break;

       case 7:
          System.out.println("Antarctica: McMurdo Station, US");
      		break;
					// default print outs this message if nothing else works
      default:
      		System.out.println("Undefined continent");
    }

	}
}
