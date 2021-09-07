public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    public static int bookedSeates;
    private String getFlightDetails(){
        return "FLight Number : "+flightNumber+" Airline : "+airline+" Capacity : "+capacity+" Booked Seates : "+bookedSeates;
    }
    public boolean checkAvailability(){
        return capacity>bookedSeates;
    }
    public void incrementBookingCounter(){
        bookedSeates++;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeates() {
        return bookedSeates;
    }

    public void setBookedSeates(int bookedSeates) {
        this.bookedSeates = bookedSeates;
    }

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        bookedSeates++;
    }
}
