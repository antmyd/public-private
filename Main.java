public class Main {
    public static void main(String[] args) {
        //Public: Öffentlich - kann von allen anderen Klassen gesehen werden.
        //Private: Privat - kann von keiner Klasse ausßer eigener gesehen werden.
        String[] lieblingssongs = {"wenn du mich kennst", "Allstars2014"};
        
        // Erstelle ein Anton-Objekt
        Anton anton = new Anton(18, lieblingssongs, "i liebe mich");
        
        // Ausgabe des Anton-Objekts
        System.out.println(anton.getAlter());

        //Methode denke
        anton.rede();

        //Altersüberprüfung von Anton
        int antonsAlter = anton.getAlter();

        if(antonsAlter == 18) {
            System.out.println("du bist volljährig!");
        } 

        anton.setAlter(20);
        System.out.println(anton.getAlter());
    }
}