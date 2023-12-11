package LLD5Example1AdapterDesign;

import LLD5Example1AdapterDesign.PaymentAdapters.PaymentProviderInterface;
import LLD5Example1AdapterDesign.PaymentAdapters.RazorPayAPIAdapter;

public class Swiggy {

    static PaymentProviderInterface paymentProvider = new RazorPayAPIAdapter();

    public static void main(String[] args) {
        paymentProvider.pay();
    }
}
