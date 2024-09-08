/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
Description: 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. 
Due: Sep 15 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here: ___Eric Snyder___

*/

import java.util.Scanner; // We are importin the Scanner class from java.util 

public class Main { // open the class block

    public static void main(String[] args) { // open the main method block

        // Create the scanner object "input" for user input
        Scanner input = new Scanner(System.in);

        // The user enters a degree in Celsius
        System.out.print("Enter a degree in Celsius: ");

        // We store the user input into a double named "celsius"
        double celsius = input.nextDouble();

        // We convert the user input from Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // The software displays the degrees converted from Celsius to Fahrenheit
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}