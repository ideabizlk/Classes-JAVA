package lk.dialog.ideabiz.api.model.common.sms;

/**
 * Created by Malinda on 7/13/2015.
 */
public class OutboundSMSMessagingRequestWrap {
    OutboundSMSMessageRequest outboundSMSMessageRequest;

    public OutboundSMSMessagingRequestWrap() {
    }

    public OutboundSMSMessagingRequestWrap(OutboundSMSMessageRequest outboundSMSMessageRequest) {
        this.outboundSMSMessageRequest = outboundSMSMessageRequest;
    }

    public OutboundSMSMessageRequest getOutboundSMSMessageRequest() {
        return outboundSMSMessageRequest;
    }

    public void setOutboundSMSMessageRequest(OutboundSMSMessageRequest outboundSMSMessageRequest) {
        this.outboundSMSMessageRequest = outboundSMSMessageRequest;
    }
}
