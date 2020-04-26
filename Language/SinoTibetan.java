class SinoTibetan extends Language{

  SinoTibetan(String language, int speakers){
    super(language, speakers,"Asia", "subject-object-verb" );
    if(language.contains("Chinese")){
      this.wordOrder = "subject-verb-object";
    }
  }
}
