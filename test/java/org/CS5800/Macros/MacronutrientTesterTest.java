package org.CS5800.Macros;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MacronutrientTesterTest {
    @Mock
    private Customer customer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCustomerCreation() {
        // Setup mock behavior
        when(customer.getName()).thenReturn("Arnold Schwarzenegger");
        when(customer.getDietPlan()).thenReturn("Paleo");
        when(customer.getCarb()).thenReturn(Macronutrient.Carb.PISTACHIO);
        when(customer.getProtein()).thenReturn(Macronutrient.Protein.CHICKEN);
        when(customer.getFat()).thenReturn(Macronutrient.Fat.AVOCADO);

        // Assert expected values
        assertEquals("Arnold Schwarzenegger", customer.getName());
        assertEquals("Paleo", customer.getDietPlan());
        assertEquals(Macronutrient.Carb.PISTACHIO, customer.getCarb());
        assertEquals(Macronutrient.Protein.CHICKEN, customer.getProtein());
        assertEquals(Macronutrient.Fat.AVOCADO, customer.getFat());
    }
}
