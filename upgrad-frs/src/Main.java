public class Main {
    public static void main(String[] agrs){

Passenger passenger=new Passenger(32,"street 69","Delhi","Delhi","Soham","7856342378","adatiasoham@gmail.com");
        Passenger passenger1=new Passenger(567,"street 78","uttar pradesh","agra","anuj","7852378","sohamaditiya@gmail.com");
Flight flight1=new Flight("A57B983","Indigo",789);
        Flight flight2=new Flight("DB4553","AirIndia",345);
Ticket ticket1 = new RegularTicket(457,passenger,"10:30","22:30",568,flight1,5465.568f,false);
Ticket ticket2=new TouristTicket(3734,passenger1,"5:40","6:23",5676,flight2,678.78f,false);
printTicketDetails(ticket1);
printTicketDetails(ticket2);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.pnr);
    }
}
