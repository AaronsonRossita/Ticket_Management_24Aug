public class VIPTicket extends Ticket{
    public VIPTicket(double ticketPrice, Customer customer) {
        super(ticketPrice, customer);
        try{
            this.setTicketPrice(calculateTicketPrice());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public double calculateTicketPrice() throws Exception {
        if (this.getCustomer().getCustomerType() == CustomerType.VIP){
            return this.getTicketPrice() - this.getTicketPrice() * getCustomer().getDiscount() / 100;
        }else{
            throw new Exception("The customer is not VIP");
        }
    }
}
