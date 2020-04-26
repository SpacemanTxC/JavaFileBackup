class Mayan extends Language{

  Mayan(String language, int speakers){
    super(language, speakers, "Centeral America","verb-object-subject");
  }
  @Override
  public void getInfo(){
    System.out.println(this.name +" is spoken by "+   this.numSpeakers + " people mainly in " + this.regionsSpoken + "." + "\n" + " The language follows the word order: " + this.wordOrder);
  }

}
