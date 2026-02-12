/**
Scenario:
A flight booking system allows passengers to book seats on flights. However, if a flight is fully booked, the system should throw a NoSeatsAvailableException.
Your task is to implement this system in Java by:
Creating a Flight class to manage available seats.
Implementing a method bookSeat(int seats) that handles bookings and throws an exception if no seats are available.
Writing a custom exception class called NoSeatsAvailableException.
Testing the functionality using a main method.
 */

// Custom Exception Class
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

// Flight Class
class Flight {
    private String flightNumber;
    private int availableSeats;

    // Constructor
    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    // Method to book seats
    public void bookSeat(int seats) throws NoSeatsAvailableException {

        if (availableSeats == 0) {
            throw new NoSeatsAvailableException(
                    "Flight " + flightNumber + " is fully booked."
            );
        }

        if (seats > availableSeats) {
            throw new NoSeatsAvailableException(
                    "Only " + availableSeats + " seat(s) available."
            );
        }

        availableSeats -= seats;

        System.out.println(seats + " seat(s) booked successfully on Flight " + flightNumber);
        System.out.println("Remaining seats: " + availableSeats);
    }
}

// Main Class
public class FlightBookingSystem {
    public static void main(String[] args) {

        Flight flight = new Flight("AI202", 3);

        try {
            flight.bookSeat(2);   // Valid booking
            System.out.println();

            flight.bookSeat(2);   // Exceeds available seats
            System.out.println();

            flight.bookSeat(1);   // If seats become 0, this throws exception

        } catch (NoSeatsAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }
}
