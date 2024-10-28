package org.CS5800.Macros;

public class Macronutrient {
    // Enums for different types of Macronutrients
    public enum Carb {
        CHEESE, BREAD, LENTILS, PISTACHIO;
    }

    public enum Protein {
        FISH, CHICKEN, BEEF, TOFU;
    }

    public enum Fat {
        AVOCADO, SOUR_CREAM, TUNA, PEANUTS;
    }

    // Interfaces for factories
    public interface CarbFactory {
        Carb createCarb();
    }

    public interface ProteinFactory {
        Protein createProtein();
    }

    public interface FatFactory {
        Fat createFat();
    }

    // Factory implementation for each diet type as static inner classes
    public static class PaleoFactory implements CarbFactory, ProteinFactory, FatFactory {
        private static final PaleoFactory instance = new PaleoFactory();
        private PaleoFactory() {}
        public static PaleoFactory getInstance() {
            return instance;
        }
        public Carb createCarb() {
            return Carb.PISTACHIO; // Only allowed carb in Paleo
        }
        public Protein createProtein() {
            Protein[] safeProtein = {Protein.BEEF, Protein.CHICKEN, Protein.FISH};
            return safeProtein[(int) (Math.random() * safeProtein.length)];
        }
        public Fat createFat() {
            Fat[] safeFats = {Fat.AVOCADO, Fat.TUNA, Fat.PEANUTS};
            return safeFats[(int) (Math.random() * safeFats.length)];
        }
    }

    public static class VeganFactory implements CarbFactory, ProteinFactory, FatFactory {
        private static final VeganFactory instance = new VeganFactory();
        private VeganFactory() {}
        public static VeganFactory getInstance() {
            return instance;
        }
        public Carb createCarb() {
            Carb[] safeCarb = {Carb.BREAD, Carb.LENTILS, Carb.PISTACHIO};
            return safeCarb[(int)(Math.random() * safeCarb.length)];
        }
        public Protein createProtein() {
            return Protein.TOFU;
        }
        public Fat createFat() {
            Fat[] safeFat = {Fat.AVOCADO, Fat.PEANUTS};
            return safeFat[(int)(Math.random()*safeFat.length)];
        }
    }

    public static class NoRestrictionFactory implements CarbFactory, ProteinFactory, FatFactory {
        private static final NoRestrictionFactory instance = new NoRestrictionFactory();
        private NoRestrictionFactory() {}
        public static NoRestrictionFactory getInstance() {
            return instance;
        }
        public Carb createCarb() {

            return Carb.values()[(int) (Math.random() * Carb.values().length)];
        }
        public Protein createProtein() {
            return Protein.values()[(int) (Math.random() * Protein.values().length)];
        }
        public Fat createFat() {
            return Fat.values()[(int) (Math.random() * Fat.values().length)];
        }
    }

    public static class NutAllergyFactory implements CarbFactory, ProteinFactory, FatFactory {
        private static final NutAllergyFactory instance = new NutAllergyFactory();
        private NutAllergyFactory() {}
        public static NutAllergyFactory getInstance() {
            return instance;
        }
        public Carb createCarb() {

            Carb[] safeCarbs = {Carb.CHEESE, Carb.BREAD, Carb.LENTILS};
            return safeCarbs[(int) (Math.random() * safeCarbs.length)];
        }
        public Protein createProtein() {

            return Protein.values()[(int) (Math.random() * Protein.values().length)];
        }
        public Fat createFat() {

            Fat[] safeFats = {Fat.AVOCADO, Fat.SOUR_CREAM, Fat.TUNA};
            return safeFats[(int) (Math.random() * safeFats.length)];
        }
    }
}

