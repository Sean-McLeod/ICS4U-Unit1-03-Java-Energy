/*
* This is a program that calculates the amount of energy
* when mass is given.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-04-24
*/

import java.util.Scanner;


final class Energy {
    private Energy() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(final String[] args) {
        final double speedOfLight = 2.998 * (Math.pow(10, 8));
        double energy;
        double mass;

        // declare input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass of an object in kilograms: ");

        try {
            // input
            mass = input.nextDouble();

            if (mass > 0) {
                // calculate
                energy = mass * Math.pow(speedOfLight, 2);

                // output
                System.out.println(mass + "kg of mass would produce "
                                   + energy + "J of energy.");
            } else {
                System.err.println("Please enter a positive mass");
            }

        } catch (Exception NumberFormatException) {
            System.err.println("Please enter a number");
        }
    }
}
