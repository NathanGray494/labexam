package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService
{
    private CustomerServiceClient customerServiceClient;
    HashMap<Integer, Order> orderMap;

    public OrderService(CustomerServiceClient customerServiceClient)
    {
        this.customerServiceClient = customerServiceClient;
        orderMap = new HashMap<>();
    }
    public String createOrder(Order order)
    {
        Customer customer = customerServiceClient.getCustomerById(order.getOrderId());
         if((customer.getAge()) >= 18)
         {
            orderMap.put(order.getOrderId(), order);
            return "Order added";
         }
         else
         {
             return "You are too young to place an order";
         }
    }

    public Order getOrderById(int id)
    {
        return orderMap.get(id);
    }
}
