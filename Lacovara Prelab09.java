 /************************************************************************************
 * Program Name:          Prelab09
 *
 * Program Description:   This program imports and invokes two main classes, TestRectangle 
 *                        and TestCylinder, to perform a series of calculations in this
 *                        package. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/14/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package prelab09;
import prelab09.TestCylinder;
import prelab09.TestRectangle;
public class Prelab09 {

 
    public static void main(String[] args) {
        
       
    
    //Create a rectangle of length 10 and width 20 by invoking TestRectangle class:
         
    SimpleRectangle rectangle1 = new SimpleRectangle(); 
    
    
    //Print surface area and volume of rectangle by invoking methods from the TestRectangle class:
         
    System.out.println("The area of the rectangle of length " + rectangle1.length + " and width " + rectangle1.width + " is " + rectangle1.getArea());
         
    System.out.println("The perimeter of the rectangle of length " + rectangle1.length +  " and width " + rectangle1.width + " is " + rectangle1.getPerimeter());
         
    System.out.println("The diagonal of the rectangle of length " + rectangle1.length +  " and width " + rectangle1.width + " is " + rectangle1.getDiagonal());
    
    
    
    //Create a cylinder with radius 10 by invoking TestCylinder: 
        
    SimpleCylinder cylinder1 = new SimpleCylinder(); 
    
    
    //Print surface area and volume of cylinder by invoking methods from the TestCylinder class:
        
    System.out.println("\nThe surface area of the cylinder of radius " + cylinder1.radius + " and " + cylinder1.height + " is " + cylinder1.getSurfaceArea());
        
    System.out.println("The volume of the cylinder of radius " + cylinder1.radius + " and " + cylinder1.height + " is " + cylinder1.getVolume()); 
   
    
    }   
        
}
     
