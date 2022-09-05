import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab2{
	
	public static void printFigure(int n) throws Exception {
		int [][] array = new int[n][];
        File file = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(file);


        for (int i=0; i<n; i++)
        {
        	// allocate memory for the gear array
        	// values changing acc. to requirement
        	array[i] = new int[i+1];
        	// inner loop to handle number spaces
            // values changing acc. to requirement
        	for(int j=0; j<n-i;j++) {
            	System.out.print(" ");
            	fout.print(" ");
            }
        	// inner loop to print elements of array
            // values changing acc. to requirement
        	for(int j=0; i>j;j++) {
        		System.out.print(array[i][j]);
        		fout.print(array[i][j]);
            }
        	System.out.println();
        	fout.println("");
        }
        
        fout.flush();
        fout.close();
    }
    /*
     * @throws Exception
     * @return void
     * */
    // Driver Function

	
	public static void main (String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length-width of a square: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        printFigure(n);
	}
}