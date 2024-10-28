package org.CS5800.Pizzas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class PizzaOrderTest {
    @Test
    void testPizzaBuilder() {
        Pizza pizza = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.BACON)
                .addTopping(Topping.MUSHROOMS)
                .build();

        assertEquals("Large", pizza.getSize());
        assertTrue(pizza.getToppings().containsAll(List.of(Topping.PEPPERONI, Topping.BACON, Topping.MUSHROOMS)));
        assertEquals(3, pizza.getToppings().size());
    }

    @Test
    void testEatMethod() {
        Pizza pizza = new Pizza.PizzaBuilder("Dominos", "Small")
                .addTopping(Topping.EXTRA_CHEESE)
                .build();
        assertDoesNotThrow(pizza::eat);
    }
}
