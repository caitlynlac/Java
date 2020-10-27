/*/******************************************************************************
 * Program Name:          PreLab05
 *
 * Program Description:   This program is for testing/checking multiplication skills. 
 *
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          03/02/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 *******************************************************************************/ 
package prelab05;
import java.util.Scanner; 
public class Prelab05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Declare variables:
    
    int numbOfquestions, correctCount, errorCount, questionCount, numb1, numb2, answer;
    
    double score; 
    
    
    //Prompt user for numerical input of questions:
    
    System.out.println("Enter the number of questions in the quiz:");
    
    numbOfquestions = input.nextInt(); 
    
    correctCount = 0;
    
    errorCount = 0;
    
    questionCount = 0; 
    
    
    //Start loop and generate two random integers: 
    
       while (questionCount < numbOfquestions) {
        
          numb1 = (int) (Math.random() * 10); 
        
          numb2 = (int) (Math.random() * 10); 
        
          System.out.print("Question " + (questionCount + 1) +": What is " + numb1 + " * " + numb2 + "?" + " " );
        
          answer = input.nextInt(); 
        
          questionCount++; 
        
             if (numb1 * numb2 == answer) {
               System.out.println("Correct.");
               correctCount = correctCount + 1; 
             }
                else {
               System.out.println("Incorrect. " + numb1 + " * " + numb2 + " is " + numb1 * numb2);                 
               errorCount = errorCount + 1; 
             }
        }
        
       
    //Calculate score:
    
    double correctCountTwo;
    
    correctCountTwo = (double) correctCount; 
    
    score = (correctCountTwo / numbOfquestions) * 100;
    
       
    //Notify of score:
    
    System.out.print("\n\nYou got " + errorCount + " wrong." + " Your score is ");
    
    System.out.printf("%2.1f", score);
    
       if (errorCount == 0) {
         System.out.print(". Congratulations!");
       }
    
    
    }
    
}
