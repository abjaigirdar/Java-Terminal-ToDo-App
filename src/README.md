# Introduction to Enhanced com.mycompany.todoapp.models.Task Management

The goal of this project is to enhance a basic to-do application by implementing advanced features and addressing common challenges in task management. These improvements aim to make the application more user-friendly, functional, and robust while leveraging Object-Oriented Programming principles. 

You'll begin by analyzing the current application, identifying potential shortcomings, and brainstorming solutions to improve it. Following this, you'll work on designing and implementing new features, such as recurring tasks, importance levels, soft delete functionality, and more. Each enhancement will require careful planning, thoughtful coding, and thorough testing to ensure the application remains efficient and easy to use.

The document is divided into three main sections:
1. **Requirements**: Detailed descriptions of new features to be implemented.
2. **Questions**: Critical thinking prompts to guide your design and implementation decisions.
3. **Hints and Gotchas**: Practical advice and common pitfalls to help you successfully develop each feature.

As you work through this project, keep the user in mind. Focus on creating a seamless experience while maintaining clean and maintainable code. Use the questions to guide your decisions, and refer to the hints and gotchas to avoid common mistakes.

This project will not only deepen your understanding of Java and OOP but also prepare you to tackle real-world software development challenges. Happy coding!


# Enhanced com.mycompany.todoapp.models.Task Management Requirements

## 1. com.mycompany.todoapp.models.Task Classes

### Base com.mycompany.todoapp.models.Task Class:
- Represents a generic task with attributes like:
  - Description
  - Created date
  - Importance level
- **Methods**:
  - `markAsCompleted()`
  - `markAsDeleted()`
  - `isDeleted()`
  - `isCompleted()`

### com.mycompany.todoapp.models.RecurringTask Class:
- Extends the `com.mycompany.todoapp.models.Task` class.
- **Additional Attributes**:
  - Frequency (e.g., daily, weekly, monthly)
  - Next occurrence date
- **Methods**:
  - `scheduleNextOccurrence()` to update the task for the next cycle.

## 2. Importance Levels

### Add Importance Levels:
- Define priority levels (e.g., Low, Medium, High, Critical).
- Store the priority level in each task.
- Sort tasks by importance when viewing the list.

## 3. Soft Delete Functionality
- Tasks should not be permanently deleted but marked as "soft deleted."

### Add Attribute:
- `isDeleted` (boolean)

### Add Methods:
- `markAsDeleted()` and `restoreTask()`
- Provide an option to restore soft-deleted tasks.

## 4. Completed Tasks
- Add a status attribute (`isCompleted`).

### View Completed Tasks:
- Separate option to view tasks marked as completed.

### Mark com.mycompany.todoapp.models.Task as Completed:
- Provide functionality to mark tasks as complete.

## 5. Enhanced Views

### Default View:
- Show active tasks only.
- Sort tasks by importance and/or due date.

### Filter Options:
- View by status: Active, Deleted, or Completed.
- View by priority levels.

## 6. Due Dates
- Add a due date attribute to tasks.
- Notify or highlight overdue tasks when viewing the list.

## 7. com.mycompany.todoapp.models.Task Notes
- Add an optional notes section for each task.
- Allow users to edit notes.

## 8. Recurring Tasks
- Manage and display recurring tasks separately.
- Automatically generate instances of recurring tasks based on their schedule.

## 9. Categories
- Allow tasks to be grouped into categories (e.g., Work, Personal, Urgent).
- Option to view tasks by category.

## 10. Search and Filtering
- Provide a search feature to find tasks by keywords in their descriptions.
- Allow filtering tasks by attributes like category, due date, or importance.

## 11. Archive Tasks
- Add an option to archive completed or deleted tasks for future reference.
- Separate "Archived Tasks" view.

---

# Questions for Students Before Adding Enhancements

## **General Analysis**
- What problems or limitations do you see in the current version of the application?- Who are the potential users of this application, and what features would be most important to them?
- How can the application be structured to remain user-friendly while incorporating more features?

## **com.mycompany.todoapp.models.Task Classes**
- Why is it beneficial to use a base `com.mycompany.todoapp.models.Task` class and extend it for `com.mycompany.todoapp.models.RecurringTask`?
- What attributes and methods are essential for a recurring task? Are there any potential edge cases to consider?

## **Importance Levels**
- Why is it important to prioritize tasks in a to-do list? How would you implement sorting based on importance?
- What challenges might arise from allowing users to set task importance levels?

## **Soft Delete Functionality**
- Why is soft deletion preferable to permanently deleting tasks in certain applications?
- How would you ensure that soft-deleted tasks are distinguishable from active and completed tasks?

## **Completed Tasks**
- How does tracking completed tasks improve the usability of the application?
- What should the interface look like for viewing completed tasks versus active tasks?

## **Enhanced Views**
- What are the benefits of filtering and sorting tasks for users?
- How would you design the view options to balance functionality with simplicity?

## **Due Dates**
- How does adding a due date attribute change the complexity of task management?
- What considerations are needed to notify or highlight overdue tasks effectively?

## **com.mycompany.todoapp.models.Task Notes**
- How can adding notes to tasks improve the user experience?
- What features should be included to allow users to edit and manage task notes?

## **Recurring Tasks**
- What challenges might arise in implementing recurring tasks? How would you address them?
- How should the application handle a missed recurring task?

## **Categories**
- How does categorizing tasks benefit users? Can you think of scenarios where this might be particularly useful?
- Should tasks belong to multiple categories? Why or why not?

## **Search and Filtering**
- How would you implement a search feature that’s efficient and user-friendly?
- What filters would you prioritize in a to-do list application, and why?

## **Archive Tasks**
- How would archiving completed or deleted tasks differ from soft deletion?
- What scenarios might require accessing archived tasks, and how should they be displayed?

## **Development and Testing**
- How would you ensure these new features are properly integrated without breaking existing functionality?
- What unit tests would you write for these enhancements to ensure they work as intended?

---

# Hints and Gotchas for Each Feature

## **General Analysis**
- **Hint**: Think about how users interact with other to-do list apps. Simplicity is key!
- **Gotcha**: Overloading the app with too many features can make it harder to use. Focus on usability.

## **com.mycompany.todoapp.models.Task Classes**
- **Hint**: Use inheritance to avoid duplicating code. The `com.mycompany.todoapp.models.Task` class should handle common attributes and methods.
- **Gotcha**: Ensure that the `com.mycompany.todoapp.models.RecurringTask` class overrides methods only when necessary to avoid unexpected behavior.

## **Importance Levels**
- **Hint**: Use an `enum` for predefined importance levels (e.g., `LOW`, `MEDIUM`, `HIGH`, `CRITICAL`) to avoid inconsistencies.
- **Gotcha**: Sorting tasks by importance can become tricky if importance is not consistently defined. Test your sorting logic thoroughly.

## **Soft Delete Functionality**
- **Hint**: Use a boolean flag like `isDeleted` to manage soft-deleted tasks instead of removing them from the list.
- **Gotcha**: Ensure soft-deleted tasks don’t show up in the default active task view. Update filters and views accordingly.

## **Completed Tasks**
- **Hint**: Add a `markAsCompleted()` method to simplify marking tasks as done.
- **Gotcha**: Be careful when displaying completed tasks alongside active ones. Use filters to separate them clearly.

## **Enhanced Views**
- **Hint**: Allow users to toggle between different views (e.g., active, completed, deleted) using a simple menu.
- **Gotcha**: Avoid over-complicating the UI with too many filter options. Test for clarity and ease of use.

## **Due Dates**
- **Hint**: Use a standard date format, such as `LocalDate` in Java, to manage due dates.
- **Gotcha**: Highlight overdue tasks clearly but avoid marking them as completed automatically. Handle overdue tasks separately.

## **com.mycompany.todoapp.models.Task Notes**
- **Hint**: Use a simple `String` attribute for notes, and provide a method to update them.
- **Gotcha**: Notes might grow long. Be mindful of formatting and line breaks when displaying them in the console.

## **Recurring Tasks**
- **Hint**: Store the recurrence frequency and next due date. Use a method to calculate and update the next occurrence.
- **Gotcha**: Ensure recurring tasks don’t pile up in the task list without being addressed. Consider generating the next occurrence only after the current one is completed.

## **Categories**
- **Hint**: Use a `List<String>` or an `enum` to define categories for flexibility and consistency.
- **Gotcha**: Allowing tasks to belong to multiple categories can complicate filtering. Decide whether to support multiple categories or limit tasks to one.

## **Search and Filtering**
- **Hint**: Use simple substring matching to implement search functionality.
- **Gotcha**: Searching large lists of tasks can become slow. Optimize your search logic for scalability.

## **Archive Tasks**
- **Hint**: Use a separate collection to store archived tasks and provide a menu option to view them.
- **Gotcha**: Ensure archived tasks don’t accidentally appear in the active list. Test edge cases like restoring archived tasks.

## **Development and Testing**
- **Hint**: Test each feature in isolation before integrating it into the main application.
- **Gotcha**: Small bugs in one feature can break the entire program. Write unit tests for critical methods, such as `markAsDeleted()`, `isOverdue()`, and filters.
