package com.devsuperior.ordermanager.services;

import com.devsuperior.ordermanager.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        double discount = order.getDiscount() * (order.getBasic() / 100);
        double shipment = shippingService.shipment(order);
        return order.getBasic() - discount + shipment;
    }
}
