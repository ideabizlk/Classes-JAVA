package lk.ideabiz.api.model.common.PIN;

/**
 * Created by Malinda_07654 on 7/4/2016.
 */
public class SubscriptionRequst {
    String msisdn;
    String method;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}