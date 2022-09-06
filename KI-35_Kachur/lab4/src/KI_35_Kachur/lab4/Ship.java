package KI_35_Kachur.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ship {

    /**
     * Creation of a file to write information
     */
    private static final File dataFile = new File("log.txt");
    PrintWriter pw;
    {
        try {
            pw = new PrintWriter(dataFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creation of new objects
     */
    Hold kt = new Hold();
    Deck br = new Deck();

    /**
     * "Putting" Deck and Hold into a box
     * @param kt
     * @param ix
     */
    public Ship(Hold kt, Deck br) {
        this.kt = kt;
        this.br = br;
    }

    /**
     * Gets Hold variables
     * @return kt
     */
    public Hold getKt() {
        return kt;
    }

    /**
     * Sets Hold variables
     * @param kt
     */
    public void setKt(Hold kt) {
        this.kt = kt;
    }
    /**
     * Gets Hold variables
     * @return br
     */
    public Deck getIx() {
        return br;
    }
    /**
     * Sets Deck variables
     * @param br
     */
    public void setIx(Deck br) {
        this.br = br;
    }
    /**
     * Gets Hold variables
     * @throws "FileNotFoundException"
     */
    public Ship() throws FileNotFoundException {
    }


    /**
     * Methods that print information into file
     * @param message
     * @throws FileNotFoundException
     */
    protected void logActivity(String message) throws FileNotFoundException {
        pw.println(message);
        pw.flush();
    }

    /**
     * Method for display of showing and printing info in file
     *
     * @throws FileNotFoundException
     */

    public void show() throws FileNotFoundException {
        System.out.println("showing");
        try {
            logActivity("method show() was called");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Method for notification of reviewing and printing info in file
     * @throws FileNotFoundException
     */
    public void review(){
        System.out.println("reviewing");
        try {
            logActivity("method review() was called");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
