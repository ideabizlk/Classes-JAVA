package lk.dialog.ideabiz.api.model.common.sms.Outbound;

/**
 * Created by Malinda on 7/13/2015.
 */
public class OutboundSMSMessagingResponseWrap {
    OutboundSMSMessageResponse outboundSMSMessageRequest;

    public OutboundSMSMessagingResponseWrap() {
    }

    public OutboundSMSMessageResponse getOutboundSMSMessageRequest() {
        return outboundSMSMessageRequest;
    }

    public void setOutboundSMSMessageRequest(OutboundSMSMessageResponse outboundSMSMessageRequest) {
        this.outboundSMSMessageRequest = outboundSMSMessageRequest;
    }
}
