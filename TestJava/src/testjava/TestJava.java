/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Scanner;

/**
 *
 * @author Maen
 */

class GradeBook
{
    private String name;
    private double sum,grade,average;
    private int count;
  
    public GradeBook (String name)
    {
         this.name = name;
    }

    public void setName(String name)
    {
         this.name = name;
    }

    public String getName() 
    {
         return name;
    }

    public String displayMessage()
    {
        String S = "Total of the " + count + 
                  "grades entered is " + sum + "\n";
        S += "Class average is " + average;
        return S;
    }

    public double determineClassAverage()
    {
        while (grade != -1)
        {
            Scanner scan = new Scanner (System.in);
            System.out.print("Enter grade or -1 to quit: ");
            grade = scan.nextDouble();
            if (grade != -1) {
                sum += grade;
                count++; }
        }
        average = sum / count;
        return average;
    }
}

public class TestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter number 1 : ");       
        number1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        number2 = input.nextInt();
        
        if (number1 == number2)
            System.err.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.err.printf("%d != %d\n", number1, number2);*/
        
        // Prefix and Postfix increment
        /*int c;
        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);        
        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);   */
        
        
        //The program takes the Grades of the students in the class till the user enters -1 to quit
        /*double grade = 0; double sum = 0; int count = 0;
        GradeBook grd1 = new GradeBook("Csc 243 Introduction to Object Oriented Programming");
   
        System.out.println("Welcome to the Grade book for ");
        System.out.println(grd1.getName());
        System.out.println();
        grd1.determineClassAverage();
        System.out.println();
        System.out.println(grd1.displayMessage());*/

        
    }
    
}
