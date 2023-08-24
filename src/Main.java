public class Main {


    public static void main(String[] args) {

        Customer c1 = new Customer(CustomerType.VIP,20);
        Customer c2 = new Customer(CustomerType.REGULAR,null);
        VIPTicket vt1 = new VIPTicket(150,c1);
        VIPTicket vt2 = new VIPTicket(100,c2);

        System.out.println(vt2.getTicketPrice());



    }


}