package a.b.c.interfaces.order;

import a.b.c.application.OrderService;
import a.b.c.domain.order.OrderEntity;

// @RestController("/order")
public class OrderController {

    OrderService orderService = new OrderService();
    
    // @GetMapping
    public OrderResponseDto order(OrderRequestDto request) {
        
        OrderEntity order = OrderFactory.dto2entity(request);

        OrderResponseDto response = new OrderResponseDto();
        response.setOrderNo(orderService.order(order));
        
        return response;
    }
}