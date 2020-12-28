public class BillingAccount {
    String creditCardNumber;
    double totalAmount;
    double maxAmount;

    public void updateTotalAmount(double delta){
        this.totalAmount+=delta;
    }
}

