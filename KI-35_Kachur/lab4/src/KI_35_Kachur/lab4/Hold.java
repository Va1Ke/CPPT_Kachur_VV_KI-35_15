package KI_35_Kachur.lab4;

public class Hold {
    /**
     * @param name of Hold
     */
	double volume;

    /**
     *Constructor of Hold
     * @param name
     */
    public Hold(double volume) {
        this.volume = volume;
    }

    public Hold() {
    }

    /**
     *
     * @return name of Hold
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the name of Hold
     * @param name
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
