/**
Scenario:
A new online movie ticket booking system is being developed. Users can book tickets for different movies based on seat availability. 
Each movie has a fixed number of seats, and once all seats are booked, no further reservations can be made. 
If a user tries to book a seat when none are available, the system should throw a SeatNotAvailableException.
You are required to implement this system using Java by:
Creating a Movie class to store the movie name and available seats.
Implementing a method bookTicket(int seats) to handle ticket booking and throw an exception if there aren’t enough seats.
Writing a custom exception class called SeatNotAvailableException.
Testing the functionality using a main method.
 */

// Custom Exception
class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

// Movie Class
class Movie {
    String movieName;
    int availableSeats;

    Movie(String name, int seats) {
        movieName = name;
        availableSeats = seats;
    }

    void bookTicket(int seats) throws SeatNotAvailableException {
        if (seats > availableSeats) {
            throw new SeatNotAvailableException("Not enough seats available!");
        }

        availableSeats -= seats;
        System.out.println("Ticket booked successfully!");
        System.out.println("Seats left: " + availableSeats);
    }
}

// Main Class
public class MovieTest {
    public static void main(String[] args) {

        Movie m1 = new Movie("Avengers", 2);

        try {
            m1.bookTicket(1);  // works
            m1.bookTicket(2);  // throws exception
        } catch (SeatNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
