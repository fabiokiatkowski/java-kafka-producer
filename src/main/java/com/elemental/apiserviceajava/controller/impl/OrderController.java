package com.elemental.apiserviceajava.controller.impl;

import com.elemental.apiserviceajava.controller.IOrderController;
import com.elemental.apiserviceajava.controller.dtorq.OrderRq;
import com.elemental.apiserviceajava.service.IOrderService;
import com.elemental.apiserviceajava.service.dto.OrderDTO;
import com.elemental.apiserviceajava.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController implements IOrderController {
    @Autowired
    private IOrderService orderService;
    @Override
    public String postOrder(OrderRq order) {
        OrderDTO orderDTO = OrderDTO.builder()
                .client(order.getClient())
                .externalId(order.getExternalId())
                .build();
        return orderService.publishOrder(orderDTO);
    }
}
