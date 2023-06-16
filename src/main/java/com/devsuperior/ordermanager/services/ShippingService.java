package com.devsuperior.ordermanager.services;

import com.devsuperior.ordermanager.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double value = 0.0;
        if (order.getBasic() < 100.00) {
            value = 20.00;
        } else if (order.getBasic() < 200.00) {
            value = 12.00;
        } else {
            value = 0.0;
        }
        return value;
    }
}
