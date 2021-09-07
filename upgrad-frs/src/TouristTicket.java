public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(int pnr, Passenger passenger, String arrivalTime, String departureTime, int seatNo, Flight flight, float price, boolean cancelled) {
        super(pnr, passenger, arrivalTime, departureTime, seatNo, flight, price, cancelled);
    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String location){

    }
    public void addTouristLocation(String location){

    }
}
