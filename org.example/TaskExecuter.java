package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskExecuter {
    private final Task task;

    @Autowired
    public TaskExecuter(Task task) {
        this.task = task;
    }

    public void executeTask() {
        System.out.println("Я выполняю задачу с именем:  " + this.task.getName() + ", и она занимает " + this.task.getDuration() + " секунд");
    }
}
