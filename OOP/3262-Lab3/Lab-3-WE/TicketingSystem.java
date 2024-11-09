// Registration Number : 523593409

// Generic Travel Ticket class
class TravelTicket {
    // Attributes with encapsulation
    private String ticketID;
    private String passengerName;
    private double baseFare;
    
    // Class-level constant for service charge rate
    private static final double SERVICE_CHARGE_RATE = 0.15;
    
    // Constructor to initialize the attributes
    public TravelTicket(String ticketID, String passengerName, double baseFare) {
        this.ticketID = ticketID;
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
    
    // Method to get the base fare including service charge 
    public double getFinalFare() {
        return baseFare * (1+SERVICE_CHARGE_RATE); // Adding 15% service charge
    }
    
    // Getter for passenger name
    public String getPassengerName() {
        return passengerName;
    }
}

// Flight class inheriting TravelTicket
class FlightTicket extends TravelTicket {
    private String airline;
    private String seatNumber;
    private static final double TAX_RATE = 0.03; // Additional tax for Flight Ticket
    
    // Constructor to initialize attributes
    public FlightTicket(String ticketID, String passengerName, double baseFare, String airline, String seatNumber) {
        super(ticketID, passengerName, baseFare);
        this.airline = airline;
        this.seatNumber = seatNumber;
    }
    
    // Overriden method to get final fare with service charge and additional tax 
    @Override 
    public double getFinalFare() {
        double fareWithServiceCharge = super.getFinalFare();
        return fareWithServiceCharge * (1+TAX_RATE); // Adding 3% tax  
    }
}

// CruiseShipTicket class inheriting TravelTicket
class CruiseShipTicket extends TravelTicket {
    private String destination;
    private int deckLevel;
    
    // Construtor to initialize attributes
    public CruiseShipTicket(String ticketID, String passengerName, double baseFare, String destination, int deckLevel) {
        super(ticketID, passengerName, baseFare);
        this.destination = destination;
        this.deckLevel = deckLevel;
    }
    
    // Overriden method to get final fare (only service charge, no extra tax)
    @Override 
    public double getFinalFare() {
        return super.getFinalFare(); // Only 15% service charge, no extra tax
    }
}

// Main class totest the implementation
public class TicketingSystem {
    public static void main(String[] args) {
        // Create a flight ticket object
        FlightTicket flightTicket = new FlightTicket("FT001", "Eranda", 12999.0, "SRI LANKAN AIR LINE", "12A");
        
        // Create a Cruise Ship Ticekt object
        CruiseShipTicket cruiseShipTicket = new CruiseShipTicket("CS001", "Prasad", 20000.0, "Dubai", 5);
        
        // Print passenger name and final fare for both services 
        System.out.println("Flight Ticket:");
        System.out.println("Passenger Name: " + flightTicket.getPassengerName());
        System.out.println("Final Fare: LKR " + flightTicket.getFinalFare());
        
        System.out.println("\nCruise Ship Ticekt:");
        System.out.println("Passenger Name: " + cruiseShipTicket.getPassengerName());
        System.out.println("Final Fare: LKR " + cruiseShipTicket.getFinalFare());
    }
}

