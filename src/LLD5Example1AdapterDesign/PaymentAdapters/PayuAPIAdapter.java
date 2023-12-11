package LLD5Example1AdapterDesign.PaymentAdapters;

import LLD5Example1AdapterDesign.enums.PaymentStatus;
import LLD5Example1AdapterDesign.external.PayuAPI;

public class PayuAPIAdapter implements PaymentProviderInterface {
    PayuAPI payuApi = new PayuAPI();
    public void makeLink() {
        this.payuApi.makeLink();
    }
    public void pay(){
        this.payuApi.pay();
    }
    public PaymentStatus checkStatus(){
        this.payuApi.statusCheck();
        return PaymentStatus.SUCCESS;
    }
}
