/**********************************************************************************************
 * Program Name:          Lab04 - Paystub Calculations
 * 
 * Program Description:   This program calculates net paycheck information 
 *                      
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          02/24/20
 * 
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    -------------------
************************************************************************************************/
package lab04;
import java.util.Scanner; 
public class Lab04 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    
   //Declare all constants + variables:

   final double SOC_SEC_RATE = 0.06, MEDICARE_RATE = 0.01, UNION_DUES_RATE = 0.01, RETIREMENT_PLAN_RATE = 0.02, RETIREMENT_HEALTH_RATE = 0.03;
   
   double hoursWorked, payRate, fedTaxWithholdingRate, stateTaxWithholdingRate, grossPay, totalDeductions, netPay;
   
   double fedTaxWithheld, stateTaxWithheld, socsecTaxWithheld, medicareTaxWithheld, unionDuesWithheld, retirementPlanWithheld, retirementHealthWithheld; 
   
   
   //Prompt user for input of hours worked, hourly pay rate, federal tax, and state tax; 
   
   System.out.print("Please enter number of hours worked in a pay period: ");
   
   hoursWorked = input.nextDouble();
   
   System.out.print("Please enter hourly pay rate: ");
   
   payRate = input.nextDouble();
   
   System.out.print("Please enter federal tax witholding rate (e.g. 0.15): ");
   
   fedTaxWithholdingRate = input.nextDouble();
   
   System.out.print("Please enter state withholding rate (e.g. 0.045): ");
   
   stateTaxWithholdingRate = input.nextDouble();
   
   
   //Display paystub information header: 
   
   System.out.println("\n" + "****************************");
 
   System.out.println("* Paystub Information: \t   *");
   
   System.out.println("****************************");
   
   
   
   //Display hours worked, pay rate, gross pay:
   
   System.out.printf("\nHours Worked: " + "\t" + "%4.2f", hoursWorked);
   
   System.out.printf("\nPay Rate: " + "\t" + "$%4.2f",  payRate);
   
       if (hoursWorked <= 40) {
          grossPay = hoursWorked * payRate;
       } else {
          grossPay = ((40*payRate) + (hoursWorked - 40) * payRate * 1.5);   
       }

   System.out.printf("\nGross Pay: " + "\t" + "$%4.2f", grossPay);
   
   
   //Calculate Deductions:
   
   fedTaxWithheld = fedTaxWithholdingRate * grossPay;
   
   stateTaxWithheld = stateTaxWithholdingRate * grossPay; 
           
   socsecTaxWithheld = SOC_SEC_RATE * grossPay; 
   
   medicareTaxWithheld = MEDICARE_RATE * grossPay; 
   
   unionDuesWithheld = UNION_DUES_RATE * grossPay;
   
   retirementPlanWithheld = RETIREMENT_PLAN_RATE * grossPay;  
           
   retirementHealthWithheld = RETIREMENT_HEALTH_RATE * grossPay;
   
   
   //Display list of deductions: 
   
   System.out.println("\nDeductions: ");
   
   System.out.printf("  Federal Tax (15.0%%): " + "\t\t" + "$%4.2f", fedTaxWithheld); 
   
   System.out.printf("\n  State Tax (10.0%%): " + "\t\t" + "$%4.2f", stateTaxWithheld); 
  
   System.out.printf("\n  Social Security Tax (6.0%%): " + "\t" + "$%.2f", socsecTaxWithheld);
   
   System.out.printf("\n  Medicare Tax (1.0%%): " + "\t\t" + "$%.2f", medicareTaxWithheld);
   
   System.out.printf("\n  Union Dues (1.0%%): " + "\t\t" + "$%.2f", unionDuesWithheld);
   
   System.out.printf("\n  Retirement Plan (2.0%%): " + "\t" + "$%.2f", retirementPlanWithheld);
   
   System.out.printf("\n  Retirement Health (3.0%%): " + "\t" + "$%.2f", retirementHealthWithheld);
   
   
   //Calculate total deductions and display on paystub: 
   
   totalDeductions = fedTaxWithheld + stateTaxWithheld + socsecTaxWithheld + medicareTaxWithheld + unionDuesWithheld + retirementPlanWithheld + retirementHealthWithheld;
 
   System.out.printf("\nTotal Deductions: " + "\t\t" + "$%4.2f", totalDeductions);
           
   
   //Calculate and display net pay: 
   
   netPay = grossPay - totalDeductions; 
           
   System.out.printf("\n\nNet Pay: " + "\t\t\t" + "$%4.2f", netPay);
   
   
   
    }
    
}
