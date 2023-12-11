package LLD5Example1AdapterDesign.PaymentAdapters;

import LLD5Example1AdapterDesign.enums.PaymentStatus;
import LLD5Example1AdapterDesign.external.JustPayAPI;

public class JustPayAPIAdapter implements PaymentProviderInterface {

    JustPayAPI justPayApi = new JustPayAPI();
    public void makeLink() {
        this.justPayApi.generateLink();
    }
    public void pay(){
        this.justPayApi.pay();
    }
    public PaymentStatus checkStatus(){
        this.justPayApi.checkStatus();
        return PaymentStatus.SUCCESS;
    }
}
