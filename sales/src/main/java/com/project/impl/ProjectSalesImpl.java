package com.project.impl;


import com.project.api.sales.ProjectSales;
import com.project.processor.DIService;

@DIService
public class ProjectSalesImpl implements ProjectSales {

    public void runSales() {
        System.out.println("Sales started");
    }
}
