package ie.atu.customerservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CustomerService
{
    HashMap<Integer,Customer> customerHashMap;

    public CustomerService()
    {
        customerHashMap = new HashMap<>();
    }


    public String createCustomer(Customer customer)
    {
        customerHashMap.put(customer.getCustomerId(), customer);
        return "customer added";
    }

    public Customer getCustomer(int id)
    {
        return customerHashMap.get(id);
    }

}
