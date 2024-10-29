package org.CS5800.Macros;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Arnold Schwarzenegger", "Paleo");
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void getName() {
        assertEquals("Arnold Schwarzenegger", customer.getName(), "Customer name should be Arnold Schwarzenegger");
    }

    @Test
    void getDietPlan() {
        assertEquals("Paleo", customer.getDietPlan(), "Customer diet plan should be Paleo");
    }

    @Test
    void getCarb() {
        assertNotNull(customer.getCarb(), "Carb should not be null for Paleo diet");
    }

    @Test
    void getProtein() {
        assertNotNull(customer.getProtein(), "Protein should not be null for Paleo diet");
    }

    @Test
    void getFat() {
        assertNotNull(customer.getFat(), "Fat should not be null for Paleo diet");
    }

    @Test
    void testToString() {
        String expectedString = "Customer{" +
                "name='" + customer.getName() + '\'' +
                ", dietPlan='" + customer.getDietPlan() + '\'' +
                ", Carb='" + customer.getCarb().toString() + '\'' +
                ", Protein='" + customer.getProtein().toString() + '\'' +
                ", Fat='" + customer.getFat().toString() + '\'' +
                '}';
        assertEquals(expectedString, customer.toString(), "toString method should return the formatted string of customer details");
    }
}
