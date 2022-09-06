package KI_35_Kachur.lab7;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 */
public class SpareWheel implements Instrument{

    double price;
    double radius;
    String firm;

    /**
     * Constructor
     * @param price price
     * @param radius radius
     * @param firm firm
     */
    public SpareWheel(double price, double radius, String firm) {
        this.price = price;
        this.radius = radius;
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
     * Getter radius
     * @return double
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Setter radius
     * @param radius radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
    public String toString() {
        return "SpareWheel{" + "price=" + price + ", radius=" + radius + ", firm='" + firm + '\'' + '}';
    }

    /**
     *  @return details about object as a string
     */
    @Override
    public void output() {
        System.out.println( "ConnectingRod{" + "price=" + price + ", radius=" + radius + ", firm='" + firm + '\'' + '}');
    }

    /**
     * Compare method
     * @param o the object to be compared.
     * @return comparing value
     */
    @Override
    public int compareTo(Instrument o) {
         Double pr = price;
        return pr.compareTo(o.getPrice());
    }
}
