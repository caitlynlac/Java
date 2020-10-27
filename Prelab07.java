 /************************************************************************************
 * Program Name:          Prelab07
 *
 * Program Description:   This program reads score input from user and then determines
 *                        how many scores are above or equal to the average and how many 
 *                        are below it. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/01/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/ 
package prelab07;
import java.util.Scanner;
public class Prelab07 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);  
    
    //Initialize array and declare variables:
        
   double[] scores;
        scores = new double[100];
   
   double average = 0; 
   
   int i = 0;
   
   int scoresAbove = 0;  
   
   int scoresBelow = 0; 
    
   double sum = 0; 
    
    
    //Prompt user to input score or negative value:
    
    System.out.print("Enter a new score or negative number to exit: ");
    
    double scoreIn = input.nextDouble();
    
    
    //Start loop:
 
      while (scoreIn >= 0) {
          
        System.out.print("Enter a new score or negative number to exit: ");
             
        sum = sum + scoreIn;
           
        scoreIn = input.nextDouble();
        
        scores[i] = scoreIn; 
        
        i = i + 1;    
             
        average = sum / i; 
        
        
        if (scoreIn > average || scoreIn == average) {
            
            scoresAbove = scoresAbove + 1;
            
        }    
                    
            if (scoreIn < average) {
            
                scoresBelow = scoresBelow + 1;
            
             }
                  
                    if (scoreIn < 0) {
                          
                        break;
                        
                      }    
        
    }
    
       
    //Print/display values to user: 
    
    System.out.println("\n\nTotal Scores Entered: " + i);
    
    System.out.println("Average score: " + average);
    
    System.out.println("Number of scores above or equal to the average: " + scoresAbove);
    
    System.out.println("Number of scores below the average: " + scoresBelow);
     
        
    }
    
}
