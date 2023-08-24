public abstract class Ticket {

    private double ticketPrice;
    private Customer customer;

    public Ticket(double ticketPrice, Customer customer) {
        this.ticketPrice = ticketPrice;
        this.customer = customer;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public abstract double calculateTicketPrice() throws Exception;
}
