 /************************************************************************************
 * Program Name:          Prelab07A
 *
 * Program Description:   This program creates Java classes called Array01Test, 
 *                        Array02Test, and Array03Test; it uses arrays to perform the 
 *                        operations from the Visual Logic prompt. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/07/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package prelab07a;
import java.util.Scanner;
public class Prelab07A {
   
   public static void main(String[] args) {
       
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the amount of numbers in the array: ");
   
   int arrayLength = input.nextInt();
   
   double[] numbers = new double[arrayLength];
   
         for (int i = 0; i < arrayLength; i++) {
             
             System.out.print("Enter a number: ");
                     
             int number = input.nextInt(); 
             
             numbers[i] = number;
             
         }
         
         double sum = 0; 
         
   System.out.println("The numbers entered are: " + "\n");
   
           for (int i = 0; i < arrayLength; i++) {
   
   System.out.println(numbers[i] + " and " + numbers[i] + " squared is " + Math.pow(numbers[i], 2));
   
   sum = sum + numbers[i]; 
   
   }
   
   System.out.println("Average = " + sum / arrayLength );
   
   System.out.println("\nThe numbers entered in reverse order are: ");
   
        
        int start = 0;
        
        int end = arrayLength - 1; 
        
        double temp ; 
        
        while (start < end) {
            
            temp = numbers[start];
            
            numbers[start] = numbers[end];
            
            numbers[end] = temp; 
            
            start++;
            
            end--;
        }
        
        
        
        for (int j = 0; j < numbers.length; j++) {
            
            System.out.println(numbers[j]);
            
        }
   
    
    System.out.println("Next to last number entered was " + numbers[numbers.length-2]);
    
    
  
    
   
  
//Create class for Array02 Test: **************************
     
//Prompt user for array02 length: 
   
   System.out.print("\nEnter the amount of numbers in the array: ");
   
   int arrayTwoLength = input.nextInt();
   
   
   //Create array02 (numbersTwo) and declare length: 
   
   double[] numbersTwo = new double[arrayTwoLength];
   
   
   //Prompt user for input of values to be stored in array02:
         
        for (int i = 0; i < arrayTwoLength; i++) {
             
            System.out.print("Enter a number, or 999 to exit: ");
                     
            int number = input.nextInt(); 
            
               if (999 == number) {
             
                   break; 
                }
             
              numbersTwo[i] = number;
                 
          }
         
    
    //Display the numbers from user input and their square rooted values: 
         
    System.out.println("The numbers entered are: " + "\n");
    
      for (int i = 0; i < arrayTwoLength; i++) {
   
        System.out.println((int)numbersTwo[i] + " and its square root is " + Math.sqrt(numbersTwo[i]));
   
      }
   
     
    //Find and display median value from array:
    
    double median = 0; 
     
    int middle = 0; 
     
      for (int i = 0; i < arrayTwoLength; i++) {
   
      middle = arrayTwoLength / 2; 
              
      median = numbersTwo[middle]; 
   
      }
         
    System.out.println("The median is: " + median);   
         
         
    
   
  

    
    
    
//Create class for Array03 Test: **************************
   
    //Prompt user for input of amount of students: 
    
    System.out.print("\n\nEnter the amount of students: ");
    
    int studentCount = input.nextInt();
    
    int arrayThreeLength = studentCount;
    
    
    //Create two new arrays:
    
    String[] students = new String[arrayThreeLength];
    
    int[] studentGrades = new int[arrayThreeLength];
    
    
    //Prompt user for input of last name and grade: 
    
    System.out.println("Enter a last name and a grade: ");
    
       for (int i = 0; i < arrayThreeLength; i++) {
    
           String lastName = input.next();
           
           students[i] = lastName;
           
           int grade = input.nextInt();
           
           studentGrades[i] = grade; 

       }
    
       
    //Dispaly students and grades to user: 
    
    System.out.println("The students and grades entered are: ");
    
      for (int i = 0; i < arrayThreeLength; i++) {
   
        System.out.println(students[i] + "\t" + studentGrades[i]);
   
      }
      
    
    //Find average grade and print/display to user: 
    
     
       for (int i = 0; i < arrayThreeLength; i++) {
   
        sum = sum + studentGrades[i];
   
      }
       
    System.out.print("\nAverage: " + "\t" + sum / arrayThreeLength);
    
    
    //Find highest grade and print/display to user:
    
    String highestLastName = " ";
    
    int highestGrade = 0; 
    
       for (int i = 0; i < arrayThreeLength; i++) {
           
           if (studentGrades[i] > highestGrade)  {
               
               highestGrade = studentGrades[i];
        
               highestLastName = students[i];
           }
      }
       
    System.out.print("\nHighest: " + highestLastName + "\t" + highestGrade);
    
       
    
    //Find lowest grade and print/display to user:
    
    String lowestLastName = students[0]; 
    
    int lowestGrade = studentGrades[0];
    
       for (int i = 0; i < arrayThreeLength; i++) {
           
            if (studentGrades[i] < lowestGrade) {
                
                lowestGrade = studentGrades[i];
            
                lowestLastName = students[i];
            }
   
      }

    System.out.print("\nLowest: " + lowestLastName + "\t" + lowestGrade);   
   
   }
 }
