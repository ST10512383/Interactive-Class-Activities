/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.st10512383.exam2025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10512383
 */
public class ProductSalesTest {

    public ProductSalesTest() {
    }

    @Test
    public void testGetProductSales() {
    }

    @Test
    public void testGetTotalSales() {
    }

    @Test
    public void testGetSalesOverLimit() {
        ProductSales sales = new ProductSales(); // Arrange
        int expected = 2;
        int actual = sales.GetSalesOverLimit(); // ACT: Call the method we want to test
        assertEquals(expected, actual); // ASSERT: Compare the expected value with the actual value
    }

    @Test
    public void testGetSalesUnderLimit() {
        ProductSales sales = new ProductSales(); // Arrange
        int expected = 4;
        int actual = sales.GetSalesUnderLimit(); // ACT: Call the method we want to test
        assertEquals(expected, actual); // ASSERT: Compare the expected value with the actual value
    }

    @Test
    public void testGetProductsProcessed() {
    }

    @Test
    public void testGetAverageSales() {
    }

}
