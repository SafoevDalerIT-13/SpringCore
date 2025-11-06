package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class TaskManager {
    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Вызвали постконструктор!");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("Вызвали дистрой!");
    }

    public Long printTask() {
            System.out.println("Текущая задача: " + task.toString());
            return task.getDuration();
        }

    }



