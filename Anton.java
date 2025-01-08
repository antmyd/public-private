public class Anton {
    private int alter; //Getter - dafür da, dass andere Klassen den Wert
                      //          eines privaten Attributes erfahren dürfen.

                      //Setter - dafür da, dass man private Attribute ändern kann.
    
    private String[] lieblingssongs;
    private String geheimnis;

    // Konstruktor der Klasse Anton ohne Fehler
    public Anton(int alter, String[] lieblingssongs, String geheimnis) {
        this.alter = alter;
        this.lieblingssongs = lieblingssongs;
        this.geheimnis = geheimnis;
    }
    //für andere Klassen ÖFFENTLICHE Methode
    private void denke() {
        System.out.println("Hmm");
    }
    //für andere Klassen PRIVATE Methode
    public void rede() {
        System.out.println("yapp yapp");
    }
    //Getter für alter
    public int getAlter() {
        return alter;
    }
    //Setter für alter
    public void setAlter(int neuesAlter) {
        this.alter = neuesAlter;
    }
    //Getter für geheimnis
    public String getGeheimnis() {
        return geheimnis;
    }
    //Setter für geheimnis
    public void setGeheimnis(String neuesGeheimnis) { //heißt: setGeheimnis AUF "neuesGeheimnis"
    this.geheimnis = neuesGeheimnis;
    }
    
}
