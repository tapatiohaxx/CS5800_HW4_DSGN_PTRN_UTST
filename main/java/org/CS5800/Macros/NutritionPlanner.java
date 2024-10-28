package org.CS5800.Macros;

public class NutritionPlanner {
    public static void main(String[] args) {
        Macronutrient.CarbFactory paleoCarbFactory = Macronutrient.PaleoFactory.getInstance();
        Macronutrient.ProteinFactory veganProteinFactory = Macronutrient.VeganFactory.getInstance();

        Macronutrient.Carb carb = paleoCarbFactory.createCarb();
        Macronutrient.Protein protein = veganProteinFactory.createProtein();

        System.out.println("Paleo Carb: " + carb);
        System.out.println("Vegan Protein: " + protein);
    }
}