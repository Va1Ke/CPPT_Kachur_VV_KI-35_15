package KI_35_Kachur.lab3;


public class Deck {
    /**
     * @param size of Deck
     */
    double size;

    /**
     *Constructor of Deck
     * @param size of Deck
     */
    public Deck(double size) {
        this.size = size;
    }
    public Deck() {

    }
    /**
     * Gets the size of an Deck
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of an Deck
     * @param size of Deck
     */
    public void setSize(double size) {
        this.size = size;
    }
}
