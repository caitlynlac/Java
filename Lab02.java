/**********************************************************************************************
 * Program Name:          Lab 02: Barber Shop Menu + Bill 
 * 
 * Program Description:   This program displays the Barber Shop menu and
 *                        calculates the customer's total bill. 
 *                        
 * Program Author:        Caitlyn Lacovara  
 * 
 * Date Created:          02/05/20
 * 
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    -------------------
************************************************************************************************/
package lab02;
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
   
    //Display menu 
    System.out.println("*****Barber Shop Menu***** ");
    System.out.println("* Haircut:        $15.25 * ");
    System.out.println("* Shave  :        $12.50 * ");
    System.out.println("* Beard Trim:     $10.75 *");
    System.out.println("**************************");
    
    //prompt user for input of bill/purchases
    Scanner input = new Scanner(System.in);
    System.out.print("Customer's haircut price: \t");
    double haircutPrice = input.nextDouble();
    System.out.print("Customer's shave price:\t\t    ");
    double shavePrice = input.nextDouble();
    System.out.print("Customer's beard trim price: \t");
    double beardTrimPrice = input.nextDouble();
    
    //Display prices from input
    System.out.print("\nHaircut price: \t\t$" + haircutPrice);
    System.out.print("\nShave price: \t\t$" + shavePrice);
    System.out.print("\nBeard trim price: \t$" + beardTrimPrice);
    System.out.print("\n--------------------------------");
    
    //Declare constants 
    final double LOW_TIP_RATE  = 0.10;
    final double MED_TIP_RATE  = 0.15;
    final double HIGH_TIP_RATE = 0.20;
    final double CT_TAX_RATE   = 0.0635; 
    //Declare variables for calculation of services
    double totalServices = haircutPrice + shavePrice + beardTrimPrice;
    double totalTax = totalServices * CT_TAX_RATE; 
    double totalBill = totalTax + totalServices;
    double cTtax = CT_TAX_RATE * totalServices;
 
   //Display Services on Bill 
    System.out.print("\nServices: \t$" + totalServices);
    System.out.print("\nCT tax: \t$" + (int)(cTtax * 100) / 100.0);
    System.out.println("\nTotal bill: \t$" + (int)(totalBill * 100) / 100.0);
    
    //Declare variables for tip recommendations and final amount due
    double lowTip = totalBill * LOW_TIP_RATE;
    double medTip = totalBill * MED_TIP_RATE;
    double highTip = totalBill * HIGH_TIP_RATE;
    double finalTotalLow = totalBill + lowTip;
    double finalTotalMed = totalBill + medTip;
    double finalTotalHigh = totalBill + highTip;
    
    //Display tip recommendations and total amount due 
    System.out.print("\nTip recommendations: ");
    System.out.print("\nLow tip (10%): \t  $" + (int)(lowTip * 100) / 100.0 + "\t Amount Due: $" + (int)(finalTotalLow * 100) / 100.0);
    System.out.print("\nMedium tip (15%): $" + (int)(medTip * 100) / 100.0 + "  Amount Due: $" + (int)(finalTotalMed *  100) / 100.0);
    System.out.println("\nHigh tip (20%):\t  $" + (int)(highTip * 100) / 100.0 + "\t Amount Due: $" + (int)(finalTotalHigh * 100) / 100.0);
    
    //Display thank you 
    System.out.println("\nThank you! Your barber's name is Cait. \u263A");
    }
    
}
