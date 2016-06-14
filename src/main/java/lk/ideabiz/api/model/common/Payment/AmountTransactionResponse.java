package lk.ideabiz.api.model.common.Payment;

/**
 * Created by Malinda_07654 on 3/11/2016.
 */
public class AmountTransactionResponse extends AmountTransactionRequest {
    String serverReferenceCode;
    String resourceURL;

    public String getServerReferenceCode() {
        return serverReferenceCode;
    }

    public void setServerReferenceCode(String serverReferenceCode) {
        this.serverReferenceCode = serverReferenceCode;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }
}
