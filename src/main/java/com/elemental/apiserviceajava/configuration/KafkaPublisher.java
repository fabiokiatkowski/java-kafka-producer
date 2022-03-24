package com.elemental.apiserviceajava.configuration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaPublisher<T> {
    private final KafkaTemplate<String, String> kafkaTemplate;
    public void publishMessage(String topic, T message) {
        try {
            String json = (new ObjectMapper()).writeValueAsString(message);
            kafkaTemplate.send(topic, json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
