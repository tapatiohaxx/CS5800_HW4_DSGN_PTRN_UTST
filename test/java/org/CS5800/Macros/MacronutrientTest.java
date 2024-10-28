package org.CS5800.Macros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MacronutrientTest {

    @Test
    void testPaleoFactory() {
        Macronutrient.CarbFactory carbFactory = Macronutrient.PaleoFactory.getInstance();
        Macronutrient.ProteinFactory proteinFactory = Macronutrient.PaleoFactory.getInstance();
        Macronutrient.FatFactory fatFactory = Macronutrient.PaleoFactory.getInstance();

        assertEquals(Macronutrient.Carb.PISTACHIO, carbFactory.createCarb(), "Paleo diet should allow only Pistachio as carb");
        assertTrue(proteinFactory.createProtein() instanceof Macronutrient.Protein, "Protein should be a valid type");
        assertTrue(fatFactory.createFat() instanceof Macronutrient.Fat, "Fat should be a valid type");
    }

    @Test
    void testVeganFactory() {
        Macronutrient.CarbFactory carbFactory = Macronutrient.VeganFactory.getInstance();
        Macronutrient.ProteinFactory proteinFactory = Macronutrient.VeganFactory.getInstance();
        Macronutrient.FatFactory fatFactory = Macronutrient.VeganFactory.getInstance();

        assertTrue(carbFactory.createCarb() != Macronutrient.Carb.CHEESE, "Vegan diet should not include Cheese as carb");
        assertEquals(Macronutrient.Protein.TOFU, proteinFactory.createProtein(), "Vegan diet should allow only Tofu as protein");
        assertTrue(fatFactory.createFat() instanceof Macronutrient.Fat, "Fat should be a valid type");
    }

    @Test
    void testNoRestrictionFactory() {
        Macronutrient.CarbFactory carbFactory = Macronutrient.NoRestrictionFactory.getInstance();
        Macronutrient.ProteinFactory proteinFactory = Macronutrient.NoRestrictionFactory.getInstance();
        Macronutrient.FatFactory fatFactory = Macronutrient.NoRestrictionFactory.getInstance();

        assertNotNull(carbFactory.createCarb(), "No restriction should allow any Carb");
        assertNotNull(proteinFactory.createProtein(), "No restriction should allow any Protein");
        assertNotNull(fatFactory.createFat(), "No restriction should allow any Fat");
    }

    @Test
    void testNutAllergyFactory() {
        Macronutrient.CarbFactory carbFactory = Macronutrient.NutAllergyFactory.getInstance();
        Macronutrient.ProteinFactory proteinFactory = Macronutrient.NutAllergyFactory.getInstance();
        Macronutrient.FatFactory fatFactory = Macronutrient.NutAllergyFactory.getInstance();

        assertNotEquals(Macronutrient.Carb.PISTACHIO, carbFactory.createCarb(), "Nut allergy diet should not include Pistachio as carb");
        assertTrue(proteinFactory.createProtein() instanceof Macronutrient.Protein, "Protein should be a valid type");
        assertTrue(fatFactory.createFat() instanceof Macronutrient.Fat, "Fat should be a valid type");
    }
}
