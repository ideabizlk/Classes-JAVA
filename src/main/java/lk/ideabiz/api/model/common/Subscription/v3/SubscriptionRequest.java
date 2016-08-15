package lk.ideabiz.api.model.common.Subscription.v3;

/**
 * Created by Malinda_07654 on 8/14/2016.
 */
public class SubscriptionRequest {
    String method;
    String msisdn;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
