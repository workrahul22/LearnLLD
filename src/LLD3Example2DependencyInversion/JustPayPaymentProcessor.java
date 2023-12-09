package LLD3Example2DependencyInversion;

public class JustPayPaymentProcessor implements PaymentProcessorInterface {
    public void pay() {
        System.out.println("Just pay payment processed");
    }
}
