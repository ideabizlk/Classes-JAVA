package lk.ideabiz.api.model.common.BalanceCheck;

/**
 * Created by Malinda_07654 on 4/4/2017.
 */
public class BalanceCheckResponse {
    String endUserId;
    String referenceCode;
    BalanceCheckAccountInfo accountInfo;

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

    public BalanceCheckAccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(BalanceCheckAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}
