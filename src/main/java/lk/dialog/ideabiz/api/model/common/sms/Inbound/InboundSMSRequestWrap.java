package lk.dialog.ideabiz.api.model.common.sms.Inbound;

/**
 * Created by Malinda on 7/10/2015.
 */
public class InboundSMSRequestWrap {
    InboundSMSMessageNotification inboundSMSMessageNotification;

    public InboundSMSMessageNotification getInboundSMSMessageNotification() {
        return inboundSMSMessageNotification;
    }

    public void setInboundSMSMessageNotification(InboundSMSMessageNotification inboundSMSMessageNotification) {
        this.inboundSMSMessageNotification = inboundSMSMessageNotification;
    }
}
