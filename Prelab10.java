/************************************************************************************
 * Program Name:          Prelab10
 *
 * Program Description:   This program imports and invokes different class methods
 *                        to calculate and display the area of a triangle, as well 
 *                        as well as convert hex to decimal, and split strings into 
 *                        tokens. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/28/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/
package prelab10;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class Prelab10 {
  
    public static void main(String[] args) {
        
      //Declare variables:
      
      double sideA, sideB, sideC; 
      
      double p, temp, area; 
      
      //Prompt user to input triangle lengths via dialog box:
      
      String input = JOptionPane.showInputDialog("Enter the length of the sides of triangle: ");
      
      //Store input from dialog box:
      
      StringTokenizer st = new StringTokenizer(input, " ");
        
      //Parse each side of triangle:
        
      sideA = Double.parseDouble(st.nextToken());
        
      sideB = Double.parseDouble(st.nextToken());
        
      sideC = Double.parseDouble(st.nextToken());
        
        if (!checkValidlength(sideA, sideB ,sideC))
                
            JOptionPane.showMessageDialog(null, "Invalid Triangle");
        
            else {
                
                //If sides are valid, calculate area using Heron's formula:
                
                p = (sideA + sideB + sideC)/2;
                
                temp = p * (p - sideA) * (p - sideB) * (p - sideC);
                
                area = Math.sqrt(temp);
                
                JOptionPane.showMessageDialog(null, "The area of the triangle is " + area);
            }
      
        
            //Invoke Methods:
            
            StringCheck();
            
            stringSearch();
            
            Wrapper(); 
            
            StringSplitting();  
        
        }
        
        
        //Check if sum of any two sides is less than or equal to third side:
    
        private static boolean checkValidlength(Double a, Double b, Double c) {
                
            if((a + b) <= c)
                        
                return false;
                
                    else if((b + c) <= a)
                        
                        return false;
                
                          else if((a + c) <= b)
                        
                              return false;
                    
                                return true;                   
        } 
        
        
    //Create method for palindrome check:
        
    private static void StringCheck() {
       
    //Declare variables:
            
    String input;
            
    //Prompt user for palindrome input via dialog box:
            
    input = JOptionPane.showInputDialog("Enter a Palindrome: ");
                
    //Create construct:
            
    StringBuilder stringBuild = new StringBuilder(input);  
                
    //reverse the string using reverse method and compare both:
                
    stringBuild.reverse();
                
        if (input.equalsIgnoreCase(stringBuild.toString()))
                    
            JOptionPane.showMessageDialog(null, input + " is palindrome");
                
        else
                    
            JOptionPane.showMessageDialog(null, input + " is not palindrome");
    
        }    
      
      
    //Create method for searching string:
      
    private static void stringSearch() {
        
    //Declare variables:
        
    String input, search;
        
    int index;
        
    //Prompt user for string search info via dialog box:
        
    input = JOptionPane.showInputDialog("Enter a String to Search: ");
                
    search = JOptionPane.showInputDialog("Now, Enter a Search String: ");
                
    index = input.indexOf(search);
        
    //Display message based on string search index:
        
        if (index == -1)
                        
            JOptionPane.showMessageDialog(null, "Search String not found");
                
        else
                       
            JOptionPane.showMessageDialog(null, search + " found at position " + index);
        
        }
        
        
    //Create method for converting hex to deci:
        
    private static void Wrapper() {
       
    //Declare Varaibles:
        
    String input;
        
    int deci; 
        
    //Prompt user for input of hex value via dialog box:
        
    input = JOptionPane.showInputDialog("Enter a hex value: ");
                
    deci = Integer.parseInt(input,16);
        
        
    //Display hexadeci in deci to user via dialog box:
        
    JOptionPane.showMessageDialog(null, "Hexadecimal " + input + " = Decimal " + deci);
        
    }  
        
        
    //Create method for splitting strings:
        
    private static void StringSplitting() {
        
    //Declare variables:
        
    String input; 
        
    //Prompt user for input of address via dialog box:
        
    input = JOptionPane.showInputDialog("Enter an address. Separate each line with a percent sign: ");
        
    //Split the string using split() method:
        
    String[] tokens = input.split("%");
                
    //Invoke StringJoiner class method to join strings:
                
    StringJoiner joiner = new StringJoiner(",\n");
                
        for (String string : tokens) {
                
            joiner.add(string);
                
        }
            
            JOptionPane.showMessageDialog(null, joiner.toString() + ".");
        }
        
}  