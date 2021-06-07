/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

/* Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one
gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.


Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints

Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value
entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App 
{
    static int gallon = 350;

    public static void main( String[] args )
    {
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);

        // input length
        System.out.print("What is the length of the room? ");
        double length =  number1.nextInt();

        // input width
        System.out.print("What is the width of the room? ");
        double width =  number2.nextInt();

        // output
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.",
                Math.ceil((length * width)) / gallon,
                length * width);
    }
}
