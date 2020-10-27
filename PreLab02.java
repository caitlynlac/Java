/**********************************************************************************************
 * Program Name:          PreLab02 
 * 
 * Program Description:   This program calculates volume of two different 
 *                        sized cones and then reports the difference in volumes 
 *                        as a positive number. 
 *                        
 * Program Author:        Caitlyn Lacovara 
 * 
 * Date Created:          02/03/20
 * 
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    -------------------
************************************************************************************************/
package prelab02;
import java.util.Scanner;
public class PreLab02 {
    public static void main(String[] args) {
    //Import scanner 
    Scanner input = new Scanner(System.in);
    //Prompt user to input value of variables 
    System.out.print("Enter radius and height of the first cone: ");
     //Declare constant 
    final double PI = 3.14159;
    //Declare variables
    double radius1 = input.nextDouble();
    double height1 = input.nextDouble();
    double v = PI * (Math.pow(radius1,2)) * height1 / 3; 
    //Display results
    System.out.println("The volume of the first cone = " + v);
    System.out.print("Enter the radius and height of the second cone: ");
    //Prompts user to input value of variables
    double radius2 = input.nextDouble();
    double height2 = input.nextDouble();
    double v2 = PI * (Math.pow(radius2,2)) * height2 / 3;
    //Display results 
    System.out.println("The volume of the second cone = " + v2);
    System.out.println("The difference in volumes = " + Math.abs(v-v2));  
    }
    
}
