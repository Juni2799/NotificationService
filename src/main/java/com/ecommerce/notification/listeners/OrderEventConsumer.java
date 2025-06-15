package com.ecommerce.notification.listeners;

import com.ecommerce.notification.listeners.event.OrderEventListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderEventConsumer {
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void handleEventOrder(OrderEventListener orderEvent){
        System.out.println("Received Order event: " + orderEvent);

        long orderId = orderEvent.getOrderId();
        String orderStatus = String.valueOf(orderEvent.getOrderStatus());

        System.out.println("Order ID: " + orderId + ", Order Status: " + orderStatus);
    }
}
