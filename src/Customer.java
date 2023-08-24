public class Customer {

    private CustomerType customerType;
    private Integer discount;

    public Customer(CustomerType customerType, Integer discount) {
        this.customerType = customerType;
        this.discount = discount;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
