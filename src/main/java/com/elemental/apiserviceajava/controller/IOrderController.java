package com.elemental.apiserviceajava.controller;

import com.elemental.apiserviceajava.controller.dtorq.OrderRq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IOrderController {
    @PostMapping
    String postOrder(@RequestBody OrderRq order);
}
