package LLD3Example2DependencyInversion;

public class PaytmPaymentProcessor {
    PaymentProcessorInterface ppi;
//    PaymentProcessorInterface ppi = new RazorPayPaymentProcessor(); // it violates open/close principle
    // we can only change this to
//    PaymentProcessorInterface ppi = new JustPayPaymentProcessor();
    // for changing from razorpay to justpay

    // we can also use constructor for this like
    PaytmPaymentProcessor(PaymentProcessorInterface ppi) {
        this.ppi = ppi;
    }

    void pay() {
        this.ppi.pay();
    }
}
