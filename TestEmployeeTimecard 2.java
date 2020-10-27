/************************************************************************************
 * Program Name:          Lab09A
 *
 * Program Description:   This program prompts user for input regarding their work
 *                        schedule and then displays their timecard based on this 
 *                        input. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/24/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/

package lab09a;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class TestEmployeeTimecard {
    
       
    public static void main(String[] args) {
        
        //Declare variables:
        
        int empNo;
        
        double payRate, hrsSat, hrsSun, hrsMon, hrsTues, hrsWed, hrsThu, hrsFri;
        
        double totalHours, totalPay; 
        
        String weekEndingDate, last, first, output; 
        
        
        //Prompt user to input their employee info via display box: 
       
        String input = JOptionPane.showInputDialog(JOptionPane.showInputDialog("Enter week "
        + "ending date, empNo, last name, first name, payrate, and Sat-Fri hours:"));
        
        
        //Store input from user + parse the input:
        
        StringTokenizer st = new StringTokenizer(input, " ");
 
        weekEndingDate = st.nextToken();

        empNo =  Integer.parseInt(st.nextToken());

        last = st.nextToken();

        first = st.nextToken();

        payRate = Double.parseDouble(st.nextToken());
        
        hrsSat = Double.parseDouble(st.nextToken());
        
        hrsSun = Double.parseDouble(st.nextToken());
                
        hrsMon = Double.parseDouble(st.nextToken());
                
        hrsTues = Double.parseDouble(st.nextToken());
                
        hrsWed = Double.parseDouble(st.nextToken());
                
        hrsThu = Double.parseDouble(st.nextToken());
        
        hrsFri = Double.parseDouble(st.nextToken());

        
        //Create an employee instance:

        Employee emp = new Employee(empNo, last, first, payRate);
        
        //Create a timecard instance:

        Timecard tc = new Timecard(weekEndingDate, hrsSat, hrsSun, hrsMon, hrsTues, hrsWed, hrsThu, hrsFri);
  
        //Invoke class method to get total hours: 
        
        totalHours = tc.getTotalHrs();
        
        //Invoke class method to get total pay: 

        totalPay = (emp.getPayRate() * totalHours);
  
        
        //Concatenate the values to the variable "output":
        
        output = "Week Ending Date: " + tc.getWeekEndingDate() + "\n"
        + "Employee Number: " + emp.getEmpNo() + "\n"
        + "First Name: " + emp.getFirst() + "\n"
        + "Last Name: " + emp.getLast() + "\n"
        + "Pay Rate: $" + String.format("%.2f", emp.getPayRate()) + "\n"
        + "Total Hours: " + String.format("%.1f", totalHours) + "\n"
        + "Total Pay: $" + String.format("%.2f", totalPay);
  
         
        //Display output in diaglog box:
        
        JOptionPane.showMessageDialog(null, output);
       
        
    }
}
