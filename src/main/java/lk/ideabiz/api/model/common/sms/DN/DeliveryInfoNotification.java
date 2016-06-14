package lk.ideabiz.api.model.common.sms.DN;

/**
 * Created by Malinda_07654 on 2/16/2016.
 */
public class DeliveryInfoNotification {
    String callbackData;
    String serverReferenceCode;
    String messageReferenceCode;
    String senderAddress;
    DeliveryInfo deliveryInfo;

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getServerReferenceCode() {
        return serverReferenceCode;
    }

    public void setServerReferenceCode(String serverReferenceCode) {
        this.serverReferenceCode = serverReferenceCode;
    }

    public String getMessageReferenceCode() {
        return messageReferenceCode;
    }

    public void setMessageReferenceCode(String messageReferenceCode) {
        this.messageReferenceCode = messageReferenceCode;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
}
