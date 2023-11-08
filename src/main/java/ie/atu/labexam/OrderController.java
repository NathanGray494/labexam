package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController
{
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService)
    {
        this.orderService = orderService;
    }

    @PostMapping("/createorder")
    public String createOrder(@RequestBody Order order)
    {
        return orderService.createOrder(order);
    }

    @GetMapping("/getOrder")
    public Order getOrderById(int id)
    {
        return orderService.getOrderById(id);
    }
}
