package lk.ideabiz.api.model.common.sms.DN;

import lk.ideabiz.api.model.common.sms.Outbound.DeliveryInfoList;

/**
 * Created by Malinda_07654 on 2/13/2016.
 */
public class DeliveryInfoListWrap {
  DeliveryInfoList deliveryInfoList;

    public DeliveryInfoList getDeliveryInfoList() {
        return deliveryInfoList;
    }

    public void setDeliveryInfoList(DeliveryInfoList deliveryInfoList) {
        this.deliveryInfoList = deliveryInfoList;
    }

    public DeliveryInfoListWrap(DeliveryInfoList deliveryInfoList) {
        this.deliveryInfoList = deliveryInfoList;
    }
}
