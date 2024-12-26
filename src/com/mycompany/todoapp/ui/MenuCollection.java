package com.mycompany.todoapp.ui;

public class MenuCollection {
    static void displayMenu() {
        System.out.println("+--------------------------------+");
        System.out.println("|         To-Do List Menu        |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Add Task.               |");
        System.out.println("|    2 - View Tasks              |");
        System.out.println("|    3 - Delete Task             |");
        System.out.println("|    4 - Exit                    |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option: ");
    }
    static void selectCategoryMenu() {
        System.out.println("+--------------------------------+");
        System.out.println("|    Select a Category.          |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Work                    |");
        System.out.println("|    2 - Personal                |");
        System.out.println("|    3 - Critical.               |");
        System.out.println("+--------------------------------+");
        System.out.print("Select the task's importance level. Choose an option: ");
    }

    static void selectTaskImportanceMenu() {
        System.out.println("+--------------------------------+");
        System.out.println("|         To-Do List Menu        |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Critical                |");
        System.out.println("|    2 - High.                   |");
        System.out.println("|    3 - Medium                  |");
        System.out.println("|    4 - Low                     |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option: ");
    }

    static void recurringTaskMenu() {
        System.out.println("\n+--------------------------------+");
        System.out.println("|    Is it a Recurring Task?     |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Yes, It Is              |");
        System.out.println("|    2 - No                      |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option (1 or 2): ");
    }

    static void recurrenceFrequencyMenu() {
        System.out.println("+--------------------------------+");
        System.out.println("|  Select Recurrence Frequency:  |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Daily                   |");
        System.out.println("|    2 - Weekly                  |");
        System.out.println("|    3 - Monthly                 |");
        System.out.println("|    4 - Yearly                  |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option: ");
    }

    static void displayViewMenu() {
        System.out.println("\n+--------------------------------+");
        System.out.println("|  What do you want to do next?  |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - View Active Tasks       |");
        System.out.println("|    2 - View Deleted Tasks      |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option (1 or 2): ");
    }
    static void displayActiveMenu() {
        System.out.println("\n+--------------------------------+");
        System.out.println("|  What do you want to do next?  |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Delete  Tasks.          |");
        System.out.println("|    2 - Go Back To Main Menu    |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option (1 or 2): ");
    }
    static void displayDeleteMenu() {
        System.out.println("\n+--------------------------------+");
        System.out.println("|  What do you want to do next?  |");
        System.out.println("+--------------------------------+");
        System.out.println("|    1 - Delete Task Permanently |");
        System.out.println("|    2 - Go Back To Main Menu    |");
        System.out.println("+--------------------------------+");
        System.out.print("Choose an option (1 or 2): ");
    }
}
