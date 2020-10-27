 /************************************************************************************
 * Program Name:          Lab07A
 *
 * Program Description:   This program passes an argument (“y” or “n”) to the main method 
 *                        to determine if it will print out the random list of integers or not. 
 * 
 * Program Author:        Caitlyn Lacovara
 * 
 * Date Created:          04/10/2020
 *
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
 **************************************************************************************/ 
package lab07a;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Lab07A {
 
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    Random rn = new Random();
    
    
    //Declare starting variables methods;
    
    
    int listLength;
    
    
   //Attain printlist value from user to proceed or not:
    
   char printListChar = input.next().charAt(0); 
    
        char printList = printListChar;

         if (printList != 121 && printList != 110) {
                        
            System.out.println("Invalid argument.");
            
            return;
         } 
    
    
    
    //Prompt user for list length:
    
    System.out.println("Please enter the list length: ");
    
    listLength = input.nextInt();
    
    
    //Create array:
    
    int[] list = new int[listLength];
    
       for(int i = 0; i < listLength; i++){

       int answer = rn.nextInt(listLength) + 1;

          list[i] = answer;
       }
   
          
    //Create new variable "key" from the random integers:  
    
    int key = rn.nextInt(listLength) + 1;
    

    //Display key + unsorted and assorted lists from array:
    
    System.out.println("Key = " + key); 
    
    System.out.print("Unsorted list: ");
    
    printArray(list);
    
    
    
    //Invoke Methods:
    
    boolean linearSearch = linearSearch(list, key);
    
    bubbleSort(list);
    
    System.out.println("Key " + key + " found in binary search after " + binarySearch(list,key) + " reads");
   

    }  
    
 
 
 //Create method for printArray:
      
 public static void printArray(int[] list) {
     
       long start = System.nanoTime();

       for(int i = 0; i < list.length; i++){

        System.out.print(list[i] + " ");
               
       }
       
      //Calculate sort time:
 
      long end = System.nanoTime();

      long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    
      System.out.println("\nSort time is " + timeInMillis + " milliseconds.");
     
 }

    
    
//Create method for linearSearch:
 
 public static boolean linearSearch(int[] list, int key) {
      
    int index = 0;

       while(index < list.length) {

           if(list[index] == key) {

             System.out.println("Key " + key + " found in linear search at position: " + index);

               return true;
            }

    index++;

       } 

       return false;

       }    
 
    
    
//Create method for bubbleSort:
    
 public static void bubbleSort(int[] list) {
     
    int j;

    boolean flag = true;   

    int temp;  

       while (flag) {

          flag = false;

             for ( j = 0; j < list.length - 1; j++ ) {
 
               if ( list[j] > list[j+1] ) {

                 temp = list[ j ];

                 list[ j ] = list[ j+1 ];

                 list[ j+1 ] = temp;

                 flag = true;

                }

              }
        }
       

  System.out.print("\nSorted list: ");
  
    long start = System.nanoTime();

    for(int i=0; i < list.length; i++) {

      System.out.print(list[i] + " ");

    }
    
      //Calculate sort time:
 
      long end = System.nanoTime();

      long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    
      System.out.println("\nSort time is " + timeInMillis + " milliseconds.");
   
 }   
    
    
    
//Create method for binarySearch:
    
 public static int binarySearch(int[] list, int key)   {
     
  int low = 0;

  int high = list.length - 1;

  int middle = 0;

     while(low <= high) {

        middle = low + (high - low) / 2;

          if (list[middle] < key) {

            low = middle + 1;

          } 

            else if(list[middle] > key) {

              high = middle - 1;

             }

              else

                return middle;
     }

    return middle;

  }
     
       
    
}
