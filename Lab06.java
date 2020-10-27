 /*******************************************************************************
 * Program Name:          Lab06
 *
 * Program Description:   This program creates a commission table that displays
 *                        the sales amount and the commission amount.  
 *
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          03/27/2020 
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 ********************************************************************************/ 
package lab06;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab06 {
    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    
    
    //Delcare Variables:
    
    int tableStart, tableEnd, increment, salesAmount;
    
    double commissionAmount;
    
    DecimalFormat df = new DecimalFormat("$###,###,##0.00");
    
    
    //Prompt user for input: 
    
    System.out.println("Enter table start, enter table end, and increment: "); 
    
    tableStart = input.nextInt();
    
    tableEnd = input.nextInt(); 
    
    increment = input.nextInt(); 
    
    salesAmount = tableStart; 
    
    commissionAmount = computeCommission(salesAmount);
    
    
 
    //Display table according to user input:  
    
    System.out.println("\nSales Amount " + "\t\tCommission");
               
        while (salesAmount <= tableEnd) { 
                    
           System.out.println(df.format(salesAmount) + "\t\t"+ df.format(commissionAmount));   
           
           salesAmount = salesAmount + increment;
           
           commissionAmount = computeCommission(salesAmount);
           
        }   
        
}
        
      //Create method for computing commission: 
    
      public static double computeCommission(double salesAmount) {
        
        double commission = 0;  
        
        if (salesAmount <= 10000) 
            
            commission = salesAmount * 0.075;
        
        else 
            
            if (salesAmount > 10000.00 && salesAmount <= 20000)
          
               commission = 10000 * 0.075 + (salesAmount - 10000) * 0.1125; 
                              
        else
            
             if (salesAmount > 20000.00)
                 
               commission = 10000 * 0.075 + 10000 * 0.1125 + (salesAmount - 20000) * 0.145; 
                         
               return commission;       
    
      }

}