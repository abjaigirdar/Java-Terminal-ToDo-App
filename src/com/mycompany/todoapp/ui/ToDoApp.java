package com.mycompany.todoapp.ui;
import com.mycompany.todoapp.models.RecurringTask;
import com.mycompany.todoapp.ui.MenuCollection;
import com.mycompany.todoapp.services.ToDoList;

import java.util.Scanner;

public class ToDoApp {
    public ToDoApp() {
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        Scanner console = new Scanner(System.in);
        String description;
        String importanceLevelString;
        String categoryString;
        String note;
        int choice;
        int taskNumberToDelete;

        while(true) {
            MenuCollection.displayMenu();
            choice = console.nextInt();
            console.nextLine();
            switch (choice) {
                case 1:
                    while (true) {
                        MenuCollection.selectCategoryMenu();
                        choice = console.nextInt();
                        console.nextLine();
                        switch (choice) {
                            case 1:
                                categoryString = "Work";
                                break;
                            case 2:
                                categoryString = "Personal";
                                break;
                            case 3:
                                categoryString = "Urgent";
                                break;
                            default:
                                System.out.print("Invalid selection. Enter your selection 1, 2 or 3: ");
                                continue;
                        }
                        System.out.println("Task is categorized as " + categoryString);
                        break;
                    }
                    while(true){
                        MenuCollection.selectTaskImportanceMenu();
                        choice = console.nextInt();
                        console.nextLine();
                        switch (choice) {
                            case 1:
                                importanceLevelString = "CRITICAL";
                                break;
                            case 2:
                                importanceLevelString = "HIGH";
                                break;
                            case 3:
                                importanceLevelString = "MEDIUM";
                                break;
                            case 4:
                                importanceLevelString = "LOW";
                                break;
                            default:
                                System.out.print("Invalid selection. Enter your selection 1, 2, 3 or 4: ");
                                continue;
                        }
                        System.out.println("Task's importance leve is set to: " + importanceLevelString + ".");
                        break;
                    }
                    System.out.print("Enter task description: ");
                    description = console.nextLine();
                    System.out.print("Add a note to the task: ");
                    note = console.nextLine();
                    while (true) {
                        MenuCollection.recurringTaskMenu();
                        choice = console.nextInt();
                        console.nextLine();
                        switch (choice) {
                            case 1:
                                MenuCollection.recurrenceFrequencyMenu();
                                String recurrenceFrequency = console.nextLine();
                                toDoList.addTask(categoryString, importanceLevelString, description, note, true, recurrenceFrequency);
                                break;
                            case 2:
                                toDoList.addTask(categoryString, importanceLevelString, description, note, false, "");
                                break;
                            default:
                                System.out.print("Invalid selection. Enter your selection (1 or 2): ");
                                continue;
                        }
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        MenuCollection.displayViewMenu();
                        choice = console.nextInt();
                        console.nextLine();
                        switch (choice) {
                            case 1:
                                toDoList.viewTasks();
                                while (true) {
                                    MenuCollection.displayActiveMenu();
                                    choice = console.nextInt();
                                    console.nextLine();
                                    switch (choice) {
                                        case 1:
                                            System.out.print("Enter the task number to delete: ");
                                            taskNumberToDelete = console.nextInt();
                                            console.nextLine();
                                            toDoList.softDeleteTask(taskNumberToDelete);
                                            break;
                                        case 2:
                                            break;
                                        default:
                                            System.out.print("Invalid selection. Enter your selection (1 or 2): ");
                                            continue;
                                    }
                                    break;
                                }
                                break;
                            case 2:
                                toDoList.viewDeletedTasks();
                                while (true) {
                                    MenuCollection.displayDeleteMenu();
                                    choice = console.nextInt();
                                    console.nextLine();
                                    switch (choice) {
                                        case 1:
                                            System.out.print("Enter the task number to delete permanently: ");
                                            taskNumberToDelete = console.nextInt();
                                            console.nextLine();
                                            toDoList.permanentlyDeleteTask(taskNumberToDelete);
                                            break;
                                        case 2:
                                            break;
                                        default:
                                            System.out.print("Invalid selection. Enter your selection (1 or 2): ");
                                            continue;
                                    }
                                    break;
                                }
                                break;
                            default:
                                System.out.print("Invalid selection. Enter your selection (1 or 2): ");
                                continue;
                        }
                        break;
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int taskNumber = console.nextInt();
                    toDoList.softDeleteTask(taskNumber);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    console.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
