import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab2{
	
	public static void printFigure(int n, String str) throws Exception {
		int [][] array = new int[n][n];
        File file = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(file);

        if(str.length() != 1){
            throw new Exception("Wrong input");
        }
        // outer loop to handle number of rows
        //  n in this case
        for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				array[i][j]=0;
			}
		}
        
        //loops to handle of columns
        for(int i=1; i<n;i++) {
			for(int j=n-1; j>=0;j--) {
				if(i>=j) {
					array[i][j]=1;
				}
				// printing stars
				fout.print(array[i][j]);
				System.out.print(array[i][j]);
			}
			// ending line after each row
			fout.println("");
			System.out.println("");
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
        System.out.print("\nEnter symbol-filler of the square matrix: ");
        String str = scanner.nextLine();

        printFigure(n, str);
	}
}