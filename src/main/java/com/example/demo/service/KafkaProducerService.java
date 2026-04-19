package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    private static final String TOPIC = "order-topic";

    public void sendOrder(Order order) {
        kafkaTemplate.send(TOPIC, order);
        System.out.println("Produced: " + order);
    }
}