import java.time.LocalDateTime;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head, tail;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, LocalDateTime bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;
        
        // Handle case where the ticket to remove is the head
        if (head.ticketId == ticketId) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }

        // Traverse to find the ticket
        Ticket current = head;
        while (current.next != head && current.next.ticketId != ticketId) {
            current = current.next;
        }

        if (current.next != head) {
            current.next = current.next.next;
            if (current.next == head) {
                tail = current;
            }
        }
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + 
                               ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    public Ticket searchByCustomerName(String customerName) {
        Ticket current = head;
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                return current;
            }
            current = current.next;
        } while (current != head);
        return null;
    }

    public Ticket searchByMovieName(String movieName) {
        Ticket current = head;
        do {
            if (current.movieName.equalsIgnoreCase(movieName)) {
                return current;
            }
            current = current.next;
        } while (current != head);
        return null;
    }

    public int countBookedTickets() {
        int count = 0;
        Ticket current = head;
        if (current != null) {
            do {
                count++;
                current = current.next;
            } while (current != head);
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "John Doe", "Avatar", "A1", LocalDateTime.now());
        system.addTicket(2, "Jane Smith", "Titanic", "B3", LocalDateTime.now());
        system.addTicket(3, "Michael Johnson", "Avengers", "C5", LocalDateTime.now());

        system.displayTickets();
        
        system.removeTicket(2);

        system.displayTickets();

        Ticket ticket = system.searchByCustomerName("John Doe");
        if (ticket != null) {
            System.out.println("Found ticket for " + ticket.customerName + " with Movie: " + ticket.movieName);
        }

        System.out.println("Total Booked Tickets: " + system.countBookedTickets());
    }
}

