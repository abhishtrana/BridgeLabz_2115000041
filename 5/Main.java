class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean availabilityStatus;
    Book next;
    Book prev;

    Book(String title, String author, String genre, int bookId, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;
        this.next = null;
        this.prev = null;
    }
}

class LibraryDoublyLinkedList {
    Book head, tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean availabilityStatus) {
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean availabilityStatus) {
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void addAtPosition(String title, String author, String genre, int bookId, boolean availabilityStatus, int position) {
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        if (position == 1) {
            addAtBeginning(title, author, genre, bookId, availabilityStatus);
            return;
        }
        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
        }
    }

    public void removeByBookId(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;
        }
    }

    public Book searchByBookTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailabilityStatus(int bookId, boolean newStatus) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.availabilityStatus = newStatus;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayAllBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + (temp.availabilityStatus ? "Available" : "Checked Out"));
            temp = temp.next;
        }
    }

    public void displayAllBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + (temp.availabilityStatus ? "Available" : "Checked Out"));
            temp = temp.prev;
        }
    }

    public int countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        library.addAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.addAtEnd("1984", "George Orwell", "Dystopian", 102, false);
        library.addAtBeginning("Moby Dick", "Herman Melville", "Fiction", 103, true);
        library.addAtPosition("To Kill a Mockingbird", "Harper Lee", "Fiction", 104, true, 2);
        library.displayAllBooksForward();
        library.updateAvailabilityStatus(102, true);
        library.displayAllBooksForward();
        library.removeByBookId(103);
        library.displayAllBooksForward();
        library.displayAllBooksReverse();
        System.out.println("Total Books in Library: " + library.countTotalBooks());
    }
}

