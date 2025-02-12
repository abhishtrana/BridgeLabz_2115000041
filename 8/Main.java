class TextState {
    String text;
    TextState prev, next;

    TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState currentState;
    private int maxHistorySize;
    private int currentHistorySize;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.currentHistorySize = 0;
        this.currentState = null;
    }

    public void typeText(String text) {
        TextState newState = new TextState(text);
        if (currentState == null) {
            currentState = newState;
        } else {
            currentState.next = newState;
            newState.prev = currentState;
            currentState = newState;
        }
        if (currentHistorySize < maxHistorySize) {
            currentHistorySize++;
        } else {
            // Remove the oldest state if history is full
            currentState.prev.next = null;
            currentState = currentState.prev;
        }
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.text);
        } else {
            System.out.println("No text history available.");
        }
    }

    public void displayHistory() {
        TextState temp = currentState;
        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.prev;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);

        editor.typeText("Hello");
        editor.displayCurrentState();

        editor.typeText("Hello World");
        editor.displayCurrentState();

        editor.typeText("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.typeText("Hello Universe");
        editor.displayCurrentState();

        editor.typeText("Hello Universe!!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();
        
        editor.displayHistory();
    }
}

