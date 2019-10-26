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
public class TestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter number 1 : ");       
        number1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        number2 = input.nextInt();
        
        if (number1 == number2)
            System.err.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.err.printf("%d != %d\n", number1, number2);
    }
    
}
