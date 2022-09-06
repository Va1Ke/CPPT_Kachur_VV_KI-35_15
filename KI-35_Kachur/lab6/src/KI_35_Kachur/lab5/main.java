package KI_35_Kachur.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author  Kachur Vladyslav
 * @version 1.0
 */
public class main {
    /**
     * Calculator call and use
     * @param args string arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        File dataFile = new File("log_lab6.txt");
        File dataFileBin = new File("log_lab6_bin.bin");
        OutputStream a = new FileOutputStream(dataFileBin);
        ObjectOutputStream out = new ObjectOutputStream(a);
        PrintWriter fout = new PrintWriter(dataFile);
        double res = calc.calculate(5);
        System.out.println(res);
        out.writeObject(res);
        fout.println(res);
        fout.flush();
        fout.close();
    }
}
