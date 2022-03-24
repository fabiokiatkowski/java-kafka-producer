package com.elemental.apiserviceajava.service.impl;

import com.elemental.apiserviceajava.configuration.KafkaPublisher;
import com.elemental.apiserviceajava.service.IOrderService;
import com.elemental.apiserviceajava.service.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private KafkaPublisher<OrderDTO> publisher;
    @Value("${kafka.topic.order}")
    private String topic;

    @Autowired
    public OrderService(KafkaPublisher<OrderDTO> publisher) {
        this.publisher = publisher;
    }

    @Override
    public String publishOrder(OrderDTO order) {
        publisher.publishMessage(topic, order);
        return String.format("Order %s sent successfully", order.getExternalId());
    }
}
