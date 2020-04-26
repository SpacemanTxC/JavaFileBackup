class Language{
  // attributes of lang
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // constructor for language
  Language(String langName, int speakers, String region, String order){
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = region;
    this.wordOrder = order;
  }
  //method get info
  public void getInfo(){
    System.out.println(this.name +" is spoken by "+ this.numSpeakers + " people mainly in " + this.regionsSpoken + "." + "\n" + " The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args){
    Language english = new Language("English", 500000000, "USA, England, and Canada", "Subject-Object-Verb");
    english.getInfo();

    Mayan kiche = new Mayan("KI'che", 2330000);
    kiche.getInfo();

    SinoTibetan chinese = new SinoTibetan("Chinese", 7500000);
    chinese.getInfo();

    SinoTibetan japanese = new SinoTibetan("Japanese", 450000);

    japanese.getInfo();



  }
}
