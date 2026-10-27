/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.st10512383.exam2025;

/**
 *
 * @author ST10512383
 */
public class ProductSales implements IProductSales {

    private final int[][] SALES_DATA = {
        {300, 150, 700},
        {250, 200, 600}
    };

    private static final int SALES_LIMIT = 500;

    @Override
    public int[][] GetProductSales() {
        return SALES_DATA; // Returns the entire 2D sales array
    }

    @Override
    public int GetTotalSales() {
        int total = 0;

        // Outer Loop
        for (int row = 0; row < SALES_DATA.length; row++) {
            for (int column = 0; column < SALES_DATA[row].length; column++) { // Inner Loop
                total += SALES_DATA[row][column];
            }
        }
        return total;
    }

    @Override
    public int GetSalesOverLimit() {
        int overLimit = 0;

        // Outer Loop
        for (int row = 0; row < SALES_DATA.length; row++) {
            for (int column = 0; column < SALES_DATA[row].length; column++) { // Inner Loop
                if (SALES_DATA[row][column] > SALES_LIMIT) {
                    overLimit++;
                }
            }
        }
        return overLimit;
    }

    @Override
    public int GetSalesUnderLimit() {
        int underLimit = 0;

        // Outer Loop
        for (int row = 0; row < SALES_DATA.length; row++) {
            for (int column = 0; column < SALES_DATA[row].length; column++) { // Inner Loop
                if (SALES_DATA[row][column] < SALES_LIMIT) {
                    underLimit++;
                }
            }
        }
        return underLimit;
    }

    @Override
    public int GetProductsProcessed() {
        return SALES_DATA.length;
    }

    @Override
    public double GetAverageSales() {
        int count = 0;

        for (int row = 0; row < SALES_DATA.length; row++) {
            for (int column = 0; column < SALES_DATA[row].length; column++) {
                count++; // Increase count by one per loop
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) GetTotalSales() / count;
    }
}
