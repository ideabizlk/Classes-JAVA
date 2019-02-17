package lk.ideabiz.api.model.common.PIN;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Malinda_07654 on 7/4/2016.
 */
public class SubscriptionRequst {
    String msisdn;
    String method;
    String description;
    PINMeta pinMeta;

    /* gson 2.4 or later need */
    @SerializedName(value = "serviceId", alternate = {"ServiceID", "serviceID","ServiceId"})
    String serviceId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public PINMeta getPinMeta() {
        return pinMeta;
    }

    public void setPinMeta(PINMeta pinMeta) {
        this.pinMeta = pinMeta;
    }
}
