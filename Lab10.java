/************************************************************************************
 * Program Name:          Lab10
 *
 * Program Description:   This program reads an input file and then writes/displays
 *                        the name of the input file, the number of its characters, 
 *                        the number of its lines, and if string "Java" appears in
 *                        the output file.
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          05/01/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package lab10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Lab10 {

    public static void main(String[] args) throws IOException {
        
    //Declare variables:
    
    String userInput = " "; 
    
    int count, lines;
      
    //Create input file instance:
    
    File Lab10IP = new File(args[0]);
    
     //check if length of the arguments are not 2
    
       if (args.length < 2) {
           System.out.println("Invalid arguments.");
           System.exit(0);
       }

    //Check to see if file exists:
    
       if  (Lab10IP.exists()) {
           System.out.println("Error: file does not exist.");
           System.exit(0);
       }
    
    //Create Output file instance:
    
    File Lab10OP = new File(args[1]);
    
    //Read data from a file:
        
    try ( // Create a Scanner for the file:
                
    Scanner input = new Scanner(Lab10OP)) {
            
    //Read data from a file:
    
    userInput = input.nextLine(); 
            
        while (input.hasNextLine()) {
                
         userInput = input.nextLine();
                
        }       
          
    //Find number of characters in string: 
            
    count = 0;
            
        for(int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) != ' ')
            count++;
            }   

    //Find number of lines in string:
            
    lines = userInput.length();
            
        }
    
        
    // Write formatted output to the file:
    
    System.out.print("File Lab10IP.txt has");
    System.out.print("\n" + count + " characters");
    System.out.print("\n" + lines + " lines");
    
    //Check to see if "Java" appears in input file:
    
    userInput = userInput.toUpperCase(); 
    
      if (userInput.contains("JAVA")) {
        
        System.out.println("\nJava appears in the input file.");
        
       }
 
       
      }
    }

