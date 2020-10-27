 /*******************************************************************************
 * Program Name:          Prelab06
 *
 * Program Description:   This program is for testing methods of chapter 6; it will
 *                        prompt the user for input of two integers and use these 
 *                        integers to perform mathematical operations and return results.  
 *
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          03/23/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 *******************************************************************************/ 
package prelab06;
import java.util.Scanner; 
public class Prelab06 {
    public static void main(String[] args) {
     
         
    Scanner input = new Scanner(System.in);
    
    
    
    //Prompt user for input of two numbers:
    
    System.out.print("Enter two numbers: ");
    
    double num1 = input.nextDouble();
    
    double num2 = input.nextDouble(); 
    
    double minNum = min(num1, num2); 
    
    double maxNum = max(num1, num2);
    
    double sumNum = sum(num1, num2);
            
    int diffNum = (int) diff(num1, num2);
            
    double prodNum = product(num1, num2);
    
       
    
   //Display minimum:
   
   System.out.println("The minimum of " + num1 + " and " + num2 + " is " + minNum);
   
   System.out.println("The maximum of " + num1 + " and " + num2 + " is " + maxNum);
   
   System.out.println("The sum of " + num1 + " and " + num2 + " is " + sumNum);
   
   System.out.println("The difference between " + num1 + " and " + num2 + ", rounded to the nearest whole integer, is " + diffNum);
   
   System.out.println("The product of " + num1 + " and " + num2 + " is " + prodNum);
         
   }
    
    
    //Establish Min Method: 
    
    public static double min(double num1, double num2) {
        
        double result1;  
        
        if (num1 > num2) 
            
            result1 = num2;
        
        else
            
            result1 = num1; 
               
        return result1;       
        
    }
    
    //Establiish Max Method:
    
    public static double max(double num1, double num2) {
        
        double result2;  
        
        if (num1 > num2) 
            
            result2 = num1;
        
        else
            
            result2 = num2; 
               
        return result2;       
        
    }
    
    
    //Establish Sum Method: 
    
    public static double sum(double num1, double num2) {
        
        double result3;  
        
        result3 = num1 + num2; 
               
        return result3;       
        
    }
    
    //Establish Difference Method:
    
    public static double diff(double num1, double num2) {
        
        double result4;  
        
          if (num1 > num2) 
            
            result4 = num1 - num2; 
        
        else
                    
            result4 = num2 - num1;
     
        return result4;       
        
    }
    
    //Establish Product Method:
    
    public static double product(double num1, double num2) {
        
        double result5;  
            
        result5 = num1 * num2; 
               
        return result5;       
        
    }   
    
}
