package KI_35_Kachur.lab5;

/**
 * @author Kachur Vladyslav
 * @version 1.0
 */
public class Calculator {
    /**
     * method to calculate with condition x cant be equal to 7
     * @param x number to calculate
     * @return
     */
    public double calculate (double x){
        if (x==7){
            throw new CustomException("number cannot be 7");
        }
        return Math.cos(2*x)/(1/Math.tan(3*x-1));
    }
}
