package com.mycompany.todoapp.models;

import java.util.Date;

public class RecurringTask extends Task {

    private String recurrenceFrequency;
    private Date nextOccurrence;

    public RecurringTask(String category, String importanceLevel, String description, String note,
     boolean isItARecurringTask, String recurrenceFrequency) {
        super(category, importanceLevel, description, note, isItARecurringTask);
        this.recurrenceFrequency = recurrenceFrequency;
        this.nextOccurrence = calculateNextOccurrence();
    }

    public String getRecurrenceFrequency() {
        return recurrenceFrequency;
    }

    public void setRecurrenceFrequency(String recurrenceFrequency) {
        this.recurrenceFrequency = recurrenceFrequency;
    }

    public Date getNextOccurrence() {
        return nextOccurrence;
    }

    public void setNextOccurrence(Date nextOccurrence) {
        this.nextOccurrence = nextOccurrence;
    }

    public Date calculateNextOccurrence(){
        Date currentDate = new Date();
        switch (recurrenceFrequency) {
            case "1":
                return new Date(currentDate.getTime() + 1000L * 60 * 60 * 24);
            case "2":
                return new Date(currentDate.getTime() + 1000L * 60 * 60 * 24 * 7);
            case "3":
                return new Date(currentDate.getTime() + 1000L * 60 * 60 * 24 * 7 * 30);
            case "4":
                return new Date(currentDate.getTime() + 1000L * 60 * 60 * 24* 7 * 30 * 365);
            default:
                throw new IllegalArgumentException("Invalid recurrence frequency: " + recurrenceFrequency);

        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nRecurrence Frequency: " + recurrenceFrequency +
                ", Next Occurrence: " + nextOccurrence;
    }
}
