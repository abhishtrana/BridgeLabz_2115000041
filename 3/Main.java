class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CircularLinkedList {
    Task head;

    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
            head = newTask;
        }
    }

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }

    public void removeByTaskId(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head.next == head) {
                head = null;
            } else {
                Task temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next != head) {
            temp.next = temp.next.next;
        }
    }

    public Task viewCurrentTask() {
        return head;
    }

    public void moveToNextTask() {
        if (head != null) {
            head = head.next;
        }
    }

    public void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public Task searchByPriority(int priority) {
        Task temp = head;
        do {
            if (temp.priority == priority) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();
        taskList.addAtEnd(1, "Complete Project", 3, "2025-02-20");
        taskList.addAtEnd(2, "Prepare for Exam", 1, "2025-02-18");
        taskList.addAtBeginning(3, "Buy Groceries", 2, "2025-02-15");
        taskList.addAtPosition(4, "Clean Room", 5, "2025-02-16", 2);
        taskList.displayAllTasks();
        taskList.removeByTaskId(2);
        taskList.displayAllTasks();
        taskList.moveToNextTask();
        Task currentTask = taskList.viewCurrentTask();
        System.out.println("Current Task: " + currentTask.taskName);
        Task taskByPriority = taskList.searchByPriority(3);
        if (taskByPriority != null) {
            System.out.println("Task with priority 3: " + taskByPriority.taskName);
        }
    }
}

