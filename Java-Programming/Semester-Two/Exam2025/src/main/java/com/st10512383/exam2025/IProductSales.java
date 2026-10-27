/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.st10512383.exam2025;

/**
 *
 * @author ST10512383
 */
public interface IProductSales {

    int[][] GetProductSales();

    int GetTotalSales();

    int GetSalesOverLimit();

    int GetSalesUnderLimit();

    int GetProductsProcessed();

    double GetAverageSales();
    
}
