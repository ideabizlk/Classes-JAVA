package lk.dialog.ideabiz.api.model.common.Payment;

/**
 * Created by Malinda_07654 on 3/11/2016.
 */
public class ChargingInformation {
    ChargingInformation chargingInformation;
    Double amount;
    String currency;
    String description;

    public ChargingInformation getChargingInformation() {
        return chargingInformation;
    }

    public void setChargingInformation(ChargingInformation chargingInformation) {
        this.chargingInformation = chargingInformation;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
