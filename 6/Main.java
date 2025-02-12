class Process {
    int processId;
    int burstTime;
    int remainingBurstTime;
    int priority;
    Process next;

    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingBurstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class CircularLinkedList {
    Process head, tail;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;
        if (head.processId == processId) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }
        Process temp = head;
        while (temp.next != head && temp.next.processId != processId) {
            temp = temp.next;
        }
        if (temp.next != head) {
            temp.next = temp.next.next;
        }
    }

    public void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority + ", Remaining Burst Time: " + temp.remainingBurstTime);
            temp = temp.next;
        } while (temp != head);
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class Main{
    private static final int TIME_QUANTUM = 4;

    public static void simulateRoundRobin(CircularLinkedList processList) {
        int totalWaitingTime = 0, totalTurnaroundTime = 0, completedProcesses = 0;
        CircularLinkedList waitingQueue = new CircularLinkedList();

        while (!processList.isEmpty()) {
            Process currentProcess = processList.head;
            if (currentProcess.remainingBurstTime > TIME_QUANTUM) {
                currentProcess.remainingBurstTime -= TIME_QUANTUM;
                processList.head = processList.head.next;
                processList.tail.next = currentProcess;
                processList.tail = currentProcess;
                processList.tail.next = processList.head;
            } else {
                totalWaitingTime += (processList.head == processList.tail) ? 0 : (processList.tail.remainingBurstTime);
                totalTurnaroundTime += (processList.head.remainingBurstTime + currentProcess.remainingBurstTime);
                processList.removeProcess(currentProcess.processId);
                completedProcesses++;
            }

            processList.displayProcesses();
            System.out.println("Waiting Time: " + totalWaitingTime + ", Turnaround Time: " + totalTurnaroundTime);
        }

        System.out.println("Average Waiting Time: " + (float) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " + (float) totalTurnaroundTime / completedProcesses);
    }

    public static void main(String[] args) {
        CircularLinkedList processList = new CircularLinkedList();
        processList.addProcess(1, 6, 1);
        processList.addProcess(2, 8, 2);
        processList.addProcess(3, 7, 3);
        processList.addProcess(4, 3, 4);

        simulateRoundRobin(processList);
    }
}

