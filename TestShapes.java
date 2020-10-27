/**********************************************************************************
 * Program Name:          Prelab09A
 *
 * Program Description:   This program imports and invokes the circle, rectangle, and 
 *                        triangle classes I have created to perform a series of operations. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/21/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package testshapes;
public class TestShapes {

    public static void main(String[] args) {
     
     //Create new test variables and invoke public classes
    
     CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields();
     
     RectangleWithPrivateDataFields rectangle1 = new RectangleWithPrivateDataFields();
     
     TriangleWithPrivateDataFields triangle1 = new TriangleWithPrivateDataFields();
     
     
     //Declare and define number of shape objects as a variable:
     
     int numbOfShapeObjects = triangle1.getTriangleObjects() + rectangle1.getRectangleObjects() + circle1.getCircObjects();
     
     
     //Invoke class methods to perform calculations and display to use:
     
     System.out.println("The area of the circle of raidus " + circle1.getRadius() + " is " + circle1.getCircleArea());
     
     System.out.println("The area of the rectangle of length " + rectangle1.getLength() + " and width " + rectangle1.getWidth() + " is " + rectangle1.getRectangleArea());
     
     System.out.println("The area of the triangle of base " + triangle1.getBase() + " and height " + triangle1.getHeight() + " is " + triangle1.getTriangleArea());

     System.out.println("The number of Circle objects is " + circle1.getCircObjects());
     
     System.out.println("The number of Rectangle objects is " + rectangle1.getRectangleObjects());
     
     System.out.println("The number of Triangle objects is " + triangle1.getTriangleObjects());
     
     System.out.println("The number of Shapes objects is " + numbOfShapeObjects);
                  
        
    }
     
    
}
