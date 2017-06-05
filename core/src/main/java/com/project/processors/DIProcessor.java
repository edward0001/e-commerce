package com.project.processors;


import com.project.processor.DIService;
import org.reflections.Reflections;

import java.util.Set;

public class DIProcessor {

    public Object initialize(Object o) {
        try {
            String className = "com.path.to.ImplementationType";
            Class c = Class.forName(className);

            return c.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;

    }

    private String getImplementationName(Object o) {
        Reflections reflections = new Reflections("com.project");

        Set<Class<? extends Object>> allClasses = reflections.getTypesAnnotatedWith(DIService.class);

        allClasses.contains(o.getClass());
        return null;
    }


}
