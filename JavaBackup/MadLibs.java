public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Tate
  Date: 2/12/2020
  */
  	public static void main(String[] args){

      String name1 = "Warlock";
      String name2 = "HellScream";

      String adjective1 = "evil";
      String adjective2 = "nasty";
      String adjective3 = "strong";

      String verb1 = "attack";

      String noun1 = "Orc";
      String noun2 = "magic";
      String noun3 = "horde";
      String noun4 = "fel born";
      String noun5 = "demon's blood";
      String noun6 = "elve";

      int number = 1000;

      String place1 = "Orgrimmar";


      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" summond "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

    System.out.println(story);
    }
}
