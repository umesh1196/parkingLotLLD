package models;

public class Payment extends BaseModel{

    private PaymentMode paymentMode;

    private double amount;

    private String transactionId;

    private PaymentStatus paymnetStatus;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getPaymnetStatus() {
        return paymnetStatus;
    }

    public void setPaymnetStatus(PaymentStatus paymnetStatus) {
        this.paymnetStatus = paymnetStatus;
    }
}
