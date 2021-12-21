// A script that calculates the total cost of your item(s) using Canada's tax rates from 2021

// Imports a scanner to allow user input
import java.util.Scanner;

// A function that calculates the total cost of the items including taxes
class price_calculator {
    static void calculate_cost(double tax_rate, double cost) {
        double taxs = cost * tax_rate;
        double total = cost + taxs;

        System.out.println("\nThe total cost of your item is: " + total + "\n");
    }

    // The main function
    public static void main(String[] args) {
        System.out.println("\nEnter the prices of each item! When you are done, enter \"0\"!\n");

        // Initializes the following variables 
        double total = 0; // Total cost of the items without tax
        double item_cost = 0; // Cost of the item
        int item_count = 1; // Number of items
        
        // Receives the user's input
        Scanner cost = new Scanner(System.in);

        // A do loop that runs the following code until the user inputs "0" as their item_cost 
        do {
            System.out.println("Price of item " + item_count + ": ");
            // Gets the user's input
            item_cost = cost.nextDouble();
            total += item_cost; // Adds it to the total 
            item_count += 1; // Increments the number of items 
        }
        while (item_cost != 0); 

        System.out.println("1 - Alberta\n2 - British Columbia\n3 - Manitoba\n4 - New Brunswick\n5 - Newfoundland and Labrador\n6 - Northwest Territories\n7 - Nova Scotia\n8 - Nunavut\n9 - Ontario\n10 - Prince Edward Island\n11 - Quebec\n12 - Saskatchewan\n13 - Yukon\n\nWhich province or territory are you in?: ");
        // Receives the user's input, then gets it as an integer
        Scanner location_input = new Scanner(System.in);
        int location = location_input.nextInt();

        // Closes all the scanners
        location_input.close();
        cost.close();

        // Chooses the tax rates based on the user's location, then runs a function to calculate the total cost of your items
        switch(location) {
            case 2, 3 -> {
                calculate_cost(0.12, total);
            }
            case 1, 13, 8 -> {
                calculate_cost(0.05, total);
            }
            case 12 -> {
                calculate_cost(0.11, total);
            }
            case 9 -> {
                calculate_cost(0.13, total);
            }
            case 4, 7, 10, 5 -> {
                calculate_cost(0.15, total);
            }
        }
    }
}
