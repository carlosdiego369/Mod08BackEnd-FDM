package com.devsuperior.desafio01.service;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService = new ShippingService();

    public Double total(Order order) {
        return order.getBasic() - (order.getBasic() * (order.getDiscount() * 0.01)) + shippingService.shipment(order);
    }
}
