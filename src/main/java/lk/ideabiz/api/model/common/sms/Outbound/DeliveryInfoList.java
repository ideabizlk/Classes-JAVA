package lk.ideabiz.api.model.common.sms.Outbound;

import java.util.ArrayList;

/**
 * Created by Malinda_07654 on 2/13/2016.
 */
public class DeliveryInfoList {
    ArrayList<DeliveryInfo> deliveryInfo;

    String resourceURL ;

    public ArrayList<DeliveryInfo> getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(ArrayList<DeliveryInfo> deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public DeliveryInfoList(ArrayList<DeliveryInfo> deliveryInfo, String resourceURL) {
        this.deliveryInfo = deliveryInfo;
        this.resourceURL = resourceURL;
    }
}
