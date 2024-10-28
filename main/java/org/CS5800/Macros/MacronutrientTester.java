package org.CS5800.Macros;

public class MacronutrientTester {

    public static void main(String[] args) {
        // Create an array of customers with different diet plans
        Customer[] customers = new Customer[] {
                new Customer("Arnold Schwarzenegger", "Paleo"),
                new Customer("Lou Ferrigno", "Vegan"),
                new Customer("Dorian Yates", "No Restriction"),
                new Customer("Ronnie Coleman", "Nut Allergy"),
                new Customer("Frank Zane", "Paleo"),
                new Customer("Jay Cutler", "Vegan")
        };

        // Display the macronutrient details for each customer
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Diet Plan: " + customer.getDietPlan());
            System.out.println("Carb: " + customer.getCarb());
            System.out.println("Protein: " + customer.getProtein());
            System.out.println("Fat: " + customer.getFat());
            System.out.println();  // Print a blank line for better readability between entries
        }
    }
}
