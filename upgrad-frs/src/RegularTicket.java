public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(int pnr, Passenger passenger, String arrivalTime, String departureTime, int seatNo, Flight flight, float price, boolean cancelled) {
        super(pnr, passenger, arrivalTime, departureTime, seatNo, flight, price, cancelled);
    }


    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
