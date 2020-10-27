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
package prelab03;
import java.util.Scanner;
public class PreLab03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);                      //create scanner for use/input
    System.out.print("Enter your problem (i.e. 2): ");           //prompt user for probnum input
    byte probnum = input.nextByte();                             //declare probnum as variable
    
if (probnum < 1 || probnum > 10) {                                            //evaluate range of probnum
    System.out.println("Problem number outside range. Program ending.");      //tell user to return to start if probnum outside of range
    }

else                                                            //proceed if probnum in range
    if (probnum % 2 != 0) {                                     //proceed if probunum is odd#
    System.out.println("Rectangle");                            //Display "rectangle" in output 
    System.out.println("Enter your length: ");                  //prompt for input of length
    double length = input.nextDouble();                         //declare length variable 
    System.out.println("Enter width: ");                        //prompt for input of width
    double width = input.nextDouble();                          //declare width as a variable 
    System.out.println("Area = " + length * width);             //perform area of rectangle in output 
}
    
else                                                            //proceed if probnum in range 
    if (probnum % 2 == 0) {                                     //proceed if probnum is even#
    System.out.println("Circle");                               //Display "Circle" in output 
    System.out.println("Enter radius: ");                       //prompt for input of radius below "Circle" line 
    double radius = input.nextDouble();                         //declare radius as a variable 
    final double PI = 3.14159;                                   //declare PI as a constant variable 
    System.out.println("Area = " + PI * radius * radius);       //perform calculation 
 }
    
    }
}
