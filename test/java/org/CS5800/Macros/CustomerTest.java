package org.CS5800.Macros;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        // Initialize a customer before each test
        customer = new Customer("Arnold Schwarzenegger", "Paleo");
    }

    @AfterEach
    void tearDown() {
        // Clean up resources or settings if necessary after each test
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
        // Assuming that Paleo allows only Pistachio as a carb
        // Direct assert is only possible if implementation specifics are known and fixed
        // Here we test if getCarb does not return null
        assertNotNull(customer.getCarb(), "Carb should not be null for Paleo diet");
    }

    @Test
    void getProtein() {
        // Similarly, test if getProtein does not return null
        // The exact protein may depend on random choice, so we ensure non-null for now
        assertNotNull(customer.getProtein(), "Protein should not be null for Paleo diet");
    }

    @Test
    void getFat() {
        // For Paleo, assume a specific allowed fat or a non-null result
        assertNotNull(customer.getFat(), "Fat should not be null for Paleo diet");
    }

    @Test
    void testToString() {
        // Constructing expected String based on current customer data
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
