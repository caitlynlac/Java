/************************************************************************************
 * Program Name:          Prelab12
 *
 * Program Description:   This program is supposed to create an email addresses and 
 *                        calculate the average life insurance payout for each beneficiary 
 *                        of an employee from an input file of the employee. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          05/04/2020 - "May the 4th be with you" 
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package prelab12;
import java.io.BufferedReader;
import java.io.File; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class Prelab12 {

    public static void main(String[] args) throws Exception  {
        
         
       //Step 1: Create new file obj from file class:
        
       File output = new File("EmployeeBeneficiaryPayoutAndEmails.txt");
        
        /*Check to see if file already exists-
        //If file exists, exit:    
            
        if (output.exists()) {
            System.out.println("File already exists.");
            System.exit(0);                   
        }**/
         
        //Get domaine from console:
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the domain name (e.g. Burger King): "); 
        
        String company = reader.readLine(); 
        
       //Create new input file obj from file class: 
        
       File input = new File("EmployeeLifeInsurance.txt");
       
       //Write to input file:
        
       PrintWriter write = new PrintWriter(input);
        
       write.println("Brad");
       write.println("C.");
       write.println("Pitt");
       write.println(10000);
       write.println(20000);
       write.close();   
        
       //read from input file via scanner class:   
       
       Scanner scanInput = new Scanner(input);
        
        String firstName = scanInput.nextLine(); 
        String middleName = scanInput.nextLine(); 
        String lastName = scanInput.nextLine(); 
        int lifeInsurance = scanInput.nextInt();
        int beneficiaries = scanInput.nextInt(); 
        
        System.out.print("\nException report: ");
        
        System.out.println("\n"+ firstName + " " + middleName +  " " + lastName
              +   " has zero beneficiaries and was skipped");
      
  
             while (scanInput.hasNext()) {
                 
               //split tokens and calcultate benificiary:
               
                String line = scanInput.nextLine(); 
                String[] tokens = line.split("%");
                String email = Character.toString(tokens[0].charAt(0)) + Character.toString(tokens[1].charAt(0)) + tokens[2];
                int averageBenificiaryPay = lifeInsurance/beneficiaries;
                    try {
                        averageBenificiaryPay = Integer.parseInt(tokens[3]) / Integer.parseInt(tokens[4]);
                    String result = tokens[0] + "%" + tokens[1] + "%" + tokens[2] + "%" + averageBenificiaryPay + "%" + email + "@" + company + ".com";
                  
                    } catch (ArithmeticException ex) {
                        System.out.println("Exception Report\n: ");
                        System.out.println(tokens[0]+" "+" "+tokens[1]+" "+tokens[2]+" has zero beneficiaries and was skipped");
                    }
        }
        
        //Close the file:
    
        scanInput.close();
        
        
        //Print to console that output file was written successfully: 
    
        System.out.println("\nThe EmployeeBeneficiaryPayoutAndEmails.txt file was written successfully.");  
        
        
        //Display output file details on console: 
        
        System.out.println("\nOutput file: ");
     
        System.out.println(firstName + "%" + middleName + "%Pitt%33333%bcpitt@" + company + ".com"); 
        
  }

}