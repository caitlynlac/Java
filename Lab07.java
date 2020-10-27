 /************************************************************************************
 * Program Name:          Lab07
 *
 * Program Description:   This program reads score input from user and then displays
 *                        which score is high, which is low, average, the grades for 
 *                        the scores, and prints them in descending order. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/03/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 * *************************************************************************************/
package lab07;
import java.util.Scanner;
public class Lab07 {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    
    //Prompt user to input array length
    
    System.out.println("Enter the length of the array:");
        
    int arrayLength = input.nextInt();
    
    
    //Declare the array and store the input as the array length:
    
    int[] scoresArray;
          
    scoresArray = new int[arrayLength];
          
    
    //Prompt user to input 5 scores and store in array:
    
    System.out.println("Enter " + arrayLength + " scores:");
    
    for (int i = 0; i < arrayLength; i++) {
        
    int scores = input.nextInt();    
    
    scoresArray[i] = scores;
    
    }
    
    
    //Display printed scores to user:
    
    System.out.print("Printed Scores: ");
    printScores(scoresArray);
    
    
    //Display low score:
    
    System.out.println("\nLow: " + lowestScore(scoresArray));
      
    
    //Diplay high score:
       
    System.out.println("High: " + highestScore(scoresArray));
  
     
    //Display avg:
    
    System.out.println("Avg: " + averageScore(scoresArray));

    
    //Display Grades:
    
    char gradeType = ' ';
    
    System.out.println("A's: " + countGrades(scoresArray, gradeType));
    
    System.out.println("B's: " + countGrades(scoresArray, gradeType));
    
    System.out.println("C's: " + countGrades(scoresArray, gradeType));
    
    System.out.println("D's: " + countGrades(scoresArray, gradeType));
    
    System.out.println("F's: " + countGrades(scoresArray, gradeType));
    
    
    //Display scores in descending order:
    
    System.out.print("Scores in descending order: ");
    printDescendingScores(scoresArray);
    
 }
    
    //Create method for printing scores:
    
    public static void printScores (int[] scoresArray) {
    
       for (int i = 0; i < scoresArray.length; i++) {
          
         System.out.print(scoresArray[i] + " ");
        
         }
       
    }
    
    
    //Create method for descending scores:
    
     public static void printDescendingScores(int[] scoresArray) {
         
        for (int i = 0; i < scoresArray.length; i++) {
            
            int currentMin = scoresArray[i];
            
            int currentMinIndex = i; 
            
            for (int j = i + 1; j < scoresArray.length; j++) {
                
                if (currentMin < scoresArray[j]) {
             
                      currentMin = scoresArray[j];
                      
                      currentMinIndex = j;
                }         
            }
                    if (currentMinIndex != i) {      
                   
                        scoresArray[currentMinIndex] = scoresArray[i];
                        
                        scoresArray[i] = currentMin;
            
                    }  
                    
        System.out.print(scoresArray[i] + " ");
        
       }  
  }
      
     
    //Create method for finding lowest score:
    
    public static int lowestScore(int[] scoresArray) {
     
      int lowest =  scoresArray[0];  
        
        for (int i = 0; i < scoresArray.length; i++) {
            
            if (scoresArray[i] < lowest)
                
                lowest = scoresArray[i];
            
        }
        
                return lowest;       
    }
        
        
    //Create method for finding highest score:
    
    public static int highestScore(int[] scoresArray) {
       
      int highest = scoresArray[0];  
        
        for (int i = 0; i < scoresArray.length; i++) {
            
            if (scoresArray[i] > highest)
                
                highest = scoresArray[i];
            
        }
        
                return highest; 
        
    }
          
        
    //Create method for finding average score:
    
    public static double averageScore(int[] scoresArray) {
        
        int sum = 0; 
        
        for (int i = 0; i < scoresArray.length; i++) {
           
            sum = sum + scoresArray[i];
            
        }
           
            int average = sum / scoresArray.length;
            
            return average;
    }
        
        
    //Create method for counting grades:
    
    public static int countGrades(int[] scoresArray, char gradeType) {
        
    int max = 0;
    
    int min = 0; 
        
    int count = 0; 
    
    gradeType = ' '; 
        
       switch(gradeType) {
           case 'A': max = 100; min = 90; System.out.println("A's: "); break;
           case 'B': max = 89; min = 80; System.out.println("B's: "); break;
           case 'C': max = 79; min = 70; System.out.println("C's: "); break;
           case 'D': max = 69; min = 60; System.out.println("D's: "); break;
           case 'F': max =59; min = 0; System.out.println("F's: "); break;
        }
        
        for (int i = 0; i < scoresArray.length; i++) 
            
            if (scoresArray[i] <= max && scoresArray[i] >= min) 
                
                count = count + 1; 
                
                return count;
       }
}