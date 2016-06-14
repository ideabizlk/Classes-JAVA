package lk.ideabiz.api.model.common.USSD;

/**
 * Created by Malinda on 7/20/2015.
 */
public class ResponseRequest {
    String id;
    String notifyURL;
    String callbackData;

    public String getNotifyURL() {
        return notifyURL;
    }

    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public ResponseRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseRequest(String notifyURL, String callbackData) {
        this.notifyURL = notifyURL;
        this.callbackData = callbackData;
    }

    public ResponseRequest(String id, String notifyURL, String callbackData) {
        this.id = id;
        this.notifyURL = notifyURL;
        this.callbackData = callbackData;
    }
}

