/*/******************************************************************************
 * Program Name:          PreLab03 
 * Program Description:   This program is for aiding a child with math homework 
 *                        
 * Program Author:        Caitlyn Lacovara
 * Date Created:          2/10/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ******************************************************************************/
package lab03;

import java.util.Scanner;

public class Lab03 {
   
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);  
    
    int numb1, numb2;
    
    //Prompt user to input an integer 
    
    System.out.print("Please enter an integer between 0-99:");                 
    numb1 = input.nextInt();
     
    //Check to see if integer 1 is in range 
    
      if (numb1 < 0 || numb1 > 99) {                                                
        System.out.print("Outside range. Please enter an integer between 0-99:");                                                      
        numb1 = input.nextInt();
        if (numb1 < 0 || numb1 > 99) {
        System.out.print("Outside range, program ending.");
        return;         
         } 
       }    
      
    // If the first integer is in range, proceed to prompting for inger 2
    
    System.out.print("Next, please enter another integer between 0-99:"); 
    numb2 = input.nextInt();
   
    //Check to see if integer 2 is in range
    
      if (numb2 < 0 || numb2 > 99) {                                                
        System.out.print("Outside range. Please enter an integer between 0-99:");                                                    
        numb2 = input.nextInt();
        if (numb2 < 0 || numb2 > 99) {
        System.out.print("Outside range, program ending.");
        return;  
         }
       }
    
    //If two numbers entered by user are in 0-99 range, proceed to establish max and min range 
    
     int max = (numb1 > numb2) ? numb1 : numb2;     
        
     int min = (numb2 < numb1) ? numb2 : numb1; 
     
    System.out.println("max: " + max + "min: " + min);   
    
    System.out.println("The range begins at "+ min + " and ends at " + max); 
    
    //Generate + declare three random ingeters between numb1 and numb2 
    
    int Int1 = (min + (int)(Math.random() * ((max - min)) + 1));  
        
    int Int2 = (min + (int)(Math.random() * ((max - min)) + 1));
        
    int Int3 = (min + (int)(Math.random() * ((max - min)) + 1));
    
    
        
    //Sort the three random integers + print them sorted 
    
    System.out.println("Three sorted random integers between " + min + " and " + max + " are:");
   
    int hold = Int1;
    int hold2 = Int2; 
    int hold3 = Int3; 
       
    //Compare variables and swap if necessary 
       
    Int1 = (Int1 > Int2) ? Int2 : Int1; 
    
    Int2 = (Int2 < Int3) ? Int3 : Int2;  
    
    Int3 = (Int3 > hold) ? Int3 : hold; 
    
    //Print even or odd next to the printed variables; dependent upon if variable even or odd. 
    
      if (Int1 % 2 == 0) {
        System.out.print(Int1 + " even");
      } else {
        Int1 = (Int1 < Int2) ? Int1 : Int2;
        System.out.print(Int1 + " odd");
      }
    
    
      if (Int2 % 2 == 0) {
       System.out.print("\n" + Int2 + " even");
      }else {
       System.out.print("\n" + Int2 + " odd");
      }
      
     
      if (Int3 % 2 == 0) {
        System.out.println("\n" + Int3 + " even");
      } else {
        System.out.println("\n" + Int3 + " odd");
      }
      
    // Declare + generate sum, product, and double from the three random integers to be used at the end of program
    
    int sum = Int1 + Int2 + Int3;
        
    int product = Int1 * Int2 * Int3;
        
    double quotient = (double)Int1 / (double)Int2 / (double)Int3; 
     
    //Display sum, product, and quotient of the integers 
      
    System.out.println("\n" + "Sum = " + sum); 
        
    System.out.println("Product = " + product);
        
    System.out.println("Quotient (Int1 / Int2 / Int3) = " + quotient);
      
        
       }
    
    }                                                       

