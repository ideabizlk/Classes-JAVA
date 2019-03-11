package lk.ideabiz.api.model.common.PIN;

public class PINMeta {
    String PINRef;
    String PINType; //REG,VERIFY,CHARGE
    String client; //WEB,MOBILE
    String device ; //DESKTOP, iPhone, Android
    String version; //Android version, Browser
    String appCode; //com.dialog.llll
    String headers; // any optional headers
    String remoteRef;// User info in remote app
    String utmSource; //User source
    String IP; //User source

    public String getPINRef() {
        return PINRef;
    }

    public void setPINRef(String PINRef) {
        this.PINRef = PINRef;
    }

    public String getPINType() {
        return PINType;
    }

    public void setPINType(String PINType) {
        this.PINType = PINType;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getRemoteRef() {
        return remoteRef;
    }

    public void setRemoteRef(String remoteRef) {
        this.remoteRef = remoteRef;
    }
}
