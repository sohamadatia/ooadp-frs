public abstract class Ticket {
    public int pnr;
    public Passenger passenger;
    public String arrivalTime;
    public String departureTime;
    public int seatNo;
    public Flight flight;
    public float price;
    public boolean cancelled;
    public String checkStatus(){
        if(cancelled)
            return "Cancelled";
        else
            return "Booked";
    }
    public String getFlightDuration(){
        String a[]=arrivalTime.split(":");
        String d[]=departureTime.split(":");
       return (Integer.parseInt(a[0])-Integer.parseInt(d[0]))+" hours "+(Integer.parseInt(a[1])-Integer.parseInt(d[1]))+" minutes";
    }
    public void cancel(){
        cancelled=true;
    }

    public Ticket(int pnr, Passenger passenger, String arrivalTime, String departureTime, int seatNo, Flight flight, float price, boolean cancelled) {
        this.pnr = pnr;
        this.passenger = passenger;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seatNo = seatNo;
        this.flight = flight;
        this.price = price;
        this.cancelled = cancelled;
    }
}
