package lk.dialog.ideabiz.api.model.common.Payment;

/**
 * Created by Malinda_07654 on 3/11/2016.
 */
public class AmountTransactionRequest {
    String clientCorrelator;
    String endUserId;
    String referenceCode;
    String transactionOperationStatus;
    PaymentAmount paymentAmount;

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public String getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getTransactionOperationStatus() {
        return transactionOperationStatus;
    }

    public void setTransactionOperationStatus(String transactionOperationStatus) {
        this.transactionOperationStatus = transactionOperationStatus;
    }

    public PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
