package org.CS5800.Pizzas;

public class PizzaOrder {
    public static void main(String[] args) {

        Pizza pizzaHutLarge = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.BACON)
                .addTopping(Topping.MUSHROOMS)
                .build();
        pizzaHutLarge.eat();

        // Pizza from Little Caesars
        Pizza littleCaesarsMedium = new Pizza.PizzaBuilder("Little Caesars", "Medium")
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.SPINACH)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.HAM)
                .addTopping(Topping.PESTO)
                .addTopping(Topping.TOMATO_AND_BASIL)
                .build();
        littleCaesarsMedium.eat();

        // Pizza from Dominos
        Pizza dominosSmall = new Pizza.PizzaBuilder("Dominos", "Small")
                .addTopping(Topping.EXTRA_CHEESE)
                .build();
        dominosSmall.eat();

        // Additional pizzas
        Pizza littleCaesarsSmallTwoToppings = new Pizza.PizzaBuilder("Little Caesars", "Small")
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.OLIVES)
                .build();
        littleCaesarsSmallTwoToppings.eat();

        Pizza littleCaesarsSmallSixToppings = new Pizza.PizzaBuilder("Little Caesars", "Small")
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.SPINACH)
                .addTopping(Topping.TOMATO_AND_BASIL)
                .build();
        littleCaesarsSmallSixToppings.eat();

        Pizza dominosLargeThreeToppings = new Pizza.PizzaBuilder("Dominos", "Large")
                .addTopping(Topping.HAM)
                .addTopping(Topping.PESTO)
                .addTopping(Topping.SPICY_PORK)
                .build();
        dominosLargeThreeToppings.eat();
    }
}

