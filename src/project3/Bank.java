package project3;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Customer getCustomer(String pin) {
        for (Customer customer : customers) {
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        }
        return null;
    }

    public String getAllCustomerInfo() {
        StringBuilder info = new StringBuilder();
        for (Customer customer : customers) {
            info.append(customer.toString()).append("\n");
        }
        return info.toString();
    }
}
