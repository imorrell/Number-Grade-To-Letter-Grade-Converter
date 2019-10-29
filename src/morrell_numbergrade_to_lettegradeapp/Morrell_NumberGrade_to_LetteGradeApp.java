/*
 * Project 2-2
 * Programmer: Ivoire Morrell
 * This program takes user entered number grades and converts the grade to a
 * letter grade
 */
package morrell_numbergrade_to_lettegradeapp;

//import scanner class
import java.util.Scanner;

public class Morrell_NumberGrade_to_LetteGradeApp
{

    public static void main(String[] args)
    {
       //Print welcome message
        System.out.println("Welcome to the Number grade converter Application\n");
        
        //Create new scanner object 
        Scanner sc = new Scanner(System.in);
        
        //Create a string variable to control while loop
        String userChoice = "y";
        String letterGrade = "Letter Grade:  ";
        
        //Create while loop to determine grade output
        while (userChoice.equalsIgnoreCase("y"))
        {
            //Enter a number between 0 and 100
            System.out.println("Please enter a number between 0 and 100\n");
            
            //Enter a number
            double numberGrade = sc.nextDouble();
            System.out.println();
            
            //Determine the letter grade from the user input using a if/elseif
            //loop
            
            if (numberGrade <= 100 && numberGrade >= 88)
            {    
                //print the letter grade A out
                System.out.println(letterGrade + "A" + "\n");
            }
            
            //If the grade is in the B range
            else if (numberGrade <= 87 && numberGrade >= 80)
            {
                //print the letter grade B
                System.out.println(letterGrade + "B" + "\n");   
            }
            
            //If the grade is in the C range
            else if (numberGrade <= 79 && numberGrade >= 67 )
            {
                //print out the letter grade C
                System.out.println(letterGrade + "C" + "\n");
            }  
            
            //if the grade is in the D range
            else if (numberGrade <= 67 && numberGrade >= 60)
            {
                //print out the letter grade D
                System.out.println(letterGrade + "D" + "\n");
            }
            
            else
            {
                //print out the letter grade E
                System.out.println(letterGrade + "E" + "\n");
            }
                
            //Ask user if they would like to conver another number grade
            System.out.println("Would you like to continue (y/n)? ");
            
            //user choice
            userChoice = sc.next();
            System.out.println();
          
        } 
        //print out program ended
        System.out.println("Program Ended");
           
    }
}
