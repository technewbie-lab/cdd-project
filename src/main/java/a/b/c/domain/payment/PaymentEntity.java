package a.b.c.domain.payment;

import lombok.Data;

@Data
public class PaymentEntity {
    
    private long orderNo;

    private String paymentStatus;

    private String paymentType;

    private String creditCardInfo;

    private String bankAccountInfo;
}
