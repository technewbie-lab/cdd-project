package a.b.c.application;

import java.util.List;

import a.b.c.domain.inventory.InventoryEntity;
import a.b.c.domain.inventory.InventoryRepository;
import a.b.c.domain.order.OrderEntity;
import a.b.c.domain.order.OrderRepository;
import a.b.c.domain.order.OrderSpecification;

// @Transactional
public class OrderService {

    OrderRepository orderRepository;
  
    InventoryRepository inventoryRepository;
  
    PaymentService paymentService;
  
    public String order(OrderEntity order) {
  
      List<InventoryEntity> inventories = inventoryRepository.findByProductCdInWithLock(order.getDetails());
  
      OrderSpecification.allocate(order, inventories);
  
      paymentService.execute(order.getPayment());
  
      long orderSeq = orderRepository.getNextOrderSeq();
      String orderNo = OrderSpecification.generateOrderNo(orderSeq);
      order.setOrderNo(orderNo);
  
      orderRepository.save(order);
  
      return order.getOrderNo();
    }
}
