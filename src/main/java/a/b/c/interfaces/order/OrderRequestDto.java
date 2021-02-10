package a.b.c.interfaces.order;

import java.time.LocalDate;
import java.util.List;

import a.b.c.domain.order.OrderDetailEntity;
import a.b.c.domain.payment.PaymentEntity;

public class OrderRequestDto {

    private String userName;
  
    private String address;
  
    private LocalDate requestDate;
  
    private List<OrderDetailEntity> details;
  
    private PaymentEntity payment;
    
}
