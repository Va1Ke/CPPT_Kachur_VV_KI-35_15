package KI_35_Kachur.lab7;

import java.util.ArrayList;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 * @param <T>
 */
public class Box <T extends Instrument>{
    private final ArrayList<T> arr;

    /**
     * Constructor
     */
    public Box() {
       arr = new ArrayList<T>();
    }

    /**
     * Method to find max element of an array
     * @return T
     */
    public T findMax() {
        if (!arr.isEmpty()) {
            T max = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(max) > 0)
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }

    /**
     * Method to add an instrument to box
     * @param instrument instrument
     */
    public void addInstrument (T instrument){
        arr.add(instrument);
    }
    /**
     * Method to remove an instrument from box
     * @param instrument instrument
     */
    public void removeInstrument (T instrument){
        arr.remove(instrument);
    }

    /**
     * Print method
     */
    public void printAll(){
        for(T instrument : arr){
            instrument.output();
        }
    }
}
