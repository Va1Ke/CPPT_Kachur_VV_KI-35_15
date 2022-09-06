package KI_35_Kachur.lab7;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 */
public interface Instrument extends Comparable <Instrument>{
    /**
     * Getter price
     * @return double
     */
    double getPrice();
    void output();
}
