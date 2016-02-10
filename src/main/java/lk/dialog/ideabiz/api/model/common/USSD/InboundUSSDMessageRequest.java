package lk.dialog.ideabiz.api.model.common.USSD;

/**
 * Created by Malinda on 9/7/2015.
 */
public class InboundUSSDMessageRequest {
    String address;
    String sessionID;
    String shortCode;
    String keyword;
    String inboundUSSDMessage;
    String clientCorrelator;
    ResponseRequest responseRequest;
    String ussdAction;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getInboundUSSDMessage() {
        return inboundUSSDMessage;
    }

    public void setInboundUSSDMessage(String inboundUSSDMessage) {
        this.inboundUSSDMessage = inboundUSSDMessage;
    }

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public ResponseRequest getResponseRequest() {
        return responseRequest;
    }

    public void setResponseRequest(ResponseRequest responseRequest) {
        this.responseRequest = responseRequest;
    }

    public String getUssdAction() {
        return ussdAction;
    }

    public void setUssdAction(String ussdAction) {
        this.ussdAction = ussdAction;
    }

    public InboundUSSDMessageRequest() {
        responseRequest = new ResponseRequest();
    }
}
