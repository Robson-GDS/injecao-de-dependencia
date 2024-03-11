package com.desafioinjecaodedependencia.desafioinjecaodedependencia.services;

import com.desafioinjecaodedependencia.desafioinjecaodedependencia.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        return order.getBasic() - order.getBasic() * order.getDiscount() + shippingService.shipment(order);
    }
}
