/*
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
*/

package org.CS5800.Macros;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MacronutrientTesterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));  // Redirect System.out to capture output
    }

    @Test
    void testCustomerOutputs() {
        MacronutrientTester.main(null);  // Call the main to execute with the test setup

        String output = outContent.toString();
        assertTrue(output.contains("Arnold Schwarzenegger"));
        assertTrue(output.contains("Paleo"));
        assertTrue(output.contains("Carb:"));
        assertTrue(output.contains("Protein:"));
        assertTrue(output.contains("Fat:"));
        assertTrue(output.contains("Lou Ferrigno"));
        assertTrue(output.contains("Vegan"));
        // Repeat for all customers and ensure all expected outputs are in the captured output
    }

    @Test
    void testCustomerDietPlanOutputs() {
        MacronutrientTester.main(null);

        // Checking specific macronutrient outputs might require either actual values or additional mocks/stubs
        String output = outContent.toString();
        assertTrue(output.contains("Carb: PISTACHIO"));  // Expected output for Paleo
        assertTrue(output.contains("Protein: TOFU"));   // Expected output for Vegan
        assertTrue(output.contains("Fat: AVOCADO"));    // Common expected output

        // Ensure that no prohibited items are listed for specific diets
        assertFalse(output.contains("Carb: CHEESE"));   // Check for an invalid carb for Vegan, etc.
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);  // Restore System.out
    }
}


