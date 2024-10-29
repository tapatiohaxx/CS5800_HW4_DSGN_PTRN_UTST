package org.CS5800.Pizzas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(Topping.EXTRA_CHEESE);
        toppings.add(Topping.BACON);
        toppings.add(Topping.BEEF);


        this.pizza = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.BACON)
                .addTopping(Topping.BEEF)
                .build();
    }

    @AfterEach
    void tearDown() {
        pizza = null;
    }

    @Test
    void getSize() {
        assertEquals("Large", pizza.getSize(), "Pizza size should be 'Large'");
    }

    @Test
    void getToppings() {
        assertNotNull(pizza.getToppings(), "Toppings should not be null");
        assertFalse(pizza.getToppings().isEmpty(), "Toppings should not be empty");
        assertTrue(pizza.getToppings().contains(Topping.EXTRA_CHEESE), "Toppings should include Extra Cheese");
        assertTrue(pizza.getToppings().contains(Topping.BACON), "Toppings should include Bacon");
        assertTrue(pizza.getToppings().contains(Topping.BEEF), "Toppings should include Beef");
    }

    @Test
    void eat() {
        String expectedOutput = "Eating a Large pizza from Pizza Hut with toppings: [EXTRA_CHEESE, BACON, BEEF]";
        assertEquals(expectedOutput, pizza.eat(), "Eat method should return the correct pizza description");
    }
}
