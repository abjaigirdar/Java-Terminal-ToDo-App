package com.mycompany.todoapp.services;
import com.mycompany.todoapp.models.RecurringTask;
import com.mycompany.todoapp.models.Task;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> trash = new ArrayList<>();
    private ArrayList<RecurringTask> recurringTasks = new ArrayList<>();

    public ToDoList() {
    }

    public void addTask(String category, String importanceLevel, String description, String note,
                        boolean isRecurringTask, String recurrenceFrequency) {
        if (isRecurringTask) {
            this.recurringTasks.add(new RecurringTask(category, importanceLevel, description, note, isRecurringTask,
                    recurrenceFrequency));
            System.out.println("Recurring task added successfully.");
        }
        else {
            this.tasks.add(new Task(category, importanceLevel, description, note, isRecurringTask));
            System.out.println("com.mycompany.todoapp.models.Task added to the list successfully.");
        }
    }

    public void viewTasks() {
        if (this.tasks.isEmpty()) {
            System.out.println("No tasks to show.");
        } else {
            System.out.println("Here are your tasks:");

            for(int i = 0; i < this.tasks.size(); ++i) {
                System.out.println(i + 1 + ". " + this.tasks.get(i));
            }
        }
    }

    public void softDeleteTask(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= this.tasks.size()) {
            Task task = this.tasks.get(taskNumber -1);
            trash.add(task);

            this.tasks.remove(taskNumber - 1);

            System.out.println("com.mycompany.todoapp.models.Task removed successfully.");
        }
        else {
            System.out.println("Invalid task number.");
        }
    }

    public void viewDeletedTasks() {
        if (trash.isEmpty()) {
            System.out.println("Sorry, No tasks to recover. The recycle bin is empty");
        }
        else {
            System.out.println("Here are your Deleted tasks: ");
            for (int i = 0; i < this.trash.size(); i++) {
                System.out.println(i + 1 + ". " + this.trash.get(i));
            }
        }
    }

    public void permanentlyDeleteTask(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= this.trash.size()) {
            Task taskIndex = this.trash.get(taskNumber - 1);
            trash.remove(taskIndex);
            System.out.println("com.mycompany.todoapp.models.Task: " + taskNumber + " is deleted permanently");
        }
        else {
            System.out.println("Invalid task number.");
        }
    }
}
