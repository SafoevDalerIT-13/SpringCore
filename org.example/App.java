package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.function.Predicate;

import java.time.*;
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");

//        Task task1 = context.getBean(Task.class);
//        System.out.println(task1);

        TaskManager task2 = context.getBean(TaskManager.class);
        task2.printTask();

        context.close();

    }
}
