package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.KafkaProducerService;

@RestController
@RequestMapping("/producer")
public class OrderController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send")
    public String sendOrder(@RequestBody Order order) {
        producerService.sendOrder(order);
        return "Message sent to Kafka";
    }
}