package com.elemental.apiserviceajava.service;

import com.elemental.apiserviceajava.service.dto.OrderDTO;

public interface IOrderService {
    String publishOrder(OrderDTO order);
}
