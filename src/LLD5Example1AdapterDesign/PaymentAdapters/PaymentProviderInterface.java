package LLD5Example1AdapterDesign.PaymentAdapters;

import LLD5Example1AdapterDesign.enums.PaymentStatus;

public interface PaymentProviderInterface {
    public void makeLink();
    public void pay();
    public PaymentStatus checkStatus();
}
