package com.mycompany.todoapp.models;

import java.util.Date;

public class Task {
    private String description;
    private String category;
    private Date createdDate;
    private String note;
    private String importanceLevel;
    private boolean isCompleted;
    private boolean isRecurringTask = false;

    public Task(String category, String importanceLevel, String description, String note, boolean isRecurringTask) {
        this.category = category;
        this.importanceLevel = importanceLevel;
        this.createdDate = new Date();
        this.description = description;
        this.note = note;
        this.isCompleted = false;
        this.isRecurringTask = isRecurringTask;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(String importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    public boolean isRecurringTask() {
        return this.isRecurringTask;
    }

    public void setRecurringTask(boolean recurringTask) {
        this.isRecurringTask = recurringTask;
    }

    @Override
    public String toString() {
            return  "Category: " + category +
                    ", Importance Level: " + importanceLevel +
                    ", com.mycompany.todoapp.models.Task Creation Date: " + createdDate +
                    "\ncom.mycompany.todoapp.models.Task: " + description +
                    "\nNote: " + note;
    }


}
