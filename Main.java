
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main extends SparseMatrix{	
	public static void main(String[] args) throws FileNotFoundException, IOException {	

		int lineCounter = 1;
		int row = 10;
		int column = 10;
		
		//temp to test row and colum creation
		 SparseMatrix createMatrix = new SparseMatrix(row,column);
		 
		//This file scanning method was found on stack exchange
		 
		 try {
	            Scanner input;
	            File file = new File("src/MatrixA.data");
	            input = new Scanner(file);
	            
	            while (input.hasNextLine()) {
	            	
	            	if(lineCounter == 1){
	            	//Reads line by line, splits each one into a string array of strings
	            	//This grabs the 1st line
	            		String rowstr = input.nextLine();
	            		row = Integer.parseInt(rowstr);
	            	}else if(lineCounter == 2){
	            		String columnstr = input.nextLine();
	            		column = Integer.parseInt(columnstr);
	            	}
	            	lineCounter++;
	                //String[] convert_line= line.split(",");
	            }
	            input.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
		
	   }
}
