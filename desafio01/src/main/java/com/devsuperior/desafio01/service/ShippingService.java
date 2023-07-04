package com.devsuperior.desafio01.service;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        if (order.getBasic()< 100) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
