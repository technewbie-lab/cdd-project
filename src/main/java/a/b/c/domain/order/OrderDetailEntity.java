package a.b.c.domain.order;

import lombok.Data;

@Data
public class OrderDetailEntity {

    private long orderNo;
  
    private long detailNo;

    private String productCd;
  
    private long quantity;
  
    private long amount;
    
}
