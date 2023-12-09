package LLD3Example2DependencyInversion;

public class RazorPayPaymentProcessor implements PaymentProcessorInterface {
    public void pay() {
        System.out.println("Razor Pay payment processor");
    }
}
