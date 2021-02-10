package a.b.c.application;

import a.b.c.domain.payment.PaymentEntity;
import a.b.c.domain.payment.PaymentRepository;

public class PaymentService {

    public static final String CREDIT_CARD = "creditCard";

    PaymentRepository paymentRepository;
  
    public void execute(PaymentEntity payment) {
  
      if (CREDIT_CARD.equals(payment.getPaymentType())) {
        callExternalService(payment);
      }
  
      paymentRepository.save(payment);
    }
  
    void callExternalService(PaymentEntity payment) {
        // TODO impl
    }
}
