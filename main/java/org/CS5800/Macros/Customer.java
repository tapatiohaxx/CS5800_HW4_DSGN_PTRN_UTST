package org.CS5800.Macros;

public class Customer {
    private String name;
    private String dietPlan;
    private Macronutrient.CarbFactory carbFactory;
    private Macronutrient.ProteinFactory proteinFactory;
    private Macronutrient.FatFactory fatFactory;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
        setDietFactories();
    }

    private void setDietFactories() {
        // Using the static method from Macronutrient to get the right factory based on the diet plan
        switch (dietPlan.toLowerCase()) {
            case "paleo":
                carbFactory = Macronutrient.PaleoFactory.getInstance();
                proteinFactory = Macronutrient.PaleoFactory.getInstance();
                fatFactory = Macronutrient.PaleoFactory.getInstance();
                break;
            case "vegan":
                carbFactory = Macronutrient.VeganFactory.getInstance();
                proteinFactory = Macronutrient.VeganFactory.getInstance();
                fatFactory = Macronutrient.VeganFactory.getInstance();
                break;
            case "no restriction":
                carbFactory = Macronutrient.NoRestrictionFactory.getInstance();
                proteinFactory = Macronutrient.NoRestrictionFactory.getInstance();
                fatFactory = Macronutrient.NoRestrictionFactory.getInstance();
                break;
            case "nut allergy":
                carbFactory = Macronutrient.NutAllergyFactory.getInstance();
                proteinFactory = Macronutrient.NutAllergyFactory.getInstance();
                fatFactory = Macronutrient.NutAllergyFactory.getInstance();
                break;
            default:
                // Default factories could be NoRestriction or another safe option
                carbFactory = Macronutrient.NoRestrictionFactory.getInstance();
                proteinFactory = Macronutrient.NoRestrictionFactory.getInstance();
                fatFactory = Macronutrient.NoRestrictionFactory.getInstance();
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    public Macronutrient.Carb getCarb() {
        return carbFactory.createCarb();
    }

    public Macronutrient.Protein getProtein() {
        return proteinFactory.createProtein();
    }

    public Macronutrient.Fat getFat() {
        return fatFactory.createFat();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dietPlan='" + dietPlan + '\'' +
                ", Carb='" + getCarb() + '\'' +
                ", Protein='" + getProtein() + '\'' +
                ", Fat='" + getFat() + '\'' +
                '}';
    }
}


