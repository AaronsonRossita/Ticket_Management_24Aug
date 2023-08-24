public class RegularTicket extends Ticket{

    public RegularTicket(double ticketPrice, Customer customer) {
        super(ticketPrice, customer);
        this.setTicketPrice(calculateTicketPrice());
    }

    @Override
    public double calculateTicketPrice() {
        return this.getTicketPrice();
    }
}
