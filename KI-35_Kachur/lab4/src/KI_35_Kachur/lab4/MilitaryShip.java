package KI_35_Kachur.lab4;

import java.io.FileNotFoundException;

/**
 * Creation of a variable for classes made, using its methods
 * @author Kachur Vladyslav
 * @version 1.0
 */

public class MilitaryShip extends Ship implements Hide {


	Ship a = new Ship(new Hold(35.5),new Deck(20));

    /**
     * Making default instruments military
     * @param hk Hook
     * @param ix IceAxe
     */
    public MilitaryShip(Hold hk, Deck ix) {
        super(hk, ix);
    }

    /**
     * Default constructor of MilitaryAlpinistInventory
     * @throws FileNotFoundException 
     */
    public MilitaryShip() throws FileNotFoundException {
        super();
    }

    /**
     * Method hide
     */
    @Override
    public void hide() {
        try {
            a.logActivity("Hiding");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hiding");
    }
}
