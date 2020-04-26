class SinoTibetan extends Language{

//contrusctor
  SinoTibetan(String language, int speakers){
    super(language, speakers,"Asia", "subject-object-verb" );
    // if to check lang chinese or not
    if(language.contains("Chinese")){
      this.wordOrder = "subject-verb-object";
    }
  }
}
