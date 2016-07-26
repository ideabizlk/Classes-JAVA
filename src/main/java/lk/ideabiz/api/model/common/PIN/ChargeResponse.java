package lk.ideabiz.api.model.common.PIN;

/**
 * Created by Malinda_07654 on 7/4/2016.
 */
public class ChargeResponse extends ChargeRequest {
    String status;
    String serverRef;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServerRef() {
        return serverRef;
    }

    public void setServerRef(String serverRef) {
        this.serverRef = serverRef;
    }
}
