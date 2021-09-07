public class Passenger {
    private int id;
    private Address address;
    private Contact contact;
    public static int idCounter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = idCounter++;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }
    public int getPassengerCount(){
        return idCounter;
    }
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }


    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

}

