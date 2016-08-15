package lk.ideabiz.api.model.common.Subscription.v3;

/**
 * Created by Malinda_07654 on 8/14/2016.
 */
public class SubscriptionStatusResponse {
    String msisdn;
    String status;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
