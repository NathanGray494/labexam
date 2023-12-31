package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;
}
