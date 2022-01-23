package utils;

public enum WordsReserved {

    URL_BASE  ("BASE_URL");


    private final String text;

    private WordsReserved(String text) {
        this.text = text;
    }

     public String  getText(){
        return this.text;
     }

}
