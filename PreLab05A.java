/*/******************************************************************************
 * Program Name:          PreLab05A
 *
 * Program Description:   This program is for testing integer patterns 
 *
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          03/09/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ********************************************************************************/

package prelab05a;
import java.util.Scanner;
public class PreLab05A {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in); 
    
    
    ///Declare variables:
    
    int maxCount, totalIntegersWritten, totalSum, rowCtr, colCtr; 
    
    //Store data in variables/intialize variables :
    
    rowCtr = 0;
    
    colCtr = 0; 
    
    totalIntegersWritten = 0;
    
    totalSum = 0; 
    
    
   
    //Prompt user for input of integer between 1 - 9 (inclusive):
    
    System.out.println("Enter an integer between 1 and 9, inclusive:");
    
    maxCount = input.nextInt();
    
    
    
    //If integer (maxCount) entered by user not between 1-9, repeat question for input of integer: 
       
        while (maxCount < 1 || maxCount > 9){
                  
            System.out.println("Incorrect. Enter an integer between 1 and 9, inclusive:");
              
                maxCount = input.nextInt();
              
            rowCtr++; 
            
            
        }
                       
         
        
    //Display numerical pattern based on rowCtr and colCtr:
    
       for (colCtr = 1; colCtr <= maxCount; colCtr++) {
           System.out.print("\n" + colCtr);
           totalIntegersWritten++;
           
           totalSum = totalSum + colCtr;
           
          for (rowCtr = 2; rowCtr <= colCtr; rowCtr++) {
              System.out.print(colCtr);
              totalIntegersWritten++; 
              
          totalSum = totalSum + colCtr; 
                      
          }
       }
 
     
       
    //Display outcomes: 
            
    System.out.println("\nThe total number of integers written: " + totalIntegersWritten);
    
    System.out.println("The total sum of all integers:" + totalSum);
       
       
    }
    
}
