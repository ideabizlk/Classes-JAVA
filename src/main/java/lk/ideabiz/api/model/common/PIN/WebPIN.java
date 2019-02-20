package lk.ideabiz.api.model.common.PIN;

public class WebPIN {
    String txnKey;
    String msisdn;
    String operator;
    String status;

    public String getTxnKey() {
        return txnKey;
    }

    public void setTxnKey(String txnKey) {
        this.txnKey = txnKey;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
