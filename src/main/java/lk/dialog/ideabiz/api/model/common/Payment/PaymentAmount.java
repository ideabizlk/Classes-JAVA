package lk.dialog.ideabiz.api.model.common.Payment;

/**
 * Created by Malinda_07654 on 3/11/2016.
 */
public class PaymentAmount {
    Double amount;
ChargingInformation chargingInformation;
    ChargingMetaData chargingMetaData;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ChargingInformation getChargingInformation() {
        return chargingInformation;
    }

    public void setChargingInformation(ChargingInformation chargingInformation) {
        this.chargingInformation = chargingInformation;
    }

    public ChargingMetaData getChargingMetaData() {
        return chargingMetaData;
    }

    public void setChargingMetaData(ChargingMetaData chargingMetaData) {
        this.chargingMetaData = chargingMetaData;
    }
}
