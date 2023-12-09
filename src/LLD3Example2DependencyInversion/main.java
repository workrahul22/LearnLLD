package LLD3Example2DependencyInversion;

public class main {
    public static void main(String[] args) {
        RazorPayPaymentProcessor ppi = new RazorPayPaymentProcessor();
        JustPayPaymentProcessor jppp = new JustPayPaymentProcessor();
        PaytmPaymentProcessor pp = new PaytmPaymentProcessor(jppp);
        pp.pay();
    }
}
