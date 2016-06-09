package lk.dialog.ideabiz.api.model.common.sms.Inbound;

/**
 * Created by Malinda on 7/10/2015.
 */
public class InboundSMSMessageNotification {
    String callbackData;
    InboundSMSMessage inboundSMSMessage;

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public InboundSMSMessage getInboundSMSMessage() {
        return inboundSMSMessage;
    }

    public void setInboundSMSMessage(InboundSMSMessage inboundSMSMessage) {
        this.inboundSMSMessage = inboundSMSMessage;
    }
}
