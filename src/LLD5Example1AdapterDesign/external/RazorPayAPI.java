package LLD5Example1AdapterDesign.external;

import LLD5Example1AdapterDesign.enums.RazorPayStatus;

public class RazorPayAPI {
    public void generatePaymentLink() {
        System.out.println("RazorPay generate link");
    }

    public void makePayment() {
        System.out.println("RazorPay pay");
    }

    public RazorPayStatus checkStatus() {
        System.out.println("RazorPay status");
        return RazorPayStatus.FAILED;
    }
}
