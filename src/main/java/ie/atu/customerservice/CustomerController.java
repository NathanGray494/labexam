package ie.atu.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController
{
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }


    @PostMapping("/createCustomer")
    public String createCustomer(@RequestBody Customer customer)
    {
        customerService.createCustomer(customer);
        return "customer created";
    }

    @GetMapping("/getcustomer")
    public Customer getCustomerById(int id)
    {
        return customerService.getCustomer(id);
    }
}
