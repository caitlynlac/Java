
 /*/******************************************************************************
 * Program Name:          Lab05
 *
 * Program Description:   This program is for playing the lottery and generating 
 *                        the outcomes + cost. 
 *
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          3/04/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 *********************************************************************************/
 
package lab05;
import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in); 
    
    
    //Declare variables: 
    
    double creditCardCharge, totalWinnings, totalLosses, balance, deductions; 
            
    int confirmCreditcardCharge, ticketCount, ticketsPurchased, randomInteger, guess; 
    
    int min, max, winCount, lossCount, winner, winningTicket;
    
    final double TICKET_PRICE = 2.0; 
    
    
    //Store data in variables:

    min = 1; 
    
    max = 10; 
    
    winCount = 0;
    
    lossCount = 0;
         
    ticketCount = 1; 
    
    winningTicket = 0;
    
    
    //Display Welcome message and prompt user for input of tickets:
    
    System.out.print("\nWelcome to the State of Connecticut Play10 Lottery Game. Ticket Price: $2.0");
    
    System.out.println("\nHow many tickets would you like to purchase?");
    
    ticketsPurchased = input.nextInt(); 
    
    
    //Calculate credit card charges based on # of tickets purchased:
    
    creditCardCharge = ticketsPurchased * TICKET_PRICE; 
   
    
    //Prompt user to confirm credit card charges:
    
    System.out.println("Please enter " + creditCardCharge + " to confirm your credit card charge:");
    
    confirmCreditcardCharge = input.nextInt(); 
    
    
    //Start loop to prompt user to enter credit card charge if incorrect entry: 
    
        while (confirmCreditcardCharge != creditCardCharge) {
          
            System.out.println("Incorrect amount. Please re-enter: ");
            
            confirmCreditcardCharge = input.nextInt(); 
            
                if (confirmCreditcardCharge == creditCardCharge) {
                   break; 
               }              
        }
        
        
    //Display message to user once credit card charge confirmation is entered correctly:   
    
    System.out.println("Thank you. Your credit card will be charged" + " $" + creditCardCharge);
    
    System.out.println("Would you ike the computer to generate your guesses? Enter 'Y' or 'N':");
    
    //Prompt user for input Yes/No and delcare as string:
    
    String Generatedata = input.next();
    
    //Pull character from the user input and declare as "Generate":
    
    char Generate = Generatedata.charAt(0);
    
    //Convert character to integer value and store as generateNumb integer: 
    
    int generateNumb = (int) Generate;
     

    
    //If user entered ye (y or Y), have system generate random numbers for user's tickets:
    
    if (generateNumb == 121 || generateNumb == 89) {
        
     do {
        
        winner = min + (int)(Math.random() * ((max - min) + 1)); 
        
         randomInteger = min + (int)(Math.random() * ((max - min) + 1));
                   
          System.out.println("Ticket " + ticketCount + "'s guess is: " + randomInteger);
          
            if (randomInteger == winner) {
               winCount = winCount + 1; 
               winningTicket = ticketCount;
             } else {
                lossCount = lossCount + 1;
            }
              
            ticketCount++;  
     
     } while (ticketCount <= ticketsPurchased); 

        
    //perform calculations:
        
    totalLosses = lossCount * 2.0; 
        
    totalWinnings = winCount * 20.0;
        
    balance = totalWinnings - creditCardCharge; 
    
        if (totalWinnings <= totalLosses){
            deductions =  totalWinnings;
         } else {
             deductions = totalLosses;
         }
       
                
    //Display 
    if (1 <= winCount) {
     
      System.out.println("\nThe winning number is " + winner);
             
      System.out.println("Ticket " + winningTicket + " is a winner");
             
      System.out.println("\nYour total winnings is: $" + totalWinnings);
    
      System.out.println("After your credit card deduction, your balance is: $" + balance);
    
      System.out.println("You can deduct the cost of your losses ($" + totalLosses + ") up to the amount of your winnings ($" + totalWinnings + ") from your taxes");

      System.out.println("Allowable deduction: $" + deductions);
             
      } else {
             
            System.out.println("\nThe winning number is " + winner);
            
            System.out.println("\nYour total winnings is: $" + totalWinnings);
    
            System.out.println("After your credit card deduction, your balance is: $" + balance);
    
             System.out.println("You can deduct the cost of your losses ($" + totalLosses + ") up to the amount of your winnings ($" + totalWinnings + ") from your taxes");

            System.out.println("Allowable deduction: $" + deductions);
             
         }
    }     
     
          
    
    
    //If user enters no (n or N), prompt user for ticket input:
    
    if (generateNumb == 110 || generateNumb == 78) {
        
        winner = min + (int)(Math.random() * ((max - min) + 1)); 
   
        while (ticketCount <= ticketsPurchased) { 
                   
          System.out.println("Please enter guess " + ticketCount + ":");
          
          guess = input.nextInt(); 
          
            if (guess < 1 || guess > 10) {
                System.out.println("Invalid guess. Please re-enter a guess between 1 and 10: ");                
                guess = input.nextInt(); 
            }  
                if (guess == winner) {
                  winCount = winCount + 1;
                  winningTicket = ticketCount;
                } else {
                  lossCount = lossCount + 1;
                }
                
            ticketCount++; 
        }
        
    //Perform Calculations: 
        
    totalLosses = lossCount * 2.0; 
        
    totalWinnings = winCount * 20.0;
        
    balance = totalWinnings - creditCardCharge; 
        
        if (totalWinnings <= totalLosses){
            deductions =  totalWinnings;
        } else {
            deductions = totalLosses;
        }
                    
    //Display wins and losses, etc: 
            
    if (1 <= winCount) {
             
        System.out.println("\nThe winning number is " + winner);
             
        System.out.println("Ticket " + winningTicket + " is a winner");
             
        System.out.println("\nYour total winnings is: $" + totalWinnings);
    
        System.out.println("After your credit card deduction, your balance is: $" + balance);
    
        System.out.println("You can deduct the cost of your losses ($" + totalLosses + ") up to the amount of your winnings ($" + totalWinnings + ") from your taxes)");
            
        System.out.println("Allowable deduction: $" + deductions);
             
         } else {
             
            System.out.println("\nThe winning number is " + winner);
             
            System.out.println("\nYour total winnings is: $" + totalWinnings);
    
            System.out.println("After your credit card deduction, your balance is: $" + balance);
    
            System.out.println("You can deduct the cost of your losses ($" + totalLosses + ") up to the amount of your winnings ($" + totalWinnings + ") from your taxes");

            System.out.println("Allowable deduction: $" + deductions);
          
          }  
        
    }
  }
}