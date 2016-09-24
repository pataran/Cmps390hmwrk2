
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main extends SparseMatrix{

	
	public static void main(String[] args) throws FileNotFoundException, IOException {	
		
		//Create first variable of SparseMatrix
		SparseMatrix createMatrix = new SparseMatrix();
		 createMatrix.add(15);
		 
		//This file scanning method was found on stack exchange
		 try {
	            Scanner input;
	            File file = new File("src/MatrixA.data");
	            input = new Scanner(file);
	            
	            while (input.hasNextLine()) {
	            	//Reads line by line, splits each one into a string array of strings
	                String line = input.nextLine();
	                System.out.println(line);
	                //String[] convert_line= line.split(",");
	                //SparseMatrix matrix = SparseMatrix.create(line);
	            }
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	   }
}
