package KI_35_Kachur.lab7;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 */
public class ConnectingRod implements Instrument{
    double price;
    double size;
    String firm;
    /**
     * Constructor
     * @param price price
     * @param size size
     * @param firm firm
     */
    public ConnectingRod(double price, double size, String firm) {
        this.price = price;
        this.size = size;
        this.firm = firm;
    }
    /**
     * Setter price
     * @param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Getter Size
     * @return double
     */
    public double getSize() {
        return size;
    }
    /**
     * Setter size
     * @param size size
     */
    public void setSize(double size) {
        this.size = size;
    }
    /**
     * Getter Firm
     * @return String
     */
    public String getFirm() {
        return firm;
    }
    /**
     * Setter firm
     * @param firm firm
     */
    public void setFirm(String firm) {
        this.firm = firm;
    }
    /**
     * Getter price
     * @return double
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return details about object as a string
     */
    @Override
    public void output() {
        System.out.println( "ConnectingRod{" + "price=" + price + ", size=" + size + ", firm='" + firm + '\'' + '}');

    }
    /**
     *  @return details about object as a string
     */
    @Override
    public int compareTo(Instrument o) {
        Double pr = price;
        return pr.compareTo(o.getPrice());
    }
}
