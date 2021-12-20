// A script that calculates the total cost of an item using Canada's tax rates from 2021


import java.util.Scanner;

class price_calculator {
    static void calculate_cost(double tax_rate, double cost) {
        double taxs = cost * tax_rate;
        double total = cost + taxs;

        System.out.println("\nThe total cost of your item is: " + total + "\n");
    }
    public static void main(String[] args) {
        System.out.println("\nEnter the prices of each item! When you are done, enter \"0\"!\n");
        double total = 0;
        double item_cost = 0;
        int item_count = 1;

        Scanner cost = new Scanner(System.in);
        do {
            System.out.println("Price of item " + item_count + ": ");
            item_cost = cost.nextDouble();
            total += item_cost;
            item_count += 1;
        }
        while (item_cost != 0);

        System.out.println("1 - Alberta\n2 - British Columbia\n3 - Manitoba\n4 - New Brunswick\n5 - Newfoundland and Labrador\n6 - Northwest Territories\n7 - Nova Scotia\n8 - Nunavut\n9 - Ontario\n10 - Prince Edward Island\n11 - Quebec\n12 - Saskatchewan\n13 - Yukon\n\nWhich province or territory are you in?: ");
        Scanner location_input = new Scanner(System.in);
        int location = location_input.nextInt();

        location_input.close();
        cost.close();

        // User inputs their location
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
