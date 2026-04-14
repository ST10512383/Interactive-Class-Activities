package com.mycompany.loopappdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CookieMachineTest {
    
    public CookieMachineTest() {
    }

    @Test
    public void testBakeCookies() {
        // Arrange: create object
        CookieMachine machine = new CookieMachine();
        
        //Act: call method
        machine.bakeCookies();
        
        // Assert: check expected result
        // Expect 0 ingredients left after baking
        assertEquals(0, machine.ingredients);
        assertFalse(machine.ingredients > 0); // Expect to fail if its false
    }

    @Test
    public void testTasteCookies() {
        // Arrange: create object
        CookieMachine machine = new CookieMachine();
        
        // Act: Execute the method
        machine.tasteCookies();
        
        // Assert: Verify the result
        assertEquals(5, machine.ingredients); // Ingredients should remain unchanged
        assertTrue(machine.ingredients == 5);
    }

    @Test
    public void testPackCookies() {
    }
    
}
