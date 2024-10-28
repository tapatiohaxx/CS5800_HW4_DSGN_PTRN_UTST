package org.CS5800.Pizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<Topping> toppings;

    // Private constructor to enforce the use of the PizzaBuilder
    private Pizza(String chain, String size, List<Topping> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = (toppings != null) ? new ArrayList<>(toppings) : new ArrayList<>();
    }

    public String getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return new ArrayList<>(toppings);
    }

    public String eat() {
        String message = "Eating a " + size + " pizza from " + chain + " with toppings: " + toppings;
        System.out.println(message);
        return message;
    }

    // Static inner class for building Pizza
    public static class PizzaBuilder {
        private String chain;
        private String size;
        private List<Topping> toppings = new ArrayList<>();

        public PizzaBuilder(String chain, String size) {
            this.chain = chain;
            this.size = size;
        }

        public PizzaBuilder addTopping(Topping topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(chain, size, toppings);
        }
    }
}
