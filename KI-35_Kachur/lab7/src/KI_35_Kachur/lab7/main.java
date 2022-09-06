package KI_35_Kachur.lab7;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 */
public class main {
    /**
     * Methods using
     * @param args string arguments
     */
    public static void main(String[] args) {
    	Vagon <?super Instrument> box = new Vagon<>();
        box.addInstrument(new SpareWheel(50,15,"Bosch"));
        box.addInstrument(new SpareWheel(100,12,"Ukrzaliznytsia"));
        box.addInstrument(new ConnectingRod(250,1,"Bosch"));
        box.addInstrument(new ConnectingRod(400,0.5,"Ukrzaliznytsia"));
        Instrument max = box.findMax();
        max.output();
        box.printAll();
    }
}
