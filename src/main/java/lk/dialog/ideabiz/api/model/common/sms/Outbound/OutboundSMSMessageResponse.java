package lk.dialog.ideabiz.api.model.common.sms.Outbound;

import lk.dialog.ideabiz.api.model.common.sms.ReceiptRequest;

import java.util.ArrayList;

/**
 * Created by Malinda on 7/13/2015.
 */
public class OutboundSMSMessageResponse  extends OutboundSMSMessageRequest{

    DeliveryInfoList deliveryInfoList;
    String resourceURL;
    String serverReferenceCode;


    public OutboundSMSMessageResponse() {
    }

    public OutboundSMSMessageResponse(ArrayList<String> address, String message, String senderAddress, String senderName) {
        this.senderAddress = senderAddress;
        this.address = address;
        this.senderName = senderName;
        this.outboundSMSTextMessage = new OutboundSMSTextMessage(message);
        this.receiptRequest = new ReceiptRequest("", "");
    }

    public OutboundSMSMessageResponse(String address, String message, String senderAddress, String senderName) {

        ArrayList<String> addressL = new ArrayList<String>();
        addressL.add(address);

        this.senderAddress = senderAddress;
        this.address = addressL;
        this.senderName = senderName;
        this.outboundSMSTextMessage = new OutboundSMSTextMessage(message);
        this.receiptRequest = new ReceiptRequest("", "");
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public OutboundSMSTextMessage getOutboundSMSTextMessage() {
        return outboundSMSTextMessage;
    }

    public void setOutboundSMSTextMessage(OutboundSMSTextMessage outboundSMSTextMessage) {
        this.outboundSMSTextMessage = outboundSMSTextMessage;
    }

    public ReceiptRequest getReceiptRequest() {
        return receiptRequest;
    }

    public void setReceiptRequest(ReceiptRequest receiptRequest) {
        this.receiptRequest = receiptRequest;
    }

    public DeliveryInfoList getDeliveryInfoList() {
        return deliveryInfoList;
    }

    public void setDeliveryInfoList(DeliveryInfoList deliveryInfoList) {
        this.deliveryInfoList = deliveryInfoList;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public String getServerReferenceCode() {
        return serverReferenceCode;
    }

    public void setServerReferenceCode(String serverReferenceCode) {
        this.serverReferenceCode = serverReferenceCode;
    }
}

