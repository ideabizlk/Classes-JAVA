package lk.dialog.ideabiz.api.model.common.sms.Outbound;

/**
 * Created by Malinda_07654 on 2/13/2016.
 */
public class DeliveryInfo {
    String address;
    String deliveryStatus;
    String messageReferenceCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getMessageReferenceCode() {
        return messageReferenceCode;
    }

    public void setMessageReferenceCode(String messageReferenceCode) {
        this.messageReferenceCode = messageReferenceCode;
    }

    public DeliveryInfo(String address, String deliveryStatus, String messageReferenceCode) {
        this.address = address;
        this.deliveryStatus = deliveryStatus;
        this.messageReferenceCode = messageReferenceCode;
    }

    public DeliveryInfo() {
    }
}
