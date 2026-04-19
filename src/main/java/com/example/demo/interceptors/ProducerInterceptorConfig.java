package com.example.demo.interceptors;

import java.util.Map;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.example.demo.model.Order;

public class ProducerInterceptorConfig implements ProducerInterceptor<String, Order> {

    @Override
    public ProducerRecord<String, Order> onSend(ProducerRecord<String, Order> record) {
        System.out.println("[Producer Interceptor] " + record.value());
        return record;
    }

    @Override
    public void close() {}

	@Override
	public void configure(Map<String, ?> configs) {
		// TODO Auto-generated method stub
		
	}
}