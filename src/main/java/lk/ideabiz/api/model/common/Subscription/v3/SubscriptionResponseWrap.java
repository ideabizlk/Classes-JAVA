package lk.ideabiz.api.model.common.Subscription.v3;

import lk.ideabiz.api.model.common.PIN.SubscriptionResponse;

/**
 * Created by Malinda_07654 on 8/14/2016.
 */
public class SubscriptionResponseWrap {
    SubscriptionStatusResponse subscribeResponse;

    public SubscriptionStatusResponse getSubscribeResponse() {
        return subscribeResponse;
    }

    public void setSubscribeResponse(SubscriptionStatusResponse subscribeResponse) {
        this.subscribeResponse = subscribeResponse;
    }
}
