package LLD5Example1AdapterDesign.PaymentAdapters;

import LLD5Example1AdapterDesign.enums.PaymentStatus;
import LLD5Example1AdapterDesign.enums.RazorPayStatus;
import LLD5Example1AdapterDesign.external.RazorPayAPI;

public class RazorPayAPIAdapter implements PaymentProviderInterface{
    RazorPayAPI razorPayAPI = new RazorPayAPI();
    public void makeLink() {
        this.razorPayAPI.generatePaymentLink();
    }
    public void pay(){
        this.razorPayAPI.makePayment();
    }
    public PaymentStatus checkStatus(){
        RazorPayStatus status = this.razorPayAPI.checkStatus();
        if(status == RazorPayStatus.FAILED) {
            return PaymentStatus.ERROR;
        }
        return PaymentStatus.SUCCESS;
    }
}
