package KI_35_Kachur.lab3;

import java.io.FileNotFoundException;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 * /
 /** @throws "FileNotFoundException"
 * @return void
 * Creation of a variable for classes made, using its methods
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
    	Ship sh = new Ship(new Hold(35.5),new Deck(20));
        sh.review();
        sh.show();
        sh.pw.close();
    }
}
