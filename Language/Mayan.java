class Mayan extends Language{

  Mayan(String language, int speakers){
    //super is needed to take the atturibes for parents
    super(language, speakers, "Centeral America","verb-object-subject");
  }
  //override is used for children to take over parent
  @Override
  public void getInfo(){
    System.out.println(this.name +" is spoken by "+   this.numSpeakers + " people mainly in " + this.regionsSpoken + "." + "\n" + " The language follows the word order: " + this.wordOrder);
  }

}
