package edu.usi.cs358.labs.FishLab1;

import java.util.Scanner;

public class FishAppMenu {
    public static void main(String[] args) {
        /** Lab01 – Campus Utilities Suite (Jehanna Fisher, 09/03/2025) */

        final double TAX_RATE = 0.07;
        final double BOILING_F = 212;
        final double SCORE1 = 100;
        final double SCORE2 = 95;
        final double NUMBER = 2;
        final String newPage = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
        Scanner scanner = new Scanner(System.in);
        int choice = 99;

        while (choice != 0) {
            System.out.print("== CS358 Utilities ==\n\n" +
                    "1) Profile Check\n" +
                    "2) Gross Pay Calculator\n" +
                    "3) Checkout \n" +
                    "4) Sphere Calculator\n" +
                    "5) MPG\n" +
                    "0) Exit\n\n" +
                    "What Would you Like to choose? ");
            choice = scanner.nextInt();
            //ystem.out.println("You chose: " + choice);
            System.out.print(newPage);

            if (choice == 1) {
                System.out.print("What is your First Name? ");
                String fName = scanner.next();
                System.out.print("What is your Last Name? ");
                String lName = scanner.next();
                char fInitial = fName.charAt(0);
                char lInitial = lName.charAt(0);
                double Average = ((double) SCORE1 + (double) SCORE2) / 2;
                double BOILING_C = (BOILING_F - 32) * 5 / 9;
                System.out.println("Welcome back " + fName.toUpperCase() + " " + lName.toUpperCase() +" "+ ((fName + lName).length())+
                        "\n\n" + fInitial + lInitial + ": \n" +
                        "Score 1: " + SCORE1 +
                        "\nScore 2: " + SCORE2 +
                        "\nAverage: " + Average +
                        "\nBoiling F: " + Math.floor(BOILING_F) + "F" +
                        "\nBoiling C: " + Math.floor(BOILING_C) + "C" +
                        "\nType anything to continue: ");
                scanner.next(); scanner.nextLine();

            } else if (choice == 2){
                System.out.print("\nWhat are your hours?"); int hours = scanner.nextInt();
                System.out.print("\nWhat is your pay?"); double rate = scanner.nextInt();
                double pay = 0;
                if (hours <= 40) {
                    pay = hours*rate;
                }else{
                    pay = 40*rate+(hours-40)*1.5*rate;
                }
                System.out.printf("You earned $%.2f%n", pay);
                System.out.print("Type anything to continue: "); scanner.next(); scanner.nextLine();

            } else if(choice == 3){

                System.out.print("\nName of the Item: "); String item = scanner.next();
                System.out.print("\nPrice of the Item: "); double price = scanner.nextDouble();
                double tax = price*TAX_RATE;
                double total = price + tax;
                System.out.printf("\n"+item);
                System.out.printf("The tax is %.2f%n", tax);
                System.out.printf("Your Total is %.2f%n", total);
                System.out.print("Type anything to continue: "); scanner.next(); scanner.nextLine();

            } else if (choice == 4) {
                System.out.print("Diameter: ");
                double diameter = scanner.nextDouble();
                double radius = diameter/NUMBER;
                double Volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
                System.out.printf("The Answer is: %.5f%n",Volume);
                System.out.print("Type anything to continue: "); scanner.next(); scanner.nextLine();

            } else if (choice == 5) {
                System.out.print("Miles: "); double miles = scanner.nextDouble();
                System.out.print("Galloons: "); double gallons = scanner.nextDouble();

                if (gallons==0){
                    System.out.println("Sorry, please type a number other than 0 for gallons");
                }else{
                    double MPG = miles/gallons;
                    System.out.printf("The MPG is %.2f%n", MPG);
                }
                System.out.print("Type anything to continue: "); scanner.next(); scanner.nextLine();
            }

            System.out.print(newPage);
        }
    }
}
