package KI_35_Kachur.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author  Kachur Vladyslav
 * @version 1.0
 */
public class main {
    /**
     * Calculator call and use
     * @param args string arguments
     * @throws FileNotFoundException when there is no file to write info
     */
    public static void main(String[] args) throws FileNotFoundException {
        Calculator calc = new Calculator();
        File dataFile = new File("log_lab5.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        double res = calc.calculate(5);
        System.out.println(res);
        fout.println(res);
        fout.flush();
        fout.close();
    }
}
