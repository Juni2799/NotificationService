package com.ecommerce.notification.listeners.event;

import com.ecommerce.notification.listeners.event.constants.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderEventListener {
    private long orderId;
    private long userId;
    private OrderStatus orderStatus;
    private List<OrderItemDTO> items;
    private BigDecimal totalAmount;
    private LocalDateTime createdAt;
}
