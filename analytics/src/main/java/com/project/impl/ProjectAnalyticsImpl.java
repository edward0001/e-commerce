package com.project.impl;


import com.project.api.analytics.ProjectAnalytics;
import com.project.processor.DIService;

@DIService
public class ProjectAnalyticsImpl implements ProjectAnalytics {

    public void runAnalytics() {
        System.out.println("Analytics started");
    }
}
