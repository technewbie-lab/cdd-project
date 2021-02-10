package a.b.c.domain.order;

import java.time.LocalDate;
import java.util.List;

import a.b.c.domain.payment.PaymentEntity;
import lombok.Data;

@Data
public class OrderEntity {

    private String orderNo;

    private String userName;
  
    private String address;
  
    private LocalDate requestDate;
  
    private List<OrderDetailEntity> details;
  
    private PaymentEntity payment;
    
}
